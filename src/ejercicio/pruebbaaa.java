package ejercicio;

public class pruebbaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			int array[] = new int [] {1,2,3,4,5,6};
		
			mostrar( array);

			mezclar( array);
			mostrar( array);
			
		
	}
	public static int[] mezclar(int  array[]) {
		
		for (int i = 0; i < array.length; i++) {
		int pos1 = (int) Math.round(Math.random() * (array.length-1));
			int pos2 = (int) Math.round(Math.random() * (array.length-1));
			int aux = array[pos1];
			array[pos1] = array[pos2];
			array[pos2] = aux;
		}
		return array;
	}
	public static void mostrar(int array[]) {
		System.out.println("ARRAY: ");	
		for(int i= 0; i < array.length; i++ ) {
			System.out.print(array[i]+" ");			
		}
		System.out.println(" ");
	}

}
