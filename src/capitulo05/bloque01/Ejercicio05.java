package capitulo05.bloque01;

public class Ejercicio05 {
	public static void main(String[] args) {
	int numeros[] = new int[150];
	int pares = 0;
	int impares = 0;
	
	// Inicialización de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
			System.out.print(numeros[i] + " ");
			
			 	if ((numeros[0-150] % 2) == 0) {
			 		pares = pares + numeros;
			        System.out.println("El numero: " + pares + " Si es Par");
			    } 
			    else {
			    	impares = impares+numeros;
			        System.out.println("El numero: " + impares + " No es Par");
			    }
		}
	}	
}
