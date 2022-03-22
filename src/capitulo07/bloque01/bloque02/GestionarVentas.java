package capitulo07.bloque01.bloque02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		String cif = "", nombre = "";
		String nuevoCif = "", nuevoNombre = "";
		
		System.out.println("Introduce id del venta: ");
		id = sc.nextInt();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from venta where id=" + id);
			if (rs.next()) {
				cif = rs.getString("cif");
				nombre = rs.getString("nombre");
			}
			
			nuevoCif = JOptionPane.showInputDialog("Cif (" + cif + ") (Intro para mantener): ");
			if (!nuevoCif.trim().equals("")) {
				cif = nuevoCif;
			}
			
			nuevoNombre = JOptionPane.showInputDialog("Nombre (" + nombre + ") (Intro para mantener): ");;
			if (!nuevoNombre.trim().equals("")) {
				nombre = nuevoNombre;
			}
			
			int registrosAfectados = s.executeUpdate(
					"update venta set cif='" + cif + "', nombre='" + nombre + "' " +
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
		String idfabrinate, bastidor, modelo, color;
		int nuevoIdDisponible;
		
		System.out.println("Creación de un nuevo venta:");
		
		System.out.println("Dame el cif:");
		idfabrinate = sc.next();
		System.out.println("Dame el Bastidor:");
		bastidor = sc.next();
		System.out.println("Dame el Modelo:");
		modelo = sc.next();
		System.out.println("Dame el Color:");
		color = sc.next();
		
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("venta");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into venta values (" + nuevoIdDisponible + ",'" + idfabrinate + "', '" + bastidor + "', '" + modelo + "', '" + color + "')");
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
