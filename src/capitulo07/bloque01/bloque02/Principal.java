package capitulo07.bloque01.bloque02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

	/**    D8:9E:F3:79:BC:44
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion = 0;
		
		do {
			opcion = menu();

			switch(opcion) {
			case 1: //Menu de Fabricante
				fracicante(args);
				break;
			case 2: //Menu de Coches
				coches(args);
				break;
			case 3: //Menu de Consesionario
				Consesionario(args);
				break;
			case 4: //Menu de Clientes
				Clientes(args);
				break;
			case 5: //Menu de Ventas
				Ventas(args);
				break;
				
			}

		} while (opcion != 0);
		

	}
	
	/**
	 * 
	 */
	
	public static void fracicante(String[] args) {
		int opcion = 0;
		
		do {
			opcion = opcionFabricantes();

			switch(opcion) {
			case 1: // Listado de fabricantes
				GestionFabricante.listarFabricantes();
				break;
			case 2: // Nuevo fabricante
				GestionFabricante.nuevoFabricante();
				break;
			case 3: // Modificar fabricante
				GestionFabricante.modificarFabricante();
				break;
			case 4: // Eliminar fabricante
				GestionFabricante.eliminarFabricante();
				break;
			}

		} while (opcion != 0);
		

	}
	
	/**
	 * 
	 * @param args
	 */
	
	public static void coches(String[] args) {
		int opcion = 0;
		
		do {
			opcion = OpcionCoches();

			switch(opcion) {
			case 1: // Listado de coches
				GestionarCoche.listarCoche();
				break;
			case 2: // Nuevo coches
				GestionarCoche.nuevoCoche();
				break;
			case 3: // Modificar coches
				GestionarCoche.modificarCoche();
				break;
			case 4: // Eliminar coches
				GestionarCoche.eliminarCoche();
				break;
			}

		} while (opcion != 0);
		

	}
	
	/**
	 * 
	 * @param args
	 */
	
	public static void Consesionario(String[] args) {
		int opcion = 0;
		
		do {
			opcion = opcionConcecionario();

			switch(opcion) {
			case 1: // Listado de coches
				GestionarConsecionario.listarConsecionario();
				break;
			case 2: // Nuevo coches
				GestionarConsecionario.nuevoConsecionario();
				break;
			case 3: // Modificar coches
				GestionarConsecionario.modificarConsecionario();
				break;
			case 4: // Eliminar coches
				GestionarConsecionario.eliminarConsecionarioe();
				break;
			}

		} while (opcion != 0);
		

	}
	
	
	/**
	 * 
	 * @param args
	 */
	
	public static void Ventas(String[] args) {
		int opcion = 0;
		
		do {
			opcion = opcionVentas();

			switch(opcion) {
			case 1: // Listado de coches
				GestionarVentas.listarVentas();
				break;
			case 2: // Nuevo coches
				GestionarVentas.nuevoVentas();
				break;
			case 3: // Modificar coches
				GestionarVentas.modificarVentas();
				break;
			case 4: // Eliminar coches
				GestionarVentas.eliminarVentas();
				break;
			}

		} while (opcion != 0);
		

	}
	
	/**
	 * 
	 * @param args
	 */
	
	public static void Clientes(String[] args) {
		int opcion = 0;
		
		
		do {
			opcion = opcionClientes();

			switch(opcion) {
			case 1: // Listado de coches
				GestionarCliente.listarClientes();
				break;
			case 2: // Nuevo coches
				GestionarCliente.nuevoClientes();
				break;
			case 3: // Modificar coches
				GestionarCliente.modificarClientes();
				break;
			case 4: // Eliminar coches
				GestionarCliente.eliminarClientes();
				break;
			}

		} while (opcion != 0);
		

	}
	
	
	/**
	 * 
	 * @return
	 */
	public static int menu () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu" + 
				"\n\t1.- Fabricantes" +
				"\n\t2.- Coche" +
				"\n\t3.- Concecionario" + 
				"\n\t4.- Clientes" +
				"\n\t5.- Ventas" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
	/**
	 * 
	 * @return
	 */
	public static int opcionFabricantes () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu de Fabricante" + 
				"\n\t1.- Listar Fabricantes" +
				"\n\t2.- Nuevo Fabricante" +
				"\n\t3.- Modificar Fabricante" + 
				"\n\t4.- Eliminar Fabricante" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static int OpcionCoches () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu de Coche" + 
				"\n\t1.- Listar Coches" +
				"\n\t2.- Nuevo Coche" +
				"\n\t3.- Modificar Coche" + 
				"\n\t4.- Eliminar Coche" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}

	/**
	 * 
	 * @return
	 */
	
	public static int opcionClientes () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu de Cliente" + 
				"\n\t1.- Listar Clientes" +
				"\n\t2.- Nuevo Cliente" +
				"\n\t3.- Modificar Cliente" + 
				"\n\t4.- Eliminar Cliente" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static int opcionConcecionario () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu de Concesionario" + 
				"\n\t1.- Listar Concesionarios" +
				"\n\t2.- Nuevo Concesionario" +
				"\n\t3.- Modificar Concesionario" + 
				"\n\t4.- Eliminar Concesionario" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	/**
	 * 
	 * @return
	 */
	public static int opcionVentas () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu de Venta" + 
				"\n\t1.- Listar Ventas" +
				"\n\t2.- Nuevo Venta" +
				"\n\t3.- Modificar Venta" + 
				"\n\t4.- Eliminar Venta" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}	
	
}
