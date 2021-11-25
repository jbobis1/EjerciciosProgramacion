package pruebaexamen;

public class array_matriz {
	public static void main(String[] args) {
		int matriz[][] = new int[][] {  {1,		2, 		0, 		0, 		0},
										{0, 	7, 		0, 		0, 		0},
										{0, 	0, 		6, 		0, 		0},
										{0, 	0, 		0, 		18, 	0},
										{0, 	0, 		0, 		0, 		19}};

		arrayFromMatriz(matriz);

	}	
		
	
		public static int[] arrayFromMatriz (int matriz[][]) {
			int array[] = new int[matriz.length * matriz[0].length];
			int k = 0;
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					array[k] = matriz[i][j];
					k++;
					
				}
				
			}
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			
		return array;
	}		
}

