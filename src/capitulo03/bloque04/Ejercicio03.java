package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String args[]) {

		int numero = 0;
		int i = 1;
		
		while(numero < 12) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Que tabla de Multiplicar quieres: "));

			if(numero == 0 ) 
				{System.out.print("FIN");
			} 
			
			else {
			}
			numero++;
			//i++;
		}		
		System.out.println(numero + " x " + i + " = " + (numero * i));
	}		
}

	
	


