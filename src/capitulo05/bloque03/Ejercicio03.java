package capitulo05.bloque03;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		int numeros[] = new int[150];
		
		
		// Inicialización de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (1000 - 0)) + 0;
		}
	
	}
}
