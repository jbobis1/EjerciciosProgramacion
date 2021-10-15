package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio01 {
		public static void main (String args[]) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
			int i = 2;
			boolean numeroEsPrimo = true;
			
			while(i<(numero/2+1)) {
				
				if((numero % i) == 1 ) {
					numeroEsPrimo = false;
				}
				else {
					numeroEsPrimo = true;
				}
				
				

				i++;
			}
			if (numeroEsPrimo == true) {
				System.out.println("el número " + numero + " es primo");
			}
			
			else{
				System.out.println("el número " + numero + " no primo");				
			}2
		}
}

