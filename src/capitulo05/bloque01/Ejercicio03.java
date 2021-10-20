package capitulo05.bloque01;

public class Ejercicio03 {
	
	public static void main(String[] args) {	
		int numeros[] = new int[150];
		
		System.out.print("-No Invertidos: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
			System.out.print(numeros[i] + " ");
		}
		
		System.out.print( "\n ---Invertidos: ");
		
		for (int i = 149; i >= 0;) {
			System.out.print( + numeros[i] + " ");
			i--;
		}
	}
}
	


