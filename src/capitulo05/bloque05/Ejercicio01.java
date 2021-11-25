package capitulo05.bloque05;

public class Ejercicio01 {
	public static void main(String[] args) {
		int array[] = new int[9];
		int longitud;
		empezararray(array);
		longitud = examinarLongitudDelArray(array);
		// Inicialización de los valores del array
		System.out.println("longitud del array: "+ array.length);
		System.out.println(examinarLongitudDelArray(array));
	}
		
	public static void empezararray(int array[]){	
			
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)Math.round(Math.random() * (100 - 0)) + 0;
				System.out.print(array[i]+" "); 
				
			}
    }
	
	public static int examinarLongitudDelArray(int[] array){	
		System.out.println(" "); 
		if(array.length % 2==0 ) {
			//Longitud es par
			return -1;
		}
		else {
		return array[(array.length-1)/2];
		}
	}
}
