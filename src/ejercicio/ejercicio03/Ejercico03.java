package ejercicio.ejercicio03;

import javax.swing.JOptionPane;

public class Ejercico03 {

		public static void main(String[] args) {
		String cadena = JOptionPane.showInputDialog("Primer Numero:  ");
	
		
		//	String cadena ="hollaaa";
			numero(cadena);
			
		}
		public static int numero(String cadena) {
			int contador=0;
			
			int log = cadena.length();
			
			for(int i =0; i < log; i++) {
				if(cadena.charAt(i)=='a') {
					contador++;
				}
			} 
			
		System.out.println("El numero mayor es el: " + contador );
			return contador;
		}
	
}
