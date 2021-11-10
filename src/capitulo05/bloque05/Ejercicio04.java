package capitulo05.bloque05;

public class Ejercicio04 {
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		crearmatriz(matriz);
		mostar(matriz);
		positivos(matriz);
		
	}
	
	private static void crearmatriz(int[][] matriz) {
	// TODO Auto-generated method stub
		for (int i = 0; i < matriz.length; i++) {	
			for (int j = 0; j < matriz[i].length; j++)
			
			matriz[i][j] = (int) Math.round (Math.random() * (+200)) -100;
			}
		
		}
	private static void mostar(int[][] matriz) {
		System.out.println("Mostrar la Matriz");
		for (int i = 0; i < matriz.length; i++) {	
			System.out.println("");
			for (int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] +" ");
		}
		
	}
	

	
	private static void positivos(int[][] matriz) {
		System.out.println(" ");
		System.out.println(" ");
		System.out.print(" valores Positivos");
		System.out.println(" ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matriz[i].length; j++)
				if(matriz[i][j]>=0) {
		    		System.out.print(matriz[i][j]+ " ");
		    	}
		    	else{
		    		 
		    	}
		    }
		}
		
	}
	
	


