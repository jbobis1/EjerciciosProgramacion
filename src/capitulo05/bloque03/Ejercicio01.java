package capitulo05.bloque03;

public class Ejercicio01 {
	public static void main(String[] args) {
		int array[] = new int[150];
		System.out.println("Array Aleatorio:");
		// Inicialización de los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
			   System.out.print(array[i]+"-");
		} 
			boolean hayIntercambios;
			do {
				hayIntercambios = false;
				// Empieza el algoritmo
				for (int i = 0; i < array.length-1; i++) {
					if (array[i+1] < array[i]) {
						// Entonces hago un intercambio
						int aux = array[i+1];
						array[i+1] = array[i];
						array[i] = aux;
						hayIntercambios = true;			
					}
						
				}
			}while (hayIntercambios == true);
			System.out.println("");
			System.out.println("");
			
			System.out.println("Array Odenado:");
			for (int i = 0; i < array.length-1; i++) {
				System.out.print(array[i]+"-");
			}
	}
			
}
	

