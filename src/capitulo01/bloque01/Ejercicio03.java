package capitulo01.bloque01;

import javax.swing.JOptionPane;

// 3.- Realiza un programa que pida al usuario tres
// números y calcule y muestre en pantalla la suma de los tres.
//


public class Ejercicio03 {

		public static void main(String args[]) {
			lecturaDatosEnteros();
		}
	
		public static void lecturaDatosEnteros() {
			
			String str = "1732"; // Sacamos ventana en pantalla y obtenemos un String
			str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
			int var1 = Integer.parseInt(str); // Convierto la variable escrita en un número entero
			System.out.println("Número introducido: " + var1); // Muestro el número en pantalla
			// Se repiten los pasos anteriores
			
			str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
			int var2 = Integer.parseInt(str);
			System.out.println("Número introducido: " + var2);
			
			str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
			int var3 = Integer.parseInt(str);
			System.out.println("Número introducido: " + var3);
							

			// sumo las variables.
			int suma = var1 + var2 + var3;
			System.out.println("Suma de los tres valores introducidos: " + suma);
		}
	}

