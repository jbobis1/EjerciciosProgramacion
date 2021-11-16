package capitulo05.bloque06;

public class Ejercicio04 {
	public static void main(String[] args) {
		char matriz[][] = new char[20][10]; 
		int asteriscos, fila, columna;
		
		
		for (int i = 0; i< matriz.length; i++) {
			//Indiciamos el número de asteriscos en cada fila
			fila = (int) ( Math.round(Math.random() *20));	
			columna = (int) ( Math.round(Math.random() *10));


			for (int j = 0; j < matriz[i].length; j++) {
			//Hay que meter los asteriscos en la matriz	
				matriz[i][j]=matriz[fila][columna];
				if (i == 0 || i == matriz.length-1 || j == 0 || j == matriz[i].length-1) {
					matriz[i][j] = '*';
				}
				
				else {
					matriz[i][j]=' ';
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
			}	
		}
	}	



