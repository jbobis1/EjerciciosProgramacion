package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String args[]) {
	
		int numero = 0;	
		int mayor;


		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		 mayor = numero;
				

			for (;numero != 0;) {
			
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			 
				if (numero >= mayor) {
					mayor = numero;		
				}	
			
		}
		System.out.println( "El numero Mayor es: " + mayor );
	}	
}