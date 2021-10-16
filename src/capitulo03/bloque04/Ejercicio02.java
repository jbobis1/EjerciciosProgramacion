package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main (String args[]) {
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero Minimo: "));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero Maximo: "));
		int numero = minimo;
		int contador = 2;
		
	
		
		while (numero <= maximo) {
			if((numero % contador == 0)) {
				
				System.out.println("El nuero " + numero + " no primo");	
				contador++;
			}
			else {
				
				System.out.println("El numero " + numero + " es primo");
				
			}
		
			numero++;
		}
	}
}

