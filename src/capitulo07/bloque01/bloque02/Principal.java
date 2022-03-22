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
			case 1: // Listado de fabricantes
				fracicante(args);
				break;
			case 2: // Nuevo fabricante
				coches(args);
				break;
			case 3: // Modificar fabricante
				Consesionario(args);
				break;
			case 4: // Eliminar fabricante
				Clientes(args);
				break;
			case 5: // Eliminar fabricante
				Ventas(args);
				break;
				
			}

		} while (opcion != 0);
		

	}
	
	
	
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
	
	
	public static void coches(String[] args) {
		int opcion = 0;
		
		do {
			opcion = OpcionCoches();

			switch(opcion) {
			case 1: // Listado de fabricantes
				GestionarCoche.listarCoche();
				break;
			case 2: // Nuevo fabricante
				GestionarCoche.nuevoCoche();
				break;
			case 3: // Modificar fabricante
				GestionarCoche.modificarCoche();
				break;
			case 4: // Eliminar fabricante
				GestionarCoche.eliminarCoche();
				break;
			}

		} while (opcion != 0);
		

	}
	
	
	
	public static void Consesionario(String[] args) {
		int opcion = 0;
		
		do {
			opcion = opcionConcecionario();

			switch(opcion) {
			case 1: // Listado de fabricantes
				GestionarConsecionario.listarConsecionario();
				break;
			case 2: // Nuevo fabricante
				GestionarConsecionario.nuevoConsecionario();
				break;
			case 3: // Modificar fabricante
				GestionarConsecionario.modificarConsecionario();
				break;
			case 4: // Eliminar fabricante
				GestionarConsecionario.eliminarConsecionarioe();
				break;
			}

		} while (opcion != 0);
		

	}
	
	public static void Ventas(String[] args) {
		int opcion = 0;
		
		do {
			opcion = opcionVentas();

			switch(opcion) {
			case 1: // Listado de fabricantes
				GestionarVentas.listarVentas();
				break;
			case 2: // Nuevo fabricante
				GestionarVentas.nuevoVentas();
				break;
			case 3: // Modificar fabricante
				GestionarVentas.modificarVentas();
				break;
			case 4: // Eliminar fabricante
				GestionarVentas.eliminarVentas();
				break;
			}

		} while (opcion != 0);
		

	}
	
	public static void Clientes(String[] args) {
		int opcion = 0;
		
		
		do {
			opcion = opcionClientes();

			switch(opcion) {
			case 1: // Listado de fabricantes
				GestionarCliente.listarClientes();
				break;
			case 2: // Nuevo fabricante
				GestionarCliente.nuevoClientes();
				break;
			case 3: // Modificar fabricante
				GestionarCliente.modificarClientes();
				break;
			case 4: // Eliminar fabricante
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
	
	
	public static int opcionFabricantes () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu" + 
				"\n\t1.- Listar Fabricantes" +
				"\n\t2.- Nuevo Fabricante" +
				"\n\t3.- Modificar Fabricante" + 
				"\n\t4.- Eliminar Fabricante" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
	public static int OpcionCoches () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu" + 
				"\n\t1.- Listar Coches" +
				"\n\t2.- Nuevo Coches" +
				"\n\t3.- Modificar Coches" + 
				"\n\t4.- Eliminar Coches" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}

	public static int opcionClientes () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu" + 
				"\n\t1.- Listar Clientes" +
				"\n\t2.- Nuevo Clientes" +
				"\n\t3.- Modificar Clientes" + 
				"\n\t4.- Eliminar Clientes" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	public static int opcionConcecionario () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu" + 
				"\n\t1.- Listar Concecionario" +
				"\n\t2.- Nuevo Concecionario" +
				"\n\t3.- Modificar Concecionario" + 
				"\n\t4.- Eliminar Concecionario" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
	public static int opcionVentas () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenu" + 
				"\n\t1.- Listar Ventas" +
				"\n\t2.- Nuevo Ventas" +
				"\n\t3.- Modificar Ventas" + 
				"\n\t4.- Eliminar Ventas" +
				"\nIntroduzca su opcion: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
	
}
