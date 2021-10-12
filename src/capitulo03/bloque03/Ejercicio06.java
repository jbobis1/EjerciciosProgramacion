package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio06 {
	public static void main (String args[]) {

		tablaMultiplicar();
	}
	public static void tablaMultiplicar () {
		int numero = 0;
		int factor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
		
		for ( numero = 1; numero < 11; numero++) {
			System.out.println(numero + " x " + factor + " = " + (numero * factor));
		}
	}	
	
}
