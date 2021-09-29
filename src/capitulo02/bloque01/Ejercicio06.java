package capitulo02.bloque01;

import javax.swing.JOptionPane;

//
//  6�.- Realizar un ejercicio en C que pida un n�mero al usuario e indique en pantalla 
//  si se trata de un n�mero par o impar. Recuerda que un n�mero par es aquel cuyo resto de su 
//  divisi�n entre dos sea siempre cero, y recuerda que un n�mero impar es aquel cuyo resto de su 
//  divisi�n entre dos sea siempre uno.
//


public class Ejercicio06 {
	


		public static void main(String[] args) {
					String str  = JOptionPane.showInputDialog("Introduzca un numero: ");
					int numero = Integer.parseInt(str); 
	        
					
		
	        if ((numero % 2) == 0) {
	            System.out.println("El numero: " + numero + " Si es Par");
	        } 
	        
	        else {
	            System.out.println("El numero: " + numero + " No es Par");
	        }
	        
		}


}


