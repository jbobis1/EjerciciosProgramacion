package capitulo07.bloque01.bloque05;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ControladorMateria extends SupertipoGestion {

	/**
	 * 
	 * @return
	 */
	
	public static Materia mostarPrimerMateria() {
		return findMateria("select * from materia order by id limit 1");   
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static Materia mostarUltimoMateria() {
		return findMateria("select * from materia order by id desc limit 1");	   
	}
	
	/**
	 * 
	 */
	
	public static Materia mostarmasuno(int idActual) {
		return findMateria("select * from materia where id > " + idActual  + "  order by id limit 1");
	}
	
	/**
	 * 
	 */
	
	public static Materia mostarmenosuno(int idActual) {
		return findMateria("select * from materia where id < " + idActual + " order by id desc limit 1");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	
	public static  Materia findMateria(String sql) {
		Materia f = null;
		try {
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) { 
				f= new Materia (rs.getInt("id"), rs.getString("nombre"),rs.getString("acronimo"),rs.getInt("curso_id"));			
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
	
	public static int guardar(Materia f) {
		if( f.getId()== 0) {
			return nuevoMateria(f);
		}
		else {
			return modificarMateria(f);
		}
		
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int modificarMateria (Materia f) {
		int cantidadRegistrosModificados = 0;
		int reguistros = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			cantidadRegistrosModificados = s.executeUpdate(
				

			
			"update materia set nombre='" + f.getNombre() + "', acronimo='" + f.getAcronimo() 
			 + "'," + " curso_id='" + f.getCurso_id() +  "' " + "where id=" + f.getId());

		}catch (SQLException ex) {
			
			ex.printStackTrace();
		}
		return cantidadRegistrosModificados;
	}
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int nuevoMateria(Materia f) {
		int nuevoIdDisponible =0;
		 int reguistro =0;
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			 f.setId(siguienteIdEntabla("materia"));
			 
			 nuevoIdDisponible = siguienteIdEntabla("materia");
			 if(nuevoIdDisponible != -1) {
				  reguistro =

	
				s.executeUpdate(
					"insert into materia values (" + nuevoIdDisponible + ",'" + f.getNombre()  + "', '" + f.getAcronimo() + "', '" + f.getCurso_id()+"')");

				 System.out.println("resguitros insertado" + reguistro );	
			 }

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistro;
	}

	
	
	public static List<Curso> obtenerTodosLosCurso() {
		List<Curso> lista = new ArrayList<Curso>();
		
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from centroeducativo.curso");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				Curso f= new Curso (rs.getInt("id"), rs.getString("descripcion"));
				lista.add(f);
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		return lista;
	}
	
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	
	public static int eliminar(Materia f) {
		int reguistrosAfectado = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement();

			reguistrosAfectado =s.executeUpdate("delete from materia where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistrosAfectado;
	}
}
