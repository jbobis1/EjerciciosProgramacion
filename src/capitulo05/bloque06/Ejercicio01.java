package capitulo05.bloque06;

public class Ejercicio01 {
	public static void main(String[] args) {
		int array[] = new int[7];
		
		crear(array); 
		mostrar(array);
		
	}
	private static void crear(int[] array) {
		System.out.println("Array Aleatorio:");
		// creamos el bucle de creacion del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (49 - 0)) + 0;
		//bucle de j que recorrere los todos lo varores y los repetodos los cambiara
		  	for (int j=0;j < i ; j++){
        		if (array[i] == array[j]){
        		i--;
        		}
		  	}      
		} 
	}
	private static void mostrar(int[] array) {
		// recorremos el array para ya mostrarlo
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			 
		}	
    }

}
