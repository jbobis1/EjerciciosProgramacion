package capitulo05.bloque07;

public class Ejercicio02 {
	public static void main(String[] args) {
	int array[] = new int [] {1,2,6,1,9,};	
	findAndReplace(array);
//	System.out.print(findAndReplace(array));
	}

	public static void findAndReplace(int array[]) {
		  for(int i = 0; i <= array.length; i++){
	        if(array[i]==1) {
	        	array[i]=7;
	        }
	        System.out.println(array[i]);
		  }
	}		
}
