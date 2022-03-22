package capitulo07.bloque01.bloque02;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionarVentas extends SupertipoGestion{


	public static void eliminarVentas() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Introduce id del venta para su eliminacion: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate(
					"delete from venta where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 */
	public static void modificarVentas () {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String idCliente= "", idConcesionario= "", idCoche= "",  precioVenta= "", fechaNueva=""  ;
		String nuevoidCliente= "", nuevoidConcesionario= "", nuevoidCoche= "", nuevofechausuario= "", nuevoprecioVenta= "" ;
	
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Date fechaNac = new Date();
		
		
		System.out.println("Introduce id del venta: ");
		id = sc.nextInt();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from venta where id=" + id);
			if (rs.next()) {
				idCliente = rs.getString("idCliente");
				idConcesionario = rs.getString("idConcesionario");
				idCoche = rs.getString("idCoche");
				fechaNac = rs.getDate("fecha");
				precioVenta = rs.getString("precioVenta");
				
			}
			
			nuevoidCliente = JOptionPane.showInputDialog("idCliente (" + idCliente + ") (Intro para mantener): ");
			if (!nuevoidCliente.trim().equals("")) {
				idCliente = nuevoidCliente;
			}
			
			nuevoidConcesionario = JOptionPane.showInputDialog("idConcesionario (" + idConcesionario + ") (Intro para mantener): ");;
			if (!nuevoidConcesionario.trim().equals("")) {
				idConcesionario = nuevoidConcesionario;
			}
			
			nuevoidCoche = JOptionPane.showInputDialog("idCoche (" + idCoche + ") (Intro para mantener): ");
			if (!nuevoidCoche.trim().equals("")) {
				idCoche = nuevoidCoche;
			}
			
			nuevofechausuario = JOptionPane.showInputDialog("precioVenta (" + precioVenta + ") (Intro para mantener): ");;
			if (!nuevofechausuario.trim().equals("")) {
				precioVenta = nuevofechausuario;
			}
			
			
			fechaNueva = JOptionPane.showInputDialog("Fecha (" + fechaNac.toString() + ") (Intro para mantener): ");
			if (!fechaNueva.trim().equals("")) {
			//	fechaNac.toString() =fechaNueva;
				fechaNueva = fechaNac.toString();
			}
			
			
			int registrosAfectados = s.executeUpdate(
					"update venta set idCliente='" + idCliente + "', idConcesionario='" + idConcesionario + "', " 
												  + " idCoche='" + idCoche + "', " 
							+ " fecha='" + fechaNac.toString()  + "', " + " precioVenta='" + precioVenta + "' "+ 
					"where id=" + id);
			
	
			System.out.println(registrosAfectados + " registros afectados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

	/**
	 * 
	 */
	public static void nuevoVentas () {
		Scanner sc = new Scanner(System.in);
		String idCliente, idConcesionario, idCoche, fechausuario, precioVenta ;
		int nuevoIdDisponible;
		
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Date date = new Date();
		
		System.out.println("Creacion de un nuevo venta:");
		
		System.out.println("Dame el idCliente:");
		idCliente = sc.next();
		System.out.println("Dame el idConcesionario:");
		idConcesionario = sc.next();
		System.out.println("Dame el idCoche:");
		idCoche = sc.next();
		System.out.println("Dame el Precio:");
		precioVenta = sc.next();
		System.out.println("Dame la fecha:");
		fechausuario=sc.next();
		
		
		
		try {
			date =sdf.parse(fechausuario);
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		SimpleDateFormat sdf1Salida = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");	
		
	
	
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("venta");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into venta values (" + nuevoIdDisponible + ",'" + idCliente + "', '" + idConcesionario + "', '" + idCoche + "', '" +  sdf1Salida.format(date)+ "', '" + precioVenta + "')");
				
				System.out.println(registrosAfectados + " registros insertados ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 */
	public static void listarVentas() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from venta");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	
}
