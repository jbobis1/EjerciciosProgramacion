package capitulo02.bloque01;

import javax.swing.JOptionPane;

//
//   1�.- Realiza un ejercicio que pida dos variables al usuario, tras lo cual, 
//   muestre en pantalla el n�mero mayor de los dos introducidos.
//


public class Ejercicio01 {

	public static void main(String args[]) {
		
		String str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
		int var = Integer.parseInt(str);
		
		str =JOptionPane.showInputDialog("Introduzca otro número entero: ");
		int var1 = Integer.parseInt(str);
		
		if (var>var1)
			  System.out.println("El numero mayor es: " + var );
			else
			  System.out.println("El numero mayor es: " + var1);
		
				
	}
}
