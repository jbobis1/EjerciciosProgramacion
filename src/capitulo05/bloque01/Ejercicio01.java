package capitulo05.bloque01;



public class Ejercicio01 {
	public static void main(String[] args) {
	
		int numeros[] = new int[150];
		
		
		// Inicialización de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
		}

		// Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	
	}
}
