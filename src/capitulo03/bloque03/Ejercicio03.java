package capitulo03.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	public static void main (String args[]) {

		tablaMultiplicar();
	}
	public static void tablaMultiplicar () {
		int numero = 1;
		
		
		for(;numero !=0;) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
			
			
			if(numero == 0 ) 
				{System.out.print("aDIOS");
			} 
			
			else {
				
				for (int i = 1; i < 11; i++) {
					System.out.println(numero + " x " + i + " = " + (numero * i));
				}
			}
	}	
	}
}