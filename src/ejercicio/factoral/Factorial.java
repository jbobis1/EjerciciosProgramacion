package ejercicio.factoral;

import javax.swing.JOptionPane;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero");
		int factorial = Integer.parseInt(JOptionPane.showInputDialog("Numero que quieres el Factorial:  "));		
		
		System.out.println(factorial(factorial));
	}
	
	public static int factorial(int factorial) {
			if (factorial>0) {
				for (int i = factorial-1; i > 1; i--) {
				factorial=factorial*i;
				
				}
			}
			else {
				
			}
			return factorial;
	}
}
