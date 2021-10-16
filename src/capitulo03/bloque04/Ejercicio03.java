package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main (String args[]) {
		int numero = 1;
		int i = 1;
		
		do{	

		do{	
		System.out.println(numero + " x " + i + " = " + (numero * i));
		i++;
		
		}while(i<=10);
		i=1;
		numero++;
		
		}while(numero<=15); 
		
		
	}		
}

	
	


