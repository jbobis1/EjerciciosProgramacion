package capitulo05.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero []=new int[5];
	
		int ultimo;
		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 5; i++) {
			//creacion del numero aleatorio
			numero[i] = (int)Math.round(Math.random() * (100 - 0)) +0;
			System.out.println("Array Normal: " +numero[i]);

		
		}
		ultimo =numero[4];
		for(int i=3;i>=0;i--) {
			numero[i+1]=numero[i];
			
			
		}
		numero[0]=ultimo;
		
		System.out.println("Mostrar la Posicion");
		for(int i=0;i<5;i++) {
			System.out.println("arrary +1 "+numero[i]);
		}
	}
		
}	



