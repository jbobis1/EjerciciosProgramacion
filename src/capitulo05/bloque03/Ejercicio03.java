package capitulo05.bloque03;

public class Ejercicio03 {
	public static void main(String[] args) {
		int actual;
		int arreglo[] = new int[10];
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.println(arreglo[i]);
		}
        System.out.println();  

		
	    for (int i = 0; i < arreglo.length; i++) {
 
	    	actual=arreglo[i];
	    	
            for (int j = 0;j < arreglo.length - 1; j++) {
                int elementoActual = arreglo[j],
                        elementoSiguiente = arreglo[j + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[j] = elementoSiguiente;
                    arreglo[j + 1] = elementoActual;
                }
                

            }
            
        }
	    for (int i = 0; i < arreglo.length; i++) {
	    	System.out.println(arreglo[i]);  
	    }

    }
}
