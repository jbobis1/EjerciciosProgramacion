package capitulo02.bloque01;

import javax.swing.JOptionPane;

//
//  6�.- Realizar un ejercicio en C que pida un n�mero al usuario e indique en pantalla 
//  si se trata de un n�mero par o impar. Recuerda que un n�mero par es aquel cuyo resto de su 
//  divisi�n entre dos sea siempre cero, y recuerda que un n�mero impar es aquel cuyo resto de su 
//  divisi�n entre dos sea siempre uno.
//


public class Ejercicio06 {
	
	public class Main{

	    public static boolean esPar(int numero) {
	        return numero % 2 == 0;
	    }

	    public static void main(String[] args) {
	        int numero = JOptionPane.showInputDialog("Introduzca otro numero entero: ");
	        if (esPar(numero)) {
	            System.out.println("S� es par");
	        } else {
	            System.out.println("No es par");
	        }
	    }

	}
}