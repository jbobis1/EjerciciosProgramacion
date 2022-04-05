package capitulo07.bloque01.bloque04;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import capitulo07.bloque01.bloque02.ConnectionManager;

public class ControladorCliente extends SupertipoGestion {
		
		/**
		 * 
		 * @return
		 */
		
		public static Cliente mostarPrimerCliente() {
			return findCliente("select * from cliente order by id limit 1");   
		}
		
		/**
		 * 
		 * @return
		 */
		
		public static Cliente mostarUltimoCliente() {
			return findCliente("select * from cliente order by id desc limit 1");	   
		}
		
		/**
		 * 
		 */
		
		public static Cliente mostarmasuno(int idActual) {
			return findCliente("select * from cliente where id > " + idActual  + "  order by id limit 1");
		}
		
		/**
		 * 
		 */
		
		public static Cliente mostarmenosuno(int idActual) {
			return findCliente("select * from cliente where id < " + idActual + " order by id desc limit 1");
		}
		
		/**
		 * 
		 * @param sql
		 * @return
		 */
		
		public static  Cliente findCliente(String sql) {
			Cliente f = null;
			try {
				
				// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
				// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
				ResultSet rs = s.executeQuery (sql);
			   
				// Navegación del objeto ResultSet
				if (rs.next()) { 
					f= new Cliente (rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"),  rs.getString("localidad"),rs.getString("dni"), rs.getString("fecha"), rs.getBoolean("activo"));			}
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
		
		public static int guardar(Cliente f) {
			if( f.getId()== 0) {
				return nuevo(f);
			}
			else {
				return modificarCliente(f);
			}			
		}
		
		/**
		 * 
		 * @param f
		 * @return
		 */
		
		public static int modificarCliente (Cliente f) {
			int reguistros = 0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 

					s.executeUpdate(
						
					"update cliente set nombre='" + f.getNombre() + "', apellidos='" + f.getApellidos() + "', " 
					  + " localidad='" + f.getLocalidad() + "', " + " dniNie='" + f.getDni() + "', " 
					  + " fechaNac='" + f.getFecha().toString()  + "', " + " activo='" + f.isActivo() + "' "+ 
					  "where id=" + f.getId());

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
		
		public static int nuevo(Cliente f) {
			int nuevoIdDisponible =0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				 f.setId(siguienteIdEntabla("cliente"));
				 nuevoIdDisponible = siguienteIdEntabla("cliente");
				 if(nuevoIdDisponible != -1) {
					 int reguitro =
					s.executeUpdate(					 
						"insert into cliente values (" + nuevoIdDisponible + ",'" + f.getNombre() + "', '" + f.getApellidos() 
						+ "', '" + f.getLocalidad() + "', '" + f.getDni() +  "', '" +  f.getFecha().toString()+ "', '" + f.isActivo() + "')");


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
		
		public static int eliminar(Cliente f) {
			int reguistrosAfectado = 0;
			try {

				Statement s = (Statement) ConnectionManager.getConexion().createStatement();

				s.executeUpdate("delete from cliente where id=" + f.getId());

			}catch (SQLException ex) {
				System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
				ex.printStackTrace();
			}
			return reguistrosAfectado;
		}

}
