package entorno;

import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Mete otro numero: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Mete otro numero: "));
		
		suma( a, b);
		System.out.println("Suma: " + suma( a, b));
		
		resta(a, b);
		System.out.println("Resta: " + resta( a, b));
		
		multiplicaccion(a, b);
		System.out.println("Multiplicaccion: " + multiplicaccion( a, b));
		
		division(a, b);
		System.out.println("Division: " + division( a, b));
		
		par(c);
		System.out.println("El numero es par: " + par( c));
		
		mitadpar(c);
		System.out.println("La midad si el numero es par sino es el numero: " + mitadpar( c));
		
	}
	public static int suma(int a, int b) {
		int suma =a+b;
		return suma;
	}
	
	public static int resta(int a, int b) {
		int resta =a-b;
		return resta;
	}
	
	public static int multiplicaccion(int a, int b) {
		int multiplicaccion =a*b;
		return multiplicaccion;
	}
	
	public static int division(int a, int b) {
		
		int n=0;
		 if (b==0) {
			 n= 0;
		 }
		 else{
			 n=a/b;
		 }
		 return n;	 
	}
	
	public static boolean par(int c) {
		boolean esPar = false;
		if(c%2==0) {
			esPar = true;
		}
		else {
			esPar = false;
		}
		 return esPar;
	}
	
	public static int mitadpar(int c) {
		int mitad=0;
		if(par(c)==true) {
			mitad =c/2;
		}
		else {
			mitad =c;
		}
		 return mitad;
	}
	
	
}