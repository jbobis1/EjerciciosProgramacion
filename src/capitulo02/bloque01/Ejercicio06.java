package capitulo02.bloque01;

import javax.swing.JOptionPane;

//
//  6º.- Realizar un ejercicio en C que pida un número al usuario e indique en pantalla 
//  si se trata de un número par o impar. Recuerda que un número par es aquel cuyo resto de su 
//  división entre dos sea siempre cero, y recuerda que un número impar es aquel cuyo resto de su 
//  división entre dos sea siempre uno.
//


public class Ejercicio06 {
	
	public class Main{

	    public static boolean esPar(int numero) {
	        return numero % 2 == 0;
	    }

	    public static void main(String[] args) {
	        int numero = JOptionPane.showInputDialog("Introduzca otro numero entero: ");
	        if (esPar(numero)) {
	            System.out.println("Sí es par");
	        } else {
	            System.out.println("No es par");
	        }
	    }

	}
}