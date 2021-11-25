package pruebaexamen;

public class Ejercicio06 {
	
	
	public static void main(String[] args) {	
		int numeros[] = new int[5];
		
		System.out.print("Array");
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)Math.round(Math.random() * (20 - 1)) + 1;
			System.out.print(numeros[i] + " ");

		}
		System.out.println(" ");
		System.out.println("Invertido");
		for (int i = 0; i < numeros.length; i++) {
			
			int azar = (int)Math.round(Math.random() * (1 - 0)) +0;
			if(azar==0) {
				numeros[i] = -numeros[i];
			}
			
			else if(azar!=0) {
				
				numeros[i] = numeros[i];

			}
			
			System.out.print(numeros[i]+" ");
		}
		
	}
}
