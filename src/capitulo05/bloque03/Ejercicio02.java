package capitulo05.bloque03;

public class Ejercicio02 {
	public static void main(String[] args) {
		int aux;
		int posicionmenor;
		int array[] = new int[5];
		System.out.println("Array Aleatorio:");
		// Inicialización de los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (5 - 0)) + 0;
			 	System.out.print(array[i]+"-");
		}
        System.out.println(" ");  
      for (int i = 0; i < array.length; i++) { 
    	  	posicionmenor=i;
    	  for(int j = i + 1; j < array.length; j++){
	    	  	if(array[j] < array[posicionmenor]){	
		    	  	posicionmenor=j;
	    	  	}
    	  }
    	  aux=array[posicionmenor];
          for (int j =  posicionmenor; j > i ; j--) {  
         	  	array[j]=array[j-1];                 
           }       
       	array[i]=aux; 
		}
		System.out.println("Array Odenado:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"-");
		}
	}
}
