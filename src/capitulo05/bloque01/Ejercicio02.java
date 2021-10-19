package capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		int inferior = Integer.parseInt(JOptionPane.showInputDialog("Limite inferior: "));
		int superior = Integer.parseInt(JOptionPane.showInputDialog("Limite inferior: "));
		int numeros[] = new int[150];
		
		
		// Inicialización de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (superior - inferior)) + inferior;
			System.out.print(numeros[i] + " ");
		}
	
	}
	
}
