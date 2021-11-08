package capitulo05.bloque05;

public class Ejercicio02 {
	public static void main(String[] args) {
		float array[] = new float[20];
		System.out.println("Array Aleatorio:");
		// Inicialización de los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (float)Math.round(Math.random() * (10.00 - 0.00)) + 0;
			   System.out.print(array[i]+"-");
		}
         
		System.out.println("");
	    for (int i = 0; i < array.length; i++) {
	    	
	    	if(array[i]>=5) {
	    		System.out.println("");
	    		 System.out.print("Aprobado: "+ array[i]);
	    		
	    	}
	    	if(array[i] <=5) {
	    		System.out.println("");
	    		 System.out.print("Suspenso: "+ array[i]);
	    		 
	    	}
	    	
	    }
    }
}
