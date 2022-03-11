package examensegundo2022;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;






public class Principal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		String juego = Principal.getProperty("juego");
			
		System.out.println("Usuario leído del fichero de propiedades: " + juego);
		
	
		
		List<Jugador> jugador = new ArrayList<Jugador>();

		
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Puntos");
		System.out.println("2.- Puntos");
		System.out.println("3.- Puntos");
		System.out.println("4.- Puntos");
		System.out.println("5.- Puntos");
		System.out.println("6.- Puntos");
		System.out.println("7.- Puntos");
		System.out.println("8.- Puntos");
		System.out.println("9.- Puntos");
		System.out.println("10.-Puntos ");
		System.out.println("11.-Puntos");
		System.out.println("12.-Puntos");
		System.out.println("13.-Puntos ");
		System.out.println("14.-Puntos");
		System.out.println("15.-Puntos");
		System.out.println("16.-Puntos");
		System.out.println("17.-Puntos");
		System.out.println("18.-Puntos");
		System.out.println("19.-Puntos");
		System.out.println("20.-Puntos");
		System.out.println("50.-Puntos");
		System.out.println("100-Puntos");


		
		do {	
	
			switch(4) {
			
			case 0:
				System.out.printf("Fin");
				break;		
			
			case 1:
			
				break;
				
			case 2:
		
				break;
				
			
			case 3:
			
				break;
		
				
			case 4:
			
				break;

				
				
			default:
				System.out.printf("ERROR " );
				break;
			}	

		}while (4<=3);
		
		
		
		try {
			numerocien();
		} catch (CienException e) {
			e.printStackTrace();
		}
		
	}
		
	

	

	
	public void turno () {
		int ocpion = (JOptionPane.showInputDialog("")) ;
		for(int i = 0; i < 10;  i++) {
		
		}
			for(int j = 0; j < 3;  j++) {
				int tirada=0;
				if(ocpion < 20) {
					
				}

				if(ocpion == 50){
					
				}
				
				if(ocpion == 100){
					
				}
		}
			
			
		
		
	}

	private void creaActores () {
		List<Jugador> jugador1 = new ArrayList<Jugador>();
		
		//Construyo un player para este juego y lo agrego a la lista
		
		Jugador jugador = new Jugador();

					
				for (int i = 1; i < 4; i++) {
					Jugador a = new Jugador();
					jugador.put(a.getNombre(), a);
				}				

				
			
	}
	
	private static Properties propiedades = null;


	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src//EjerciciosProgramacion/src/examensegundo2022");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */

	
	
	/**
	 * 
	 * @param args
	 */
	private static int numerocien ( ) throws CienException {
	
		int numero = 100;
		
		if (numero  == 100 ) {
			
			return numero;
		}
		else {
			throw new CienException("HAS FALLADO AL CIEN");
		}
	}
	
	
}
