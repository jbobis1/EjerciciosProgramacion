package capitulo07.bloque01.bloque04;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import capitulo07.bloque01.bloque02.ConnectionManager;

public class ControladorConsesinario extends SupertipoGestion{


	/**
	 * 
	 * @return
	 */
	
	public static Consesionario mostarPrimerFabricante() {
		return findconcesionario("select * from concesionario order by id limit 1");   
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static Consesionario mostarUltimoFabricante() {
		return findconcesionario("select * from concesionario order by id desc limit 1");	   
	}
	
	/**
	 * 
	 */
	
	public static Consesionario mostarmasuno(int idActual) {
		return findconcesionario("select * from concesionario where id > " + idActual  + "  order by id limit 1");
	}
	
	/**
	 * 
	 */
	
	public static Consesionario mostarmenosuno(int idActual) {
		return findconcesionario("select * from concesionario where id < " + idActual + " order by id desc limit 1");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	
	public static  Consesionario findconcesionario(String sql) {
		Consesionario f = null;
		try {
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
				f= new Consesionario (rs.getInt("id"), rs.getString("cif"), rs.getString("nombre"), rs.getString("localidad"));			}
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
	
	public static int guardarConsesionario(Consesionario f) {
		if( f.getId()== 0) {
			return nuevo(f);
		}
		else {
			return modificarConsesionario(f);
		}
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int modificarConsesionario(Consesionario f) {
		int reguistros = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

				s.executeUpdate(
				"update concesionario set cif='" + f.getCif() + "', nombre='" + f.getNombre() + "', " + " localidad='" + f.getLocalidad() + "' " +
				"where id=" +  f.getId());
				
				
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
	
	public static int nuevo(Consesionario f) {
		int nuevoIdDisponible =0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			 f.setId(siguienteIdEntabla("concesionario"));
			 nuevoIdDisponible = siguienteIdEntabla("concesionario");
			 if(nuevoIdDisponible != -1) {
				 int reguistro =
				s.executeUpdate("insert into concesionario values (" 
				 + nuevoIdDisponible + ",'" + f.getCif() + "', '" + f.getNombre() + "')");

				 System.out.println("resguitros insertado" + reguistro );	
			 }

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return nuevoIdDisponible;
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int eliminarConsesionario(Consesionario f) {
		int reguistrosAfectado = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement();

			s.executeUpdate("delete from concesionario where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistrosAfectado;
	}

}
