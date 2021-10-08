package capitulo03.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main (String args[]) {

		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero Que quieres:  "));
		int numero = 0 ;
		int suma;
		float media;
				
		for (int i = 0; i < cantidad; i++) {
			 suma = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			 numero = suma + numero;
		}			
						
		media = numero / cantidad;
		System.out.println(" La media es : " + media);
	}
}

	
	
	
	

