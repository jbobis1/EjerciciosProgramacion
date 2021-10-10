package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	
	public static void main (String args[]) {
	
		int numero = 10000;	
		int menor;


		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		menor = numero;
				

			for (;numero != 0;) {
			
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			 
				if (numero <= menor) {
					menor = numero;		
				}	
			
		}
		System.out.println( "El numero menor es: " + menor );
	}	
}