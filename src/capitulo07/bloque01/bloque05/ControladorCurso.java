package capitulo07.bloque01.bloque05;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo07.bloque01.bloque02.ConnectionManager;
import capitulo07.bloque01.bloque04.Coche;
import capitulo07.bloque01.bloque04.Fabricante;
import capitulo07.bloque01.bloque04.SupertipoGestion;

public class ControladorCurso extends SupertipoGestion{

	/**
	 * 
	 * @return
	 */
	
	public static Curso mostarPrimercurso() {
		return findcurso("select * from curso order by id limit 1");   
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static Curso mostarUltimocurso() {
		return findcurso("select * from curso order by id desc limit 1");	   
	}
	
	/**
	 * 
	 */
	
	public static Curso mostarmasuno(int idActual) {
		return findcurso("select * from curso where id > " + idActual  + "  order by id limit 1");
	}
	
	/**
	 * 
	 */
	
	public static Curso mostarmenosuno(int idActual) {
		return findcurso("select * from curso where id < " + idActual + " order by id desc limit 1");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	
	public static  Curso findcurso(String sql) {
		Curso f = null;
		try {
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
				f= new Curso (rs.getInt("id"), rs.getString("descripcion"));			
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
	
	public static int guardar(Curso f) {
		if( f.getId()== 0) {
			return nuevoCurso(f);
		}
		else {
			return modificarCurso(f);
		}
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int modificarCurso (Curso f) {
		int reguistros = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

				s.executeUpdate(
		
				
				"update curso set Descripcion='" + f.getDescripcion() +  "where id=" + f.getId());

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
	
	public static int nuevoCurso(Curso f) {
		int nuevoIdDisponible =0;
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			 f.setId(siguienteIdEntabla("Curso"));
			 
			 nuevoIdDisponible = siguienteIdEntabla("Curso");
			 if(nuevoIdDisponible != -1) {
				 int reguistro =

	
				s.executeUpdate(
					"insert into curso values (" + nuevoIdDisponible + ",'" + f.getDescripcion() + "')");

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
	
	public static int eliminar(Curso f) {
		int reguistrosAfectado = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement();

			s.executeUpdate("delete from curso where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistrosAfectado;
	}
}


