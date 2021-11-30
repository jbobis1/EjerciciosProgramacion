package ejercicio.Ejercicio02;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Primer Numero:  "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Segundo Numero:  "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Tercer Numero:  "));
		mayor(a, b,  c );
		
	}
	
	public static int mayor(int a,int b, int c) {
		int mayor=0;
		
		if (a>b && a>c) {
			mayor=a;
		}
		else if (c < b) {
			mayor=b;
		}
			 
		else{
			mayor=c;
		}
			 
		
	System.out.println("El numero mayor es el: " + mayor);
		return mayor;
	}
}


