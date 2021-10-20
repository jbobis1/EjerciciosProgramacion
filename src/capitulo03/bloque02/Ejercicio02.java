package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main (String args[]) {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numero que quieres: "));
		int numero = 0;	
		int mayor;
		int menor;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		mayor = numero;
		menor = numero;		
		for (int i = 0; i < cantidad -1; i++) {
			 numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			 
				if (numero >= mayor) {
					mayor = numero;		
				}	
	
				else{
					menor = numero;
				}		
		}
		System.out.println( "El numero Mayor es: " + mayor + " El numero Menor es: " + menor );
	}	
}
