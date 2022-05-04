package capitulo07.bloque01.bloque05;

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
						rs.getString("email"),rs.getString("telefono"), rs.getInt("tipologiasexo_id"), rs.getBytes("imagen"));			
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
		int reguistros = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			reguistros =s.executeUpdate(
						
				
				"update profesor set nombre='" + f.getNombre() + "', apellido1='" + f.getApellido1() + "', " 
						 + " apellido2='" + f.getApellido2() + "', " + " dni='" + f.getDni() + "', " 
						 + " direccion='" + f.getDireccion()  + "', " + " email='" + f.getEmail() 
						 + "', " + " telefono='" + f.getTelefono()+ "' "+  " tipologiasexo_id='" + f.getTipologiasexo_id() + "' "+  " imagen='" + f.getImagen()+ "' "+ 
						 "where id=" + f.getId());
					
//				"update estudiante set descripcion='" 
//				+ f.getDescripcion() +  "' " + "where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistros;
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int nuevoProfesor(Profesor f) {
		int cantidadRegistrosModificados = 0;
		int nuevoIdDisponible =0;
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			 f.setId(siguienteIdEntabla("profesor"));
			 
			 nuevoIdDisponible = siguienteIdEntabla("profesor");
			 if(nuevoIdDisponible != -1) {
				 cantidadRegistrosModificados =

				 
				 s.executeUpdate(					 
							"insert into profesor values (" + nuevoIdDisponible + ",'" + f.getNombre() + "', '" + f.getApellido1() 
							+ "', '" + f.getApellido2() + "', '" + f.getDireccion() +  "', '" +  f.getDni() + "', '" + f.getEmail() 
							+ "', '" + f.getTelefono()+ "', '" + f.getTipologiasexo_id()+ "', '" + f.getImagen()+ "')");



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