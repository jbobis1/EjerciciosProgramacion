package capitulo05.bloque05;

public class Ejercicio01 {
	public static void main(String[] args) {
		int array[] = new int[10];
		System.out.println("Array Aleatorio:");
		// Inicialización de los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (100 - 0)) + 0;
			   System.out.print(array[i]+"-");
		}
         
		System.out.println("");
	    for (int i = 0; i < array.length; i++) {
	    	
	    	if(array[4] % 2 == 0) {
	    		 System.out.println("El resultado es: "+ -1);
	    		 break;
	    	}
	    	if((array[4]) % 2 != 0) {
	    		 System.out.print("El resultado es: "+ array[4]);
	    		 break;
	    	}
	    }
    }
}
