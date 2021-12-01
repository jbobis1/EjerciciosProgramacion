package examenarray;

public class Ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creamos el primer array
		int array[] = new int[25];
		int matriz[][];
		arzar(array); 
//		arrayFromMatriz (array);
		matriz = convierteArrayEnMatriz(array);
		
		muestraMatriz(matriz);
	}
	
	private static void arzar(int[] array) {
	
		System.out.print("array: ");
		for (int i = 0; i < array.length; i++) {
			
			//damos valor al primer array
			array[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			System.out.print(array[i] + " ");
		}
		
	}
	@SuppressWarnings("unused")
	public static int[][] convierteArrayEnMatriz (int array[]) {
		int lado = (int) Math.sqrt(array.length);
		int matriz[][] = new int[lado][lado];
		int k = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = array[k];
			k++;
			}
		}
		
		return matriz;
		
	}
	/**
	 * 
	 * @param matriz
	 */
	public static void muestraMatriz (int matriz[][]) {
		System.out.println(" ");
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
