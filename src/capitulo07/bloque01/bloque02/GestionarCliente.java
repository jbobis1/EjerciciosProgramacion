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

public class GestionarCliente  extends SupertipoGestion{

	/**
	 * 
	 */
	public static void eliminarClientes() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Introduce id del fabricante para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate(
					"delete from fabricante where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 */
	public static void modificarClientes () {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String Apellidos = "", nombre = "",dniDnie = null, localidad = null;
		String nuevoApellidos = "", nuevoNombre = "",nuevoDniDnie = "", nuevoLocalidad= "";

		Date ahora = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ("EEE, MMM d, ''yy 'at' hh:mm:ss a z");
		
		System.out.println("Introduce id del fabricante: ");
		id = sc.nextInt();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from fabricante where id=" + id);
			if (rs.next()) {
				Apellidos = rs.getString("Apellidos");
				nombre = rs.getString("nombre");
				dniDnie = rs.getString("dniDnie");
				localidad = rs.getString("localidad");
				sdf = rs.getDate("localidad");
				
				
			}
			
			nuevoApellidos = JOptionPane.showInputDialog("Cif (" + Apellidos + ") (Intro para mantener): ");
			if (!nuevoApellidos.trim().equals("")) {
				Apellidos = nuevoApellidos;
			}
			
			nuevoNombre = JOptionPane.showInputDialog("Nombre (" + nombre + ") (Intro para mantener): ");;
			if (!nuevoNombre.trim().equals("")) {
				nombre = nuevoNombre;
			}
			
			
			nuevoDniDnie = JOptionPane.showInputDialog("Cif (" + dniDnie + ") (Intro para mantener): ");
			if (!nuevoDniDnie.trim().equals("")) {
				dniDnie = nuevoDniDnie;
			}
			
			
			nuevoLocalidad = JOptionPane.showInputDialog("Cif (" + localidad + ") (Intro para mantener): ");
			if (!nuevoLocalidad.trim().equals("")) {
				localidad = nuevoLocalidad;
			}
			
			
			int registrosAfectados = s.executeUpdate(
					"update fabricante set Apellidos='" + Apellidos + "', nombre='" + nombre + "' " + "', DNI='" + dniDnie + "' " + "', localidad='" + localidad + "' " +
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
	public static void nuevoClientes () {
		Scanner sc = new Scanner(System.in);
		String apellidos, nombre,localidad,dniDnie;
		int nuevoIdDisponible, activo;
		
		Date ahora = new Date();
		

		SimpleDateFormat sdf = new SimpleDateFormat ("EEE, MMM d, ''yy 'at' hh:mm:ss a z");
		
		System.out.println("Creación de un nuevo fabricante:");
		System.out.println("Dame el apellidos:");
		apellidos = sc.next();
		System.out.println("Dame el nombre:");
		nombre = sc.next();
		System.out.println("Dame el localidad:");
		localidad = sc.next();
		System.out.println("Dame el dniDnie:");
		dniDnie = sc.next();
		System.out.println("Dame el fecha:");
		try {
			sdf.parse(JOptionPane.showInputDialog("Introduzca una fecha con formato dd/mm/yyyy: "));
		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("fabricante");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into fabricante values (" + nuevoIdDisponible + ",'" + nombre + "', '" + apellidos + "', '" + localidad + "', '" + dniDnie +"', '" + sdf + "')");
				
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
	public static void listarClientes() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from cliente");
		   
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
