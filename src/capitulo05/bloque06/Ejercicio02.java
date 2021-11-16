package capitulo05.bloque06;

public class Ejercicio02 {

	public static void main(String[] args) {
		char matriz[][] = new char[10][30]; 
		int asteriscos;
		for (int i = 0; i< matriz.length; i++) {
			//Indiciamos el número de asteriscos en cada fila
			asteriscos = (int) ( Math.round(Math.random() *30));		
			for (int j = 0; j<asteriscos; j++) {
			//Hay que meter los asteriscos en la matriz			
				matriz[i][j]='*';
				System.out.print(matriz[i][j] + " ");		
			}
			System.out.println(" ");
			}	
		}
	}	

