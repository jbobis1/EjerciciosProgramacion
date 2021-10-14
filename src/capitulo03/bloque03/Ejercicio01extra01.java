package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01extra01 {

	public static void main (String args[]) {
		
		int suma = 0;
		int numero = -1 ;
		for (;numero != 0;) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
			suma += numero;
		}
		
		System.out.println("Suma: " + suma);
		
		
	}
}