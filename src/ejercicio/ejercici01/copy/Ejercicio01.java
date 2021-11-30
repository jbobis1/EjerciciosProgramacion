package ejercicio.ejercici01.copy;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
	
		int a = Integer.parseInt(JOptionPane.showInputDialog("Primer Numero:  "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Segundo Numero:  "));
		
		mayor(a, b );
		
	}
	
	public static int mayor(int a,int b) {
		int mayor=0;
		if (a>b) {
			mayor=a;
		}
		else if (a<b) {
			mayor=b;
		}System.out.println("El numero mayor es el: " + mayor);
		return mayor;
	}
}
