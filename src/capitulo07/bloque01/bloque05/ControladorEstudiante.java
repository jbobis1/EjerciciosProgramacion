package capitulo07.bloque01.bloque05;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

public class ControladorEstudiante extends SupertipoGestion{


	/**
	 * 
	 * @return
	 */
	
	

	
	public static Estudiante mostarPrimerEstudiante() {
		return findEstudiante("select * from estudiante order by id limit 1");   
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static Estudiante mostarUltimoEstudiante() {
		return findEstudiante("select * from estudiante order by id desc limit 1");	   
	}
	
	/**
	 * 
	 */
	
	public static Estudiante mostarmasuno(int idActual) {
		return findEstudiante("select * from estudiante where id > " + idActual  + "  order by id limit 1");
	}
	
	/**
	 * 
	 */
	
	public static Estudiante mostarmenosuno(int idActual) {
		return findEstudiante("select * from estudiante where id < " + idActual + " order by id desc limit 1");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	
	public static  Estudiante findEstudiante(String sql) {
		Estudiante f = null;
		try {
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
				f= new Estudiante (rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1"), rs.getString("apellido2"), 
						rs.getString("Dni"), rs.getString("Direccion"), rs.getString("email"),
						rs.getString("telefono"), rs.getInt("Tipologiasexo_id"),rs.getBytes("imagen"), rs.getString("color"));			
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
	
	public static int guardar(Estudiante f) {
		if( f.getId()== 0) {
			return nuevoEstudiante(f);
		}
		else {
			return modificarEstudiante(f);
		}
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int modificarEstudiante (Estudiante f) {
		int reguistros = 0;
		try {

			PreparedStatement ps =  ConnectionManager.getConexion().prepareStatement(
					"update estudiante set nombre = ?, apellido1= ?, apellido2= ?, Dni= ?,"
					+ " Direccion= ?, email= ?, telefono= ?,  Tipologiasexo_id= ?, imagen= ?,"
					+ "where id =?");
			ps.setString(1, f.getNombre());
			ps.setString(2, f.getApellido1());
			ps.setString(3, f.getApellido2());
			ps.setString(5, f.getDni());
			ps.setString(5, f.getDireccion());
			ps.setString(6, f.getEmail());
			ps.setString(7, f.getTelefono());
			ps.setInt(8, f.getTipologiasexo_id());
			ps.setInt(9, f.getId());

			
						
			reguistros = ps.executeUpdate();


		}catch (SQLException ex) {
			ex.printStackTrace();
		}
		return reguistros;
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int nuevoEstudiante(Estudiante f) {
		int cantidadRegistrosModificados = 0;
		int nuevoIdDisponible =0;
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			 f.setId(siguienteIdEntabla("estudiante"));
			 
			 nuevoIdDisponible = siguienteIdEntabla("estudiante");
			 if(nuevoIdDisponible != -1) {
				 cantidadRegistrosModificados =

			 
				 
				 s.executeUpdate(					 
							"insert into estudiante values (" + nuevoIdDisponible + ",'" + f.getNombre() + "', '" + f.getApellido1() 
							+ "', '" + f.getApellido2() + "', '" + f.getDireccion() +  "', '" +  f.getDni() + "', '" + f.getEmail() 
							+ "', '" + f.getTelefono()+ "', '" + f.getTipologiasexo_id() + "', '" + f.getImagen() + "', '" + f.getColor()+ "')");



			 }

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return cantidadRegistrosModificados;
	}


	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int eliminar(Estudiante f) {
		int reguistrosAfectado = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement();

			reguistrosAfectado =s.executeUpdate("delete from estudiante where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistrosAfectado;
	}

}
