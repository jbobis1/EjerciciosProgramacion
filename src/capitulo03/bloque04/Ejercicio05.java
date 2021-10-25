package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio05 {
	public static void main (String args[]) {
		int factorial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		int i=1;   
		int factorial1 = 1;
		
		while (i<=factorial) {		
			factorial1=factorial1*i;	
			i++;						
		}
		System.out.println("El valor del factorial equivale a " + factorial1);
	}
}

