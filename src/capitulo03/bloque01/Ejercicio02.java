package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	
	public static void main (String args[]) {

				
		
		int numero = 0;
		int suma;
		int contador = 10;
		
		for (int i = 1; i < contador; i++) {
			 suma = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
			
			if (suma >= 10) {
				numero = suma + numero;
				
				}			
			
			}			
		
		JOptionPane.showMessageDialog(null, "Mayor: " + numero);
	}
		

}
