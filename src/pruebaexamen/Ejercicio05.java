package pruebaexamen;

import javax.swing.JOptionPane;

public class Ejercicio05 {
	public static void main(String[] args) {	
		int numeros[] = new int[4];
		
		System.out.print("-No Invertidos: ");
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)Math.round(Math.random() * (20 - 1)) + 1;
			System.out.print(numeros[i] + " ");

		}
		System.out.println( " ");
		for (int i = 0; i < 1; i++) {
			int buscar = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			if (numeros[i]==buscar) {
				System.out.print(numeros[i] + " Encontrado ");
			}
			else {
				System.out.println(buscar + " No encontrado ");
				
			}
			
		
			
		}
	}

}
