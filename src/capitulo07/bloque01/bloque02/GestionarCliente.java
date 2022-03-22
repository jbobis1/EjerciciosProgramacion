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
		
		System.out.println("Introduce id del cliente para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate(
					"delete from cliente where id=" + id);
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
		int id = 0 , activo =1;
		String apellidos = "", nombre = "",dniNie="" , localidad="", fechaNueva="" ;
		String nuevoApellidos = "", nuevoNombre = "",nuevoDniDnie = "", nuevoLocalidad= "";

		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Date fechaNac = new Date();
		

		System.out.println("Introduce id del cliente: ");
		id = sc.nextInt();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from cliente where id=" + id);
			if (rs.next()) {
				apellidos = rs.getString("Apellidos");
				nombre = rs.getString("nombre");
				dniNie = rs.getString("dniNie");
				localidad = rs.getString("localidad");
				fechaNac = rs.getDate("fechaNac");
				
				
			}
			
			nuevoNombre = JOptionPane.showInputDialog("nombre (" + nombre + ") (Intro para mantener): ");
			if (!nuevoNombre.trim().equals("")) {
				nombre = nuevoNombre;
			}
			
			nuevoApellidos = JOptionPane.showInputDialog("apellidos (" + apellidos + ") (Intro para mantener): ");;
			if (!nuevoApellidos.trim().equals("")) {
				apellidos = nuevoApellidos;
			}
			
			
			nuevoDniDnie = JOptionPane.showInputDialog("dniNie (" + dniNie + ") (Intro para mantener): ");
			if (!nuevoDniDnie.trim().equals("")) {
				dniNie = nuevoDniDnie;
			}
			
			
			nuevoLocalidad = JOptionPane.showInputDialog("localidad (" + localidad + ") (Intro para mantener): ");
			if (!nuevoLocalidad.trim().equals("")) {
				localidad = nuevoLocalidad;
			}
			
			
			fechaNueva = JOptionPane.showInputDialog("Fecha (" + fechaNac.toString() + ") (Intro para mantener): ");
			if (!fechaNueva.trim().equals("")) {
			//	fechaNac.toString() =fechaNueva;
				fechaNueva = fechaNac.toString();
			}
			
			
			
			int registrosAfectados = s.executeUpdate(
					"update cliente set nombre='" + nombre + "', apellidos='" + apellidos + "', " 
												  + " localidad='" + localidad + "', " + " dniNie='" + dniNie + "', " 
												  + " fechaNac='" + fechaNac.toString()  + "', " + " activo='" + activo + "' "+ 
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
		String apellidos, nombre,localidad,dniDnie, fechausuario;
		int nuevoIdDisponible, activo = 1 ;
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Date date = new Date();
		
		System.out.println("Creación de un nuevo cliente:");
		System.out.println("Dame el apellidos:");
		apellidos = sc.next();
		System.out.println("Dame el nombre:");
		nombre = sc.next();
		System.out.println("Dame el localidad:");
		localidad = sc.next();
		System.out.println("Dame el dniDnie:");
		dniDnie = sc.next();
		System.out.println("Dame el fecha:");
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
			nuevoIdDisponible = maxIdEnTabla("cliente");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into cliente values (" + nuevoIdDisponible + ",'" + nombre + "', '" + apellidos + "', '" + localidad + "', '" + dniDnie +  "', '" +  sdf1Salida.format(date)+ "', '" + activo + "')");
				
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
