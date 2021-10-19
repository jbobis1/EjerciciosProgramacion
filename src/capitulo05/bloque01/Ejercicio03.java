package capitulo05.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[150];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
			 int[] invertido = new int[numeros.length];
		}
		for(int i=0;i<numeros.length;i++){
		            invertido[i] = numeros[numeros.length-1-i];
		        }
		        numeros = invertido;
		     
			System.out.print(numeros[i] + " ");
		
		

	}
	
}
	


