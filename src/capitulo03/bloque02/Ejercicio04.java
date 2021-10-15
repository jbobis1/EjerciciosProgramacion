package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
	public static void main (String args[]) {
		int limite = Integer.parseInt(JOptionPane.showInputDialog("Limite : "));
		int factor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));		
		
		for (int i = 0; (i * factor) <=limite; i++) {
			System.out.println("Valor de i * factor: " + (i * factor));
		}
	}
}
	
	


