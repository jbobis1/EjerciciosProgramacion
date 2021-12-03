package examen03;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int matriz[][] = new int[][] {  {1,2,3,4},
											{5,6,7,	8},
											{9,10,11,12},
											{13,14,15,16},
											{17,18,19,20}};
											
	System.out.println("Matriz diagonal: " + esMatrizDiagonal(matriz));			
	
	}
	public static boolean esMatrizDiagonal (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if ( (matriz[i][j] +  1) != matriz[i+1][j+1] && (matriz[i][j] +  1) != matriz[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}


