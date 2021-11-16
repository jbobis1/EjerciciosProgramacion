package capitulo05.bloque06;

public class Ejercicio02 {

	public static void main(String[] args) {
		char matriz[][] = new char[10][30]; 	

		for (int i = 0; i< matriz.length; i++) {		
			for (int j = 0; j< matriz.length; j++) {
				matriz [i][j] = "*";
				do {
					matriz [i][j] = ;
					System.out.println("*");
				}while (j <(int)matriz [i][j]);
				do {
					System.out.println(" ");
				}while (j <(int)matriz [i][j]);
				System.out.println(matriz [i][j]+"\t");
			}
			System.out.println();
		}
	}	
}

	

