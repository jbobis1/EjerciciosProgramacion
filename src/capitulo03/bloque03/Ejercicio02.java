package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	public static void main (String args[]) {
		int numero = 0;	
		int mayor;
		int menor;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		mayor = numero;
		menor = numero;
				 
		 for (;numero != 0;) {
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			 
				if (numero >= mayor) {
					mayor = numero;		
				}	
				
				if (numero == 0) {
					
				}
				
				else if (numero <= menor) {
					menor = numero;		
				}
		}	 
		System.out.println( "El numero Mayor es: " + mayor + " El numero Menor es: " + menor );
	}	
}
