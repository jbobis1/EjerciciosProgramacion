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
		System.out.println("Número introducido: " + var1); // Muestro el número en pantalla
		// Se repiten los pasos anteriores
		
		str = JOptionPane.showInputDialog("variable 2: ");
		int var2 = Integer.parseInt(str);
		System.out.println("Número introducido: " + var2);
		
	
						

		// sumo las variables.
		
		int var3 = var1 ;
		int var4 = var2 ;
				
		System.out.println("valor de var1: " + var1 );
		System.out.println("valor de var2: " + var2 );
		System.out.println("valor de intercambido var1: " + var4 );
		System.out.println("valor de intercambido var2: " + var3 );
		
	}
	
}
