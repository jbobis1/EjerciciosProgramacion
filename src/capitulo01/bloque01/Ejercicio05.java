package capitulo01.bloque01;

import javax.swing.JOptionPane;

//  5.- Realiza un programa en Java que pida dos variables al usuario,
//  intercambie los valores de las dos variables y las muestre en pantalla 
//  ANTES y DESPUÉS del intercambio de valores.

public class Ejercicio05 {

	public static void main(String args[]) {
		lecturaDatosEnteros();
	}

	public static void lecturaDatosEnteros() {
		
		String str = "1732"; // Sacamos ventana en pantalla y obtenemos un String
		str = JOptionPane.showInputDialog("variable 1: ");
		int var1 = Integer.parseInt(str); // Convierto la variable escrita en un número entero
	
		// Se repiten los pasos anteriores
		
		str = JOptionPane.showInputDialog("variable 2: ");
		int var2 = Integer.parseInt(str);
	

				
		System.out.println("valor de var1: " + var1 );
		System.out.println("valor de var2: " + var2 );
		
		// intercambio de variables
		int var3;
		
		var3 = var1;
		var1 = var2;
		var2 = var3;
		
		System.out.println("valor de intercambido var1: " + var1 );
		System.out.println("valor de intercambido var2: " + var2 );
	}
	
}
