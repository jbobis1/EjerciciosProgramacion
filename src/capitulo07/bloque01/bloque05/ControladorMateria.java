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
		return findMateria("select * from Materia order by id limit 1");   
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static Materia mostarUltimoMateria() {
		return findMateria("select * from Materia order by id desc limit 1");	   
	}
	
	/**
	 * 
	 */
	
	public static Materia mostarmasuno(int idActual) {
		return findMateria("select * from Materia where id > " + idActual  + "  order by id limit 1");
	}
	
	/**
	 * 
	 */
	
	public static Materia mostarmenosuno(int idActual) {
		return findMateria("select * from Materia where id < " + idActual + " order by id desc limit 1");
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
				f= new Materia (rs.getInt("id"), rs.getString("nombre"),rs.getString("acronimo"),rs.getInt("idCurso"));			
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
		int reguistros = 0;
		try {

			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

				s.executeUpdate(
				
				"update coche set nombre='" + f.getNombre() + "', acronimo='" + f.getAcronimo() 
				 + "'," + " curso_id='" + f.getIdCurso()  + "where id=" + f.getId());

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
	
	public static int nuevoMateria(Materia f) {
		int nuevoIdDisponible =0;
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

			 f.setId(siguienteIdEntabla("Materia"));
			 
			 nuevoIdDisponible = siguienteIdEntabla("Materia");
			 if(nuevoIdDisponible != -1) {
				 int reguistro =

	
				s.executeUpdate(
					"insert into Materia values (" + nuevoIdDisponible + ",'" + f.getNombre()  + "', '" + f.getAcronimo() + "', '" + f.getIdCurso()+"')");

				 System.out.println("resguitros insertado" + reguistro );	
			 }

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return nuevoIdDisponible;
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

			s.executeUpdate("delete from Materia where id=" + f.getId());

		}catch (SQLException ex) {
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return reguistrosAfectado;
	}
}
