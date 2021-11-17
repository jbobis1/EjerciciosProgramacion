package capitulo05.bloque06;

public class Ejercicio05 {
	public static void main(String[] args) {
		char matriz[][] = new char[20][10]; 
		int fila, columna;
		int cerouno;
		
		for (int i = 0; i< matriz.length; i++) {
			//Indiciamos el número de asteriscos en cada fila

			for (int j = 0; j < matriz[i].length; j++) {
			//Hay que meter los asteriscos en la matriz	
				
				if (i == 0 || i == matriz.length-1 || j == 0 || j == matriz[i].length-1) {
					matriz[i][j] = '*';
				}
				else {	
					cerouno = (int) ( Math.round(Math.random() *1));
					if(cerouno==0){
						matriz[i][j] = '0';
					}
					if(cerouno==1){
						matriz[i][j] = '1';
					}
				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
			}	
		}
}
