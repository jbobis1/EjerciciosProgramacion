package capitulo07.bloque01.bloque05;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
				f= new Estudiante (rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1"), rs.getString("apellido2"), rs.getString("Dni"), rs.getString("Direccion"), rs.getString("email"),rs.getString("telefono"));			
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

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			reguistros =s.executeUpdate(
						
				
				"update estudiante set nombre='" + f.getNombre() + "', apellido1='" + f.getApellido1() + "', " 
						 + " apellido2='" + f.getApellido2() + "', " + " dni='" + f.getDni() + "', " 
						 + " direccion='" + f.getDireccion()  + "', " + " email='" + f.getEmail() + "', " + " telefono='" + f.getTelefono()+ "' "+ 
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
	
	public static int nuevoEstudiante(Estudiante f) {
		int cantidadRegistrosModificados = 0;
		int nuevoIdDisponible =0;
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			 f.setId(siguienteIdEntabla("estudiante"));
			 
			 nuevoIdDisponible = siguienteIdEntabla("estudiante");
			 if(nuevoIdDisponible != -1) {
				 cantidadRegistrosModificados =

//
//					s.executeUpdate("insert into estudiante values (" 
//							 + nuevoIdDisponible + ",'" + f.getNombre() + ",'" + f.getApellido1() + ",'" + f.getApellido2() 
//							 + ",'" + f.getDireccion() + ",'" + f.getDni() + ",'" + f.getEmail() + ",'" + f.getTelefono()  + "')");
//				 
				 
				 s.executeUpdate(					 
							"insert into estudiante values (" + nuevoIdDisponible + ",'" + f.getNombre() + "', '" + f.getApellido1() 
							+ "', '" + f.getApellido2() + "', '" + f.getDireccion() +  "', '" +  f.getDni() + "', '" + f.getEmail() 
							+ "', '" + f.getTelefono()+ "')");



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
