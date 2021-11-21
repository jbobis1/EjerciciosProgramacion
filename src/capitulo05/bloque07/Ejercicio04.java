package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {
	int n = 1;
	int array[] = new int [] {1,2,6,1,9,1};
	int contador=0;
	countOccurrences(array, contador, n);
//	System.out.print(findAndReplace(array));
	}

	private static int countOccurrences(int[] array,int contador,int n ) {
		  for(int i = 0; i < array.length; i++){  
			  if (array[i]==n) {		 
				  contador++;	  
			  }	 
		  }	 
		  System.out.println("Numero de veces que se repite el numero es: " + contador);	
		  return contador;
	}
	
}
	

