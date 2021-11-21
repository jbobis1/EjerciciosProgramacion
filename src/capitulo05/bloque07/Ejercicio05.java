package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio05 {

		public static void main(String[] args) {
		int n = 1;
		int array[] = new int [] {1,2,6,1,9,1};
		int contador=0;
		countOccurrences(array, contador, n);
//		System.out.print(findAndReplace(array));
		}

		private static int[] countOccurrences(int[] array,int contador,int n ) {
			
			int k=0;
			int nuevoarray[] = new int [] {};
			  for(int i = 0; i < array.length; i++){  
				  
				  if (array[i] != n) {		 
					  nuevoarray[k]=array[i];
					  k++;
					  System.out.println(nuevoarray[k]);
				  } 
//				  System.out.println("Numero de veces que se repite el numero es: " + nuevoarray[k]);
			  }	 
			  return nuevoarray;
		}
}	