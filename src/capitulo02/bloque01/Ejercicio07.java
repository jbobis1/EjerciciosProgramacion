package capitulo02.bloque01;

import javax.swing.JOptionPane;

//
//  7º.- Utiliza la operación AND y el operador "if", para tratar de averiguar 
//  si un número introducido por el usuario es par o impar. Sería recomendable que 
//  estudiases el código de la clase "OperadoresANivelDeBits" del capítulo 1 de este tutorial.
//

public class Ejercicio07 {

	public static void main(String[] args) {
		String str  = JOptionPane.showInputDialog("Introduzca un numero: ");
		int numero = Integer.parseInt(str); 

		

		if ((numero & 1) == 0) {
			System.out.println("El numero: " + numero + " Si es Par");
		} 

		else {
			System.out.println("El numero: " + numero + " No es Par");
		}

	}

}
