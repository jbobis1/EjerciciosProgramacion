package capitulo05.bloque01;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		int numeros[] = new int[150];
		
		System.out.print("No invertidos ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
			System.out.print(numeros[i] + " ");
		}

		System.out.print( "\nNumero invertidos ");
		   for (int i = 0; i < numeros.length/2; i++) {
		        int aux = numeros[i];
		        numeros[i] = numeros[numeros.length - 1 - i];
		        numeros[numeros.length - 1 - i] = aux;
		        
		    	System.out.print( + numeros[i] + " ");
		    }
	}
}
	


