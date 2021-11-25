package capitulo05.bloque07;

public class Ejercicio03 {

	public static void main(String[] args) {
	int array[] = new int [] {1,2,6,1,9};
	int nuevoarray[] = new int [] {};
	addInteger(array, nuevoarray);
//	System.out.print(findAndReplace(array));
	}

	private static int[] addInteger(int[] array, int[] nuevoarray) {
		 nuevoarray = new int [] {array.length+1};

		 for( int i = 0; i < array.length;  i++){
		  for( int j = 0; j < nuevoarray.length;  j++){
			  nuevoarray[j] = array[i];
			  
//			  if (nuevoarray[j]==nuevoarray[nuevoarray.length-1]){
//				  nuevoarray[j]=19;
//			  }
//			  System.out.println(nuevoarray[j]); 
//			
//			  if (nuevoarray[j]==nuevoarray.length-1) {
//				  nuevoarray[j]=19; 
//			  }	  
			  
		  }	//System.out.println(array[j]);
		 }	 
			  for(int i = 0; i < nuevoarray.length;  i++){
				System.out.println(nuevoarray[i]);  
			  }
		  return nuevoarray;
	}
}
	

