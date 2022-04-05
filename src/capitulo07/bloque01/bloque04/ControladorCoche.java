package capitulo07.bloque01.bloque04;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import capitulo07.bloque01.bloque02.ConnectionManager;

public class ControladorCoche extends SupertipoGestion{

	
		/**
		 * 
		 * @return
		 */
		
		public static Coche mostarPrimerCoche() {
			return findCoche("select * from coche order by id limit 1");   
		}
		
		/**
		 * 
		 * @return
		 */
		
		public static Coche mostarUltimoCoche() {
			return findCoche("select * from coche order by id desc limit 1");	   
		}
		
		/**
		 * 
		 */
		
		public static Coche mostarmasuno(int idActual) {
			return findCoche("select * from coche where id > " + idActual  + "  order by id limit 1");
		}
		
		/**
		 * 
		 */
		
		public static Coche mostarmenosuno(int idActual) {
			return findCoche("select * from coche where id < " + idActual + " order by id desc limit 1");
		}
		
		/**
		 * 
		 * @param sql
		 * @return
		 */
		
		public static  Coche findCoche(String sql) {
			Coche f = null;
			try {
				
				// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
				// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
				ResultSet rs = s.executeQuery (sql);
			   
				// Navegación del objeto ResultSet
				if (rs.next()) { 
					f= new Coche (rs.getInt("id"), rs.getInt("idfabricante"), rs.getString("bastidor"), rs.getString("modelo"), rs.getString("color"));			
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
		
		public static int guardar(Coche f) {
			if( f.getId()== 0) {
				return nuevo(f);
			}
			else {
				return modificarcoche(f);
			}
			
		}
		
		/**
		 * 
		 * @param f
		 * @return
		 */
		
		public static int modificarcoche (Coche f) {
			int reguistros = 0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

					s.executeUpdate(
			
					
					"update coche set idfabricante='" + f.getIdFabricante() + "', bastidor='" + f.getBastidor() 
					 + "'," + " modelo='" + f.getModelo() + "', " +" color='" + f.getColor() + "' " + "where id=" + f.getId());

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
		
		public static int nuevo(Coche f) {
			int nuevoIdDisponible =0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				 f.setId(siguienteIdEntabla("coche"));
				 nuevoIdDisponible = siguienteIdEntabla("coche");
				 if(nuevoIdDisponible != -1) {
					 int reguitro =
					s.executeUpdate(
						"insert into coche values (" + nuevoIdDisponible + ",'" + f.getIdFabricante() + "', '" + f.getBastidor() + "', '" + f.getModelo() + "', '" + f.getColor() + "')");

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
		
		public static int eliminar(Coche f) {
			int reguistrosAfectado = 0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement();

				s.executeUpdate("delete from coche where id=" + f.getId());

			}catch (SQLException ex) {
				System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
				ex.printStackTrace();
			}
			return reguistrosAfectado;
		}
}
