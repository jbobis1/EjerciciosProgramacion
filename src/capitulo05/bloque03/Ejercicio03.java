package capitulo05.bloque03;

public class Ejercicio03 {
	public static void main(String[] args) {
		int aux;
		int arreglo[] = new int[10];
		int saltos[] = new int[] {6,4,3,2,1};
		
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.print(arreglo[i]+"-");
		}
        System.out.println();  
		
	    for (int i = 0; i < saltos.length; i++) {
	    	for (int j = 0; j < arreglo.length; j++) {
	    		if(j + saltos[i] < arreglo.length) {
	    			if(arreglo[j]>arreglo[j + saltos[i]]) {
	    			aux = arreglo[j];
	    			arreglo[j]=arreglo[j + saltos[i]];
	    			arreglo[j + saltos[i]]=aux;	
	    			}
	    		}
	    	}
	    } 	    
		System.out.println("Array Odenado:");
	    for (int i = 0; i < arreglo.length; i++) {
	    	System.out.print(arreglo[i]+"-");  
	    }
    }
}
