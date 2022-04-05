package capitulo07.bloque01.bloque04;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

import capitulo07.bloque01.bloque02.ConnectionManager;

public class Controlador extends SupertipoGestion {
	
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
		return findFabricante("select * from fabricante where id > " + idActual  + "  order by id limit 1");
	}
	
	/**
	 * 
	 */
	
	public static Fabricante mostarmenosuno(int idActual) {
		return findFabricante("select * from fabricante where id < " + idActual + " order by id desc limit 1");
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
				f= new Fabricante (rs.getInt("id"), rs.getString("cif"), rs.getString("nombre"));			
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
	
	public static int guardar(Fabricante f) {
		if( f.getId()== 0) {
			return nuevo(f);
		}
		else {
			return modificarFabricante(f);
		}
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int modificarFabricante (Fabricante f) {
		int reguistros = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

				s.executeUpdate(
							"update fabricante set cif='" 
									+ f.getCif() + "', nombre='" + f.getNombre() + "' " + "where id=" + f.getId());

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
	
	public static int nuevo(Fabricante f) {
		int nuevoIdDisponible =0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			 f.setId(siguienteIdEntabla("fabricante"));
			 nuevoIdDisponible = siguienteIdEntabla("fabricante");
			 if(nuevoIdDisponible != -1) {
				 int reguitro =
				s.executeUpdate("insert into fabricante values (" 
				 + nuevoIdDisponible + ",'" + f.getCif() + "', '" + f.getNombre() + "')");

				 System.out.println("resguitros insertado" + reguitro );	
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
	
	public static int eliminar(Fabricante f) {
		int reguistrosAfectado = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement();

			s.executeUpdate("delete from fabricante where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistrosAfectado;
	}
}
