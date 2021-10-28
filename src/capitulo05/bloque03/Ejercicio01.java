package capitulo05.bloque03;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		int array[] = new int[150];
		boolean  hayIntercambios = false;
		
		// Inicialización de los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (1000 - 0)) + 0;
		}
		for (int i = 1; i < array.length-1; i++);{
			
			if(array[i] > array[i+1]) {
				array[i] = array[i] > array[i+1];
				boolean  hayIntercambios = true;
						
			}
			if(hayIntercambios)	System.out.println("aray ordenado " + array[i]);
		}
	}
}


