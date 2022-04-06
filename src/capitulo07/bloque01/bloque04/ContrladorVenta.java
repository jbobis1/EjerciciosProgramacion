package capitulo07.bloque01.bloque04;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import capitulo07.bloque01.bloque02.ConnectionManager;

public class ContrladorVenta extends SupertipoGestion{

		/**
		 * 
		 * @return
		 */
		
		public static Venta mostarPrimerFabricante() {
			return findVenta("select * from venta order by id limit 1");   
		}
		
		/**
		 * 
		 * @return
		 */
		
		public static Venta mostarUltimoFabricante() {
			return findVenta("select * from venta order by id desc limit 1");	   
		}
		
		/**
		 * 
		 */
		
		public static Venta mostarmasuno(int idActual) {
			return findVenta("select * from venta where id > " + idActual  + "  order by id limit 1");
		}
		
		/**
		 * 
		 */
		
		public static Venta mostarmenosuno(int idActual) {
			return findVenta("select * from venta where id < " + idActual + " order by id desc limit 1");
		}
		
		/**
		 * 
		 * @param sql
		 * @return
		 */
		
		public static  Venta findVenta(String sql) {
			Venta f = null;
			try {
				
				// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
				// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
				ResultSet rs = s.executeQuery (sql);
			   
				// Navegación del objeto ResultSet
				if (rs.next()) { 
					f= new Venta (rs.getInt("id"), rs.getInt("idCliente"), rs.getInt("idConcesionario"), rs.getInt("idCoche"), rs.getString("fecha"), rs.getString("precio"));			
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
		
		public static int guardar(Venta f) {
			if( f.getId()== 0) {
				return nuevo(f);
			}
			else {
				return modificarVenta(f);
			}
			
		}
		
		/**
		 * 
		 * @param f
		 * @return
		 */
		
		public static int modificarVenta (Venta f) {
			int reguistros = 0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

					s.executeUpdate(
	
					"update venta set idCliente='" + f.getIdCliente() + "', idConcesionario='" + f.getIdConcesionario() + "', " 
					  + " idCoche='" + f.getIdCoche() + "', " + " fecha='" + f.getFecha()  + "', " + " precioVenta='" 
					  + f.getPrecio() + "' "+ "where id=" + f.getId());
					

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
		
		public static int nuevo(Venta f) {
			int nuevoIdDisponible =0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				 f.setId(siguienteIdEntabla("venta"));
				 nuevoIdDisponible = siguienteIdEntabla("venta");
				 if(nuevoIdDisponible != -1) {
					 int reguitro =
					s.executeUpdate("insert into venta values (" + nuevoIdDisponible + ",'" + f.getIdCliente() + "', '" + f.getIdConcesionario() + "', '" 
					 + f.getIdCoche() + "', '" +  f.getFecha()+ "', '" + f.getPrecio() + "')");

					 
					 System.out.println("resguitros insertado" + reguitro );	
				 }

			}catch (SQLException ex) {
				System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
				ex.printStackTrace();
			}
			return nuevoIdDisponible;
		}

		
		public static List<Cliente> obtenerTodosLosClientes() {
			List<Cliente> lista = new ArrayList<Cliente>();
			
			try {
				// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
				// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
				ResultSet rs = s.executeQuery ("select * from cliente");
			   
				// Navegación del objeto ResultSet
				while (rs.next()) { 
					
					Cliente f =new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"),  rs.getString("localidad"),rs.getString("dni"), rs.getString("fecha"), rs.getBoolean("activo"));			}
				// Cierre de los elementos

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
		
		public static int eliminar(Venta f) {
			int reguistrosAfectado = 0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement();

				s.executeUpdate("delete from venta where id=" + f.getId());

			}catch (SQLException ex) {
				System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
				ex.printStackTrace();
			}
			return reguistrosAfectado;
		}
}
