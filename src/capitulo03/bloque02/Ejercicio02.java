package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main (String args[]) {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numero que quieres: "));
		int numero;	
		int mayor = 0;
		int menor = 0;
				
		for (int i = 0; i < cantidad; i++) {
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			 numero = mayor;
			 numero = menor;
			 
				if (numero < mayor) {
					mayor = numero ;		
				}	
	
				else if(numero > menor) {
					menor = numero;
				}
				
				System.out.println( "El numero Mayor es: " + mayor + " El numero Menor es: " + menor );
		}
		
	}	
}
