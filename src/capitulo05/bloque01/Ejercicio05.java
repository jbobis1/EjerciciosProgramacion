package capitulo05.bloque01;

public class Ejercicio05 {
	public static void main(String[] args) {
	int numeros[] = new int[150];
	int pares = 0;
	int impares = 0;
	
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
		
			
			 	if ((numeros[i] % 2) == 0) { 
			 		pares = pares + numeros[i];
			    } 
			    else {
			    	impares = impares + numeros[i];
			    }
		}
		 System.out.println("Suma de numero Impares: " + impares );
		 System.out.println("Suma de numero Pares: " + pares  );
	}	
}
