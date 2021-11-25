package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {

	int array[] = new int [] {1,2,6,1,9,1};

	int contadorOcurrencias=countOccurrences(array, 1);
	System.out.print("El valor buscado aparece: " + contadorOcurrencias + " veces");
	}

	private static int countOccurrences(int[] array,int n ) {
		int contador=0;
		  for(int i = 0; i < array.length; i++){  
			  if (array[i]==n) {		 
				  contador++;	  
			  }	 
		  }	 
		  	
		  return contador;
	}
	
}
	

