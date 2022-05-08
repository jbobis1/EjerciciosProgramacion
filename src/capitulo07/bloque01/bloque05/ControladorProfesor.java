package capitulo07.bloque01.bloque05;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ControladorProfesor extends SupertipoGestion{

	/**
	 * 
	 * @return
	 */
	
	public static Profesor mostarPrimerProfesorProfesor() {
		return findProfesor("select * from profesor order by id limit 1");   
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static Profesor mostarUltimoProfesor() {
		return findProfesor("select * from profesor order by id desc limit 1");	   
	}
	
	/**
	 * 
	 */
	
	public static Profesor mostarmasuno(int idActual) {
		return findProfesor("select * from profesor where id > " + idActual  + "  order by id limit 1");
	}
	
	/**
	 * 
	 */
	
	public static Profesor mostarmenosuno(int idActual) {
		return findProfesor("select * from profesor where id < " + idActual + " order by id desc limit 1");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	
	public static  Profesor findProfesor(String sql) {
		Profesor f = null;
		try {
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
				f= new Profesor (rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1"), 
						rs.getString("apellido2"), rs.getString("Dni"), rs.getString("Direccion"), 
						rs.getString("email"),rs.getString("telefono"), rs.getInt("tipologiasexo_id"), rs.getBytes("imagen"),rs.getString("color"));			
				}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int guardar(Profesor f) {
		if( f.getId()== 0) {
			return nuevoProfesor(f);
		}
		else {
			return modificarprofesor(f);
		}
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int modificarprofesor (Profesor f) {
		int registrosAfectados = 0;
		try {
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(
					"update profesor set nombre = ?, apellido1 = ?, apellido2 = ?, dni = ?, direccion = ?, email = ?, "
					+ " telefono = ?, tipologiasexo_id = ?, imagen = ?, color = ? where id = ?");
			ps.setString(1, f.getNombre());
			ps.setString(2, f.getApellido1());
			ps.setString(3, f.getApellido2());
			ps.setString(4, f.getDni());
			ps.setString(5, f.getDireccion());
			ps.setString(6, f.getEmail());
			ps.setString(7, f.getTelefono());
			ps.setInt(8, f.getTipologiasexo_id());
			ps.setBytes(9, f.getImagen());
			ps.setString(10, f.getColor());
			ps.setInt(11, f.getId());
			registrosAfectados = ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return registrosAfectados;	
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int nuevoProfesor(Profesor f) {
		int registrosAfectados = 0;
		try {
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(
					"insert into profesor (id, nombre, apellido1, apellido2, dni, direccion, email, telefono, tipologiasexo_id, imagen, color) "
							+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			f.setId(siguienteIdEntabla("profesor"));
			
			ps.setInt(1, f.getId());
			ps.setString(2, f.getNombre());
			ps.setString(3, f.getApellido1());
			ps.setString(4, f.getApellido2());
			ps.setString(5, f.getDni());
			ps.setString(6, f.getDireccion());
			ps.setString(7, f.getEmail());
			ps.setString(8, f.getTelefono());
			ps.setInt(9, f.getTipologiasexo_id());
			ps.setBytes(10, f.getImagen());
			ps.setString(11, f.getColor());
			registrosAfectados = ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

	

	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int eliminar(Profesor f) {
		int reguistrosAfectado = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement();

			reguistrosAfectado =s.executeUpdate("delete from profesor where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistrosAfectado;
	}
}