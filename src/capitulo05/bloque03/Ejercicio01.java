package capitulo05.bloque03;

public class Ejercicio01 {
	public static void main(String[] args) {
		int array[] = new int[10];
		// Inicialización de los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.println(array[i]);
		}
		   System.out.println("----");   
			boolean hayIntercambios;
			do {
				hayIntercambios = false;
				// Empieza el algoritmo
				for (int i = 0; i < array.length - 1; i++) {
					
					if (array[i+1] < array[i]) {
						
						// Entonces hago un intercambio
						int aux = array[i+1];
						array[i+1] = array[i];
						array[i] = aux;
						hayIntercambios = true;
						System.out.println(array[i]);	
					}
					
					
				}
			} while (hayIntercambios == true);
			
		}
	}

