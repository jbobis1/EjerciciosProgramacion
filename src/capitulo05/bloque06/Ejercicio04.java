package capitulo05.bloque06;

public class Ejercicio04 {
	public static void main(String[] args) {
		char matriz[][] = new char[20][10]; 
		int asteriscos, fila, columna;

		fila = (int)Math.round(Math.random() * (18 - 1)) + 1;	
		columna = (int)Math.round(Math.random() * (8 - 1)) + 1;

		for (int i = 0; i< matriz.length; i++) {
			//Indiciamos el número de asteriscos en cada fila

			for (int j = 0; j < matriz[i].length; j++) {
			//Hay que meter los asteriscos en la matriz	
				
				if (i == 0 || i == matriz.length-1 || j == 0 || j == matriz[i].length-1) {
					matriz[i][j] = '*';
				}
				
//				else if( i<4 || i>6) {
//					matriz[i][j] = '*';
//				}
//				
				else if(i==fila && j==columna) {
					matriz[fila][columna]='0';
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



