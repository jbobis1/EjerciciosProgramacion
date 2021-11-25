package pruebaexamen;

public class Ejercicio03 {
	public static void main(String[] args) {	
		int numeros[] = new int[20];
		
		System.out.print("-No Invertidos: ");
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)Math.round(Math.random() * (100 - 25)) + 25;
			System.out.print(numeros[i] + " ");
			if (numeros[i] % 2 ==0) {
				}
			
			if (numeros[i] % 2 !=0) {
				numeros[i]=numeros[i];
				i--;
			}
		}
		System.out.println( " ");
		for (int i = 0; i < numeros.length; i++) {
			
			
			System.out.print(numeros[i] + " ");
		
			
		}
	}
}