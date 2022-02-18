package examen2022;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {

		char nuevo[] = new char[20];
		
		int nummayuscula =0, minuscula =0,digito =0;

		
		crear( nuevo);
		mayuscula( nuevo, nummayuscula);
		System.out.println("El numero de mayuscula son: " +mayuscula( nuevo, nummayuscula));
		
		minuscula( nuevo,minuscula);
		System.out.println("El numero de minusculas son: " +minuscula( nuevo, minuscula));
		
		digito( nuevo, digito);
		System.out.println("El numero de digitos son: " + digito( nuevo, digito));
		
			 
		
		
	}
		
		private static void crear(char[] nuevo) {
			String str;

			System.out.println("Introduce una Contraseña");
			str= JOptionPane.showInputDialog("cadena de texto: ");
			nuevo = str.toCharArray();
		
		
		// Ejemplo de separaci�n de cadena en cadenas a trav�s de split()
		System.out.println("Separaci�n de una cadena en otras cadenas a trav�s de un espacio en blanco");
		String[] nuevo1 = str.split(" ");
		for (int i = 0; i < nuevo1.length; i++) {
			
			System.out.println("Palabras " + (i + 1) + ": " + nuevo1[i]);
		}
		
		}


		private static  int  mayuscula(char[] nuevo, int nummayuscula ) {
			
			
			
			for (int i = 0; i < nuevo.length; i++) {	
				if( Character.isUpperCase(nuevo[i])){
					nummayuscula++;
					
			
				}
				
			}		
			return nummayuscula;	
	}
	
		
		private static  int  minuscula(char[] nuevo, int minuscula) {
			
			
			
			for (int i = 0; i < nuevo.length; i++) {	
				if( Character.isLowerCase(nuevo[i])){
					minuscula++;
					
			
				}
			
			}		
			return minuscula;	
	}
		

				
		
		private static int digito(char[] nuevo, int digito) {
		
						
			for (int i = 0; i < nuevo.length; i++) {	
				if( Character.isDigit(nuevo[i])){

				digito ++;
				}
			}
			return digito;	
		}
}
