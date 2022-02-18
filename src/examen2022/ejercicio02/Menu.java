package examen2022.ejercicio02;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {

		HashMap<String,Cromos> hm = new HashMap<String,Cromos>();

		
		
		hm.put("1", new Cromos ("23", "Lebron JAmes", "10�"));
		hm.put("2", new Cromos ("2", "Ricky rubio", "1"));
		hm.put("3", new Cromos ("1", "MArc gasol", "12"));
		
		
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Lista de Articulos");
		System.out.println("2.- Crear nuevo Articulos");
		System.out.println("3.- Eliminar un Articulos");
		System.out.println("4.- Actualizar un Articulos");

		String str = JOptionPane.showInputDialog("Introduzca la opcion: ");
		int opcion = Integer.parseInt(str);
		
		do {	
			
			switch(opcion) {
			
			case 0:
				System.out.printf("Fin");
				break;		
			
			case 1:
				MostrarCromo(hm);
				break;
				
			case 2:
				NuevoCromo(hm);
				break;
				
			
			case 3:
				Eliminarcromo(hm);
				break;
				
				
			case 4:
				MasPuntos(hm);
				break;
				
			default:
				System.out.printf("ERROR " );
				break;
			}	
			 str = JOptionPane.showInputDialog("Introduzca la opcion: ");
				opcion = Integer.parseInt(str);
		}while (opcion!=0);
	}
	
	private static void MostrarCromo(HashMap<String,Cromos> hm) {
		// recorremos el array para ya mostrarlo
	
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}	 
    }
	
	private static void NuevoCromo(HashMap <String,Cromos> hm) {
	
		Cromos a = new Cromos();
		
		String Identificador = JOptionPane.showInputDialog("id jugador: ");	

		a.setIdentificadorJugador(Identificador);
		hm.put(a.getIdentificadorJugador(), a);
		
		String Nombre = JOptionPane.showInputDialog("Nombre jugador: ");	
		a.setNombre(Nombre);
		hm.put(a.getNombre(), a);
		
		String Puntos = JOptionPane.showInputDialog("puntos jugador: ");	
		a.setPuntos(Puntos);
		hm.put(a.getPuntos(), a);

    }
	
	private static void Eliminarcromo(HashMap<String,Cromos> hm) {
	
		String Puntos = JOptionPane.showInputDialog("Introduzca la opcion a elminar: ");	
		hm.remove(Puntos);
			
    }
	
	private static void MasPuntos(HashMap <String,Cromos>hm) {
	
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
//			claves[i].getClass().getPuntos();
			System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}	 
	 	
    }	
}
