package capitulo05.bloque03;

public class Ejercicio01 {
	public static void main(String[] args) {
		int interacion =0;
		int array[] = new int[150];
		boolean  hayIntercambios = false;
		
		// Inicialización de los valores del array
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (1000 - 0)) + 0;
		}
		
		while (hayIntercambios) {
			hayIntercambios=false;
			interacion++;
			for (int i = 0; i < array.length-interacion; i++);{
				
				if(array[i] > array[i+1]) {
					int temp=array[i];
					array[i] = array[i+1]; 
					array[i]=temp;
					
					hayIntercambios = true;		
				}
				
				if(hayIntercambios)	System.out.println("aray ordenado " + array[i]);
			}
		}
	}
}
