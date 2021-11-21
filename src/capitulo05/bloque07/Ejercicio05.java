package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio05 {
		public static void main(String[] args) {
		int array[] = new int [] {1,2,6,1,9,1};
		countOccurrences(array);
//		System.out.print(findAndReplace(array));
		}
		
		private static int[] countOccurrences(int[] array) {
			int longitud =array.length;
			
			int n = 1;
			int contador=0;
//			int nuevoarray[] = new int [] {};
			
			for (int i = 0; i < array.length; i++) {
	            if (n == array[i]) {
	                for (int j = i; j < (array.length - 1); j++){
	                    array[j] = array[j + 1];
	                }
	                longitud--;
	                i--;
	                contador++;
	            }
	        }

	        if (contador >= 1) {
	            for (int i = 0; i < array.length - contador; i++) {
	                System.out.print(array[i] + " ");	  
	            }
		}
			return array;
		}	
}