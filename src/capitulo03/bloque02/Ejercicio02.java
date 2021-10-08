package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main (String args[]) {

		int numero;
		
		int mayor = 1 ;
		int menor = 0;
				
		for (int i = 0; i < 5; i++) {
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			
			 
				if (numero < numero) {
					mayor = numero ;
				
				}	
		
			
				else if(numero > menor) {
					menor = numero;
				
				}
			 
				System.out.println( "El numero mayor es: " + mayor + " El numero menor es: " + menor );
		}			
						
	

	}
	
}
