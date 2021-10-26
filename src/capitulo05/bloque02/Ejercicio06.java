package capitulo05.bloque02;

import javax.swing.JOptionPane;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero []=new int[5];
		int desplazamientos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Movimiento a la izquierda: 0 Movimiento a la derecha: 1"));
		System.out.println("Numero de "+ desplazamientos );
		int j = 0;
		int ultimo;
		int primero;
		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 5; i++) {
			//creacion del numero aleatorio
			numero[i] = (int)Math.round(Math.random() * (100 - 0)) +0;
			System.out.println("Array Normal: " +numero[i]);
		
		}
		switch (opcion) {
		case 1:
			while(j<desplazamientos) {
				ultimo =numero[4];
				for(int i=3;i>=0;i--) {
					numero[i+1]=numero[i];				
				}
				numero[0]=ultimo;
				System.out.println("---");
				System.out.println("Mostrar la Posicion");
				
				for(int i=0;i<5;i++) {
					System.out.println("Numero de "+ desplazamientos +" arrary "+numero[i]);
				}
				j++;
			}
		case 0:
			while(j<desplazamientos) {
				primero =numero[0];
				for(int i=0;i>=numero.length;i++) {
					numero[i]=numero[i+1];				
				}
				numero[numero.length-1]= primero;
				System.out.println("---");
				System.out.println("Mostrar la Posicion");
				
				for(int i=0;i<5;i++) {
					System.out.println("Numero de "+ desplazamientos +" arrary "+numero[i]);
				}
				j++;
			}
		}
	}
}

