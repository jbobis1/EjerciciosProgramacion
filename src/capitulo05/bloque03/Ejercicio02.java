package capitulo05.bloque03;

public class Ejercicio02 {
	public static void main(String[] args) {
		boolean permanecer = true;
		int interaccion=0;
		int arreglo[] = new int[10];		
		
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.println(arreglo[i]);
		}
		   System.out.println("----");
		while (permanecer) {  
			permanecer=false;
			 interaccion++;
			
			for (int x = 0; x < arreglo.length; x++) {
				
	            int elementoActual = arreglo[x],
	                    elementoSiguiente = arreglo[x +1];
		            if ( arreglo[x] >  arreglo[x+1]) {
		            	permanecer=true;
		                // Intercambiar
		                arreglo[x] = elementoSiguiente;
		                arreglo[x + 1] = elementoActual;           	                
		            }
		            if(permanecer)System.out.println(arreglo[x]);  
		    }
		}
	}
}
