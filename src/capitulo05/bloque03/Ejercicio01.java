package capitulo05.bloque03;

public class Ejercicio01 {
	public static void main(String[] args) {
		int arreglo[] = new int[10];
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.println(arreglo[i]);
		}
		   System.out.println("----");   
		for (int x = 0; x < arreglo.length; x++) {
	        // Aquí "y" se detiene antes de llegar
	        // a length - 1 porque dentro del for, accedemos
	        // al siguiente elemento con el índice actual + 1
			for (int i = 0; i < arreglo.length; i++)  {
	            int elementoActual = arreglo[i],
	                    elementoSiguiente = arreglo[i+1];
	            if (elementoActual > elementoSiguiente) {
	                // Intercambiar
	                arreglo[i] = elementoSiguiente;
	                arreglo[i + 1] = elementoActual;           	                
	            }
	            System.out.println(arreglo[i]);
	        }
	    }
	}
}