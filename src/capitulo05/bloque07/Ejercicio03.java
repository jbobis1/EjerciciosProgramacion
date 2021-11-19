package capitulo05.bloque07;

public class Ejercicio03 {

	public static void main(String[] args) {
	int array[] = new int [] {1,2,6,1,9,};
	int nuevoarray[] ;
	addInteger(array, nuevoarray);
//	System.out.print(findAndReplace(array));
	}

	private static void addInteger(int[] array, int[] nuevoarray) {
		  for(int i = 0; i <= array.length+1; i++){
			  nuevoarray[i] = array[i];
			  
			  if (i==array.length+1) {
				  nuevoarray[i]=10; 
			  }
		  }	  
		  System.out.println(nuevoarray);
	}
}
	

