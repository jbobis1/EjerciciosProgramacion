package capitulo06;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio02 {
	public static void main (String args[]) {
		
	
		char cadenaTexto[] = new char[] {};
		
		do {
			
			 
			String contraseņa = JOptionPane.showInputDialog("Escribe una contrseņa: ");
			
			for (int i =0; i> contraseņa.length();i ++) {
				cadenaTexto[i+1]=contraseņa[i];
			}
							
		}while (Character.isLowerCase(cadenaTexto[i])  || Character.isUpperCase(cadenaTexto[i])  
				|| Character.isDigit(cadenaTexto[i]) || Character.isLetter(cadenaTexto[i]));
	
		
	}
}
