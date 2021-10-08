package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String args[]) {


		int suma;
		int negativo = 0;
		int positivo = 0;
		
		for (int i = 1; i < 6; i++) {
			 suma = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número"));
			
			if (suma > 0) {
				positivo ++;
				
				}	
	
			else if(suma == 0) {
				
			
			}
			else if(suma < 0) {
				negativo++;
			
			}			
		
			System.out.println( " Negativos : " + negativo + " Positivos: " + positivo);
		}
		
	}
}


