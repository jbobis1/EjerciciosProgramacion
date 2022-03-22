package capitulo07.bloque01.bloque02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionarCoche extends SupertipoGestion  {


	public static void eliminarCoche() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Introduce id del coche para su eliminacion: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate(
					"delete from coche where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * 
	 */
	public static void modificarCoche () {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String idfabricante = "", bastidor = "", modelo ="", color= "";
		String nuevoIdfrabicante = "", nuevoBastidor = "", nuevoModelo="",nuecoColor = "" ;
		
		System.out.println("Introduce id del coche: ");
		id = sc.nextInt();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from coche where id=" + id);
			if (rs.next()) {
				idfabricante = rs.getString("idfabricante");
				bastidor = rs.getString("bastidor");
				modelo = rs.getString("modelo");
				color = rs.getString("color");
								
			}

			
			nuevoIdfrabicante = JOptionPane.showInputDialog("idfrabricante (" + idfabricante + ") (Intro para mantener): ");
			if (!nuevoIdfrabicante.trim().equals("")) {
				idfabricante = nuevoIdfrabicante;
			}
			
			nuevoBastidor = JOptionPane.showInputDialog("bastidor (" + bastidor + ") (Intro para mantener): ");;
			if (!nuevoBastidor.trim().equals("")) {
				bastidor = nuevoBastidor;
			}
			
			nuevoModelo = JOptionPane.showInputDialog("idfrabicante (" + modelo + ") (Intro para mantener): ");
			if (!nuevoModelo.trim().equals("")) {
				modelo = nuevoModelo;
			}
			
			nuecoColor = JOptionPane.showInputDialog("color (" + color + ") (Intro para mantener): ");;
			if (!nuecoColor.trim().equals("")) {
				color = nuecoColor;
			}
			
			
			int registrosAfectados = s.executeUpdate(
					"update coche set idfabricante='" + idfabricante + "', bastidor='" + bastidor 
																	 + "'," + " modelo='" + modelo + "', " +" color='" + color + "' " +
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
	public static void nuevoCoche () {
		Scanner sc = new Scanner(System.in);
		String idfabrinate, bastidor, modelo, color;
		int nuevoIdDisponible;
		
		System.out.println("Creacion de un nuevo coche:");
		
		System.out.println();
		
		System.out.println("Dame el idfabrinate:");
		idfabrinate = sc.next();
		System.out.println("Dame el Bastidor:");
		bastidor = sc.next();
		System.out.println("Dame el Modelo:");
		modelo = sc.next();
		System.out.println("Dame el Color:");
		color = sc.next();
		
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("coche");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into coche values (" + nuevoIdDisponible + ",'" + idfabrinate + "', '" + bastidor + "', '" + modelo + "', '" + color + "')");
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
	public static void listarCoche() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from coche");
		   
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
			System.out.println("Error en la ejecucion SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
