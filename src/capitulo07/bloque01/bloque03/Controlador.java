package capitulo07.bloque01.bloque03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

import capitulo07.bloque01.bloque02.ConnectionManager;

public class Controlador extends SupertipoGestion  {


	/**
	 * 
	 * @return
	 */
	public static Fabricante mostarPrimerFabricante() {
		return findFabricante("select * from fabricante order by id limit 1");
		   
	}
	
	/**
	 * 
	 * @return
	 */
	public static Fabricante mostarUltimoFabricante() {
		return findFabricante("select * from fabricante order by id desc limit 1");
		   
	}
	
	/**
	 * 
	 */
	public static Fabricante mostarmasuno(int idActual) {
		return findFabricante("select * from fabricante where id > " + idActual  + "  order by id limit ");
	}
	
	/**
	 * 
	 */
	
	public static Fabricante mostarmenosuno(int idActual) {
		return findFabricante("select * from fabricante where id < " + idActual + " order by id desc limit 11");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static  Fabricante findFabricante(String sql) {
		
		Fabricante f = null;
		try {
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
				f= new Fabricante (rs.getInt("id"), rs.getString("cif"), rs.getString("nombre"));			}
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
	
	public static int guardar(Fabricante f) {
		if( f.getId()== 0) {
			return nuevo(f);
		}
		else {
			return modificarFabricante(f);
		}
		
	}
	
	public  static int  modificarFabricante (Fabricante f) {
		int reguistros = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

				s.executeUpdate(
							"update fabricante set cif='" + f.getCif() + "', nombre='" + f.getNombre() + "' " +
						"where id=" + f.getId());
			
			

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	return reguistros;
	}
	
	
	public static void  nuevo (Fabricante f) {
	
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			 f.setId(siguienteIdEntabla("fabricante"));
			 nuevoIdDisponible = siguienteIdEntabla("fabricante");
			 if(nuevaIdDisponible != -1) {
				 int reguitro =
				s.executeUpdate(
			"insert into fabricante values=("+ nuevaIdDisponible()+",'" + f.getCif() + "', nombre='" + f.getNombre());
				 System.out.println("resguitros insertado" + reguitro );
					
			 }

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	
	}




	
}


