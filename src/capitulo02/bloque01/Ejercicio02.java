package capitulo02.bloque01;

import javax.swing.JOptionPane;

//
//  2�.- Repetir el ejercicio anterior para mostrar el 
//  numero menor de los dos introducidos .
//


public class Ejercicio02 {
	
	public static void main(String args[]) {
		
		String str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
		int var = Integer.parseInt(str);
		
		str =JOptionPane.showInputDialog("Introduzca otro número entero: ");
		int var1 = Integer.parseInt(str);
		
		if (var<var1)
			  System.out.println("El numero menor es: " + var );
			else
			  System.out.println("El numero menor es: " + var1);
		
				
	}

}
