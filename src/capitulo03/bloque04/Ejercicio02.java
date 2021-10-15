package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main (String args[]) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
		int i = 2;
		int minimo = 0;
		int maximo = 1000;
		
		boolean numeroEsPrimo = true;
		
		while(i<(numero/2+1) numero <= minimo & numero => maximo) {
			
			if((numero % i) == 1) {
				numeroEsPrimo = false;
			}
			else {
				numeroEsPrimo = true;
			}
			
			

			i++;
		}
		if (numeroEsPrimo == true) {
			System.out.println("el numero " + numero + " es primo");
		}
		
		else{
			System.out.println("el numero " + numero + " no primo");				
		}
	}
}

