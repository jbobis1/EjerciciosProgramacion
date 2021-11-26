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
	public static int[] arrayFromMatriz (int array1[]) {
		// creamos la matriz con las dimensiones que tiene nuestro array
		int[][] matriz= new int[array1.length / array1[0].length;
 		int k = 0;
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
		{
				array1[i] = matriz[j][k];
				k++;
				
			}
			
		}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
			System.out.println(matriz[i][j]);
					
			}
			
			return matriz;
		}		
	}
}
