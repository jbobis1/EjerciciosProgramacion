package capitulo05.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero []=new int[150];
		int multiplcar=Integer.parseInt(JOptionPane.showInputDialog("numero que multiplicar: "));

		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 150; i++) {
			//creacion del numero aleatorio
			numero[i] = (int)Math.round(Math.random() * (100 - 0)) +0;
			System.out.println("-----");
			System.out.println("Array Normal: " +numero[i]);
			System.out.println("Array multiplicar: " +numero[i]*multiplcar);
			System.out.println("-----");
		}
			
	}	
}
	

