package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String args[]) {
		
		int factor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));		
		

		for (int i = 0; (i * factor) < 100; i++) {
			System.out.println("Valor de i * factor: " + (i * factor));
		}


	}
	
	

}
