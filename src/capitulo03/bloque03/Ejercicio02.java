package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main (String args[]) {
		
		int suma = 0;
		int cont = 0;
		int numero = -1 ;
		int media;
		
		for (;numero != 0;) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
			suma += numero;
			cont++;
			
			
			
		}
		media = suma/cont;
		
		System.out.println("La media de los numero introducidos es : " + media);
		
		
	}
}