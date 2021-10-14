package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	
		public static void main(String args[]) {
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: ")); ;
			int negativos = 0;
			int positivos = 0;
			
			if (numero >0) {
				positivos++;
			}	
			
			if (numero <0) {
				negativos++;
			}	
			

		
			for (;numero != 0;) {
					numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
							 
				if (numero >0) {
					positivos++;
				}	
				else	
					if (numero <0) {
						negativos++;
				}	
					
					else{
						
					}
			}

			System.out.println( "Positivos: " + positivos + " Negativos : " + negativos );

		}

	

}
