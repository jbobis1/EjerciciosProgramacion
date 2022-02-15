package capitulo06;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio02 {
	public static void main (String args[]) {
		
		char cadena[] = new char[20];
	
		mayuscula(cadena);
		minuscula(cadena);
		caracter(cadena);
		digito(cadena);
		crear( cadena);
		
		}
	
		private static void crear(char[] cadena) {
			
			String contrasena;

			do {
				System.out.println("Introduce una Contraseña");
				contrasena= JOptionPane.showInputDialog("Escribe una contrasena: ");
				cadena = contrasena.toCharArray();

			}while((!mayuscula(cadena) || !minuscula(cadena)) || !digito(cadena) || !caracter(cadena));
			System.out.println("Contraseña Correcta");
		}
	
	
		private static boolean mayuscula(char[] cadena) {
			
			boolean mayuscula=false;
			
			for (int i = 0; i < cadena.length; i++) {	
				if( Character.isUpperCase(cadena[i])){
					mayuscula = true;
				}
				
				
		
			
			}
		
			return mayuscula;	
			
		}
		
		
		private static boolean minuscula(char[] cadena) {

			boolean minuscula=false;
			for (int i = 0; i < cadena.length; i++) {	
				if(Character.isLowerCase(cadena[i])){
					
					minuscula =true;	
				}
	
				
			
			}
			return minuscula;	
		}
		
		
		private static boolean digito(char[] cadena) {
				boolean digito=false;
				
			for (int i = 0; i < cadena.length; i++) {	
				if( Character.isDigit(cadena[i])){

				digito =true;
				}
			}
			return digito;	
		}
			
		private static boolean caracter(char[] cadena) {
				
			boolean caracter=false;
				
			for (int i = 0; i < cadena.length; i++) {	
				if( Character.isWhitespace(cadena[i])){
				
				caracter = true;
				}
			}
			return caracter;	
	}	
			
}
