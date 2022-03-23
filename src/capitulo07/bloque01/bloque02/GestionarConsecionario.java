package capitulo07.bloque01.bloque02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionarConsecionario extends SupertipoGestion{

	public static void eliminarConsecionarioe() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Introduce id del concesionario para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate(
					"delete from concesionario where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 */
	public static void modificarConsecionario () {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String cif = "", nombre = "", localidad = "";
		String nuevoCif = "", nuevoNombre = "", nuevoLocalidad = "";
		
		
		System.out.println("Introduce id del concesionario: ");
		id = sc.nextInt();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from concesionario where id=" + id);
			if (rs.next()) {
				cif = rs.getString("cif");
				nombre = rs.getString("nombre");
				localidad = rs.getString("localidad");
			}
			
			nuevoCif = JOptionPane.showInputDialog("Cif (" + cif + ") (Intro para mantener): ");
			if (!nuevoCif.trim().equals("")) {
				cif = nuevoCif;
			}
			
			nuevoNombre = JOptionPane.showInputDialog("Nombre (" + nombre + ") (Intro para mantener): ");;
			if (!nuevoNombre.trim().equals("")) {
				nombre = nuevoNombre;
			}
			
			nuevoLocalidad = JOptionPane.showInputDialog("Localidad (" + localidad + ") (Intro para mantener): ");;
			if (!nuevoLocalidad.trim().equals("")) {
				localidad = nuevoLocalidad;
			}
				
			int registrosAfectados = s.executeUpdate(
					"update concesionario set cif='" + cif + "', nombre='" + nombre + "', " + " localidad='" + localidad + "' " +
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
	public static void nuevoConsecionario () {
		Scanner sc = new Scanner(System.in);
		String cif, nombre, localidad;
		int nuevoIdDisponible;
		
		System.out.println("Creación de un nuevo Consecionario:");
		
		System.out.println("Dame el cif:");
		cif = sc.next();
		System.out.println("Dame el nombre:");
		nombre = sc.next();
		System.out.println("Dame el localidad:");
		localidad = sc.next();
	
		
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("concesionario");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into concesionario values (" + nuevoIdDisponible + ",'" + cif + "', '" + nombre + "', '" + localidad + "')");
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
	public static void listarConsecionario() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from concesionario");
		   
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
