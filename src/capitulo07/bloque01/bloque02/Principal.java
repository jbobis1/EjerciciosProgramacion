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
			
				break;
			case 4: // Eliminar fabricante
				
				break;
			}

		} while (opcion != 0);
		

	}
	
	
	
	public static void fracicante(String[] args) {
		int opcion = 0;
		
		do {
			opcion = opcion();

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
			opcion = opcion();

			switch(opcion) {
			case 1: // Listado de fabricantes
				GestionarCoche.listarCoche();
				break;
			case 2: // Nuevo fabricante
				GestionarCoche.nuevoCoche();
				break;
			case 3: // Modificar fabricante
				
				break;
			case 4: // Eliminar fabricante
				
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
		
		System.out.println("\n\nMenú" + 
				"\n\t1.- Fabricantes" +
				"\n\t2.- Coche" +
				"\n\t3.- Concecionario" + 
				"\n\t4.- Clientes" +
				"\n\t5.- Ventas" +
				"\nIntroduzca su opción: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
	
	public static int opcion () {
		Scanner sc = new Scanner(System.in);
		int opcionElegida = 0;
		
		System.out.println("\n\nMenú" + 
				"\n\t1.- Listar Fabricantes" +
				"\n\t2.- Nuevo Fabricante" +
				"\n\t3.- Modificar Fabricante" + 
				"\n\t4.- Eliminar Fabricante" +
				"\nIntroduzca su opción: ");
		
		opcionElegida = sc.nextInt();
		return opcionElegida;
	}
	
}
