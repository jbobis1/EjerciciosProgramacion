package examenarray;

public class Ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creamos el primer array
		int array1[] = new int[25];
		arzar(array1); 
		arrayFromMatriz (array1);
	}
	private static void arzar(int[] array1) {
	
		System.out.print("array1: ");
		for (int i = 0; i < array1.length; i++) {
			
			//damos valor al primer array
			array1[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			System.out.print(array1[i] + " ");
		}
		
	}
	@SuppressWarnings("unused")
	public static int[][] arrayFromMatriz (int array1[]) {
		// creamos la matriz con las dimensiones que tiene nuestro array
		int lado = (int) Math.sqrt(array1.length);
		int matriz[][]= new int[lado][lado];
 		int k = 0;
 		System.out.println("");
 		System.out.println("");
 		System.out.println("Matriz:");
		for (int  i=0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
			matriz[i][j] = array1[k];
				k++;
				System.out.println(matriz[i][j]);
			}

		}
		return matriz;
	}
}
