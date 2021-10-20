package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String args[]) {


		int suma;
		int negativo = 0;
		int positivo = 0;
		int contador = Integer.parseInt(JOptionPane.showInputDialog("cuantos numero: "));
		
		for (int i = 1; i < contador ; i++) {
			 suma = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
			
			if (suma > 0) {
				positivo ++;
				
				}	
	
		
		
			else if(suma < 0) {
				negativo++;
			
			}			
		
			System.out.println( " Negativos : " + negativo + " Positivos: " + positivo);
		}
		
	}
}


