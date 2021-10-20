package capitulo05.bloque01;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		
		int numeros[] = new int[150];
		int pos =-1;
		
		Scanner leer =new Scanner(System.in);
		System.out.println("Introduce un Numero: ");
		int n= leer.nextInt();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
				if(numeros[i]==n) {
					pos=i;
				}
		}
			if(pos==-1) {
			System.out.print("Numero no encontrado");
			}
			else{
				System.out.print("La posicion de "+ n + " es: "+ pos);
			}
	}
}
