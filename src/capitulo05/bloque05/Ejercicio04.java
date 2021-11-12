package capitulo05.bloque05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {
		int matriz[][] = new int[][] {  	
			{1,	1, 1},
			{1, 1, 1},	
			{1, 1, 1}};		
	//	int[][] transpuesta = new int[5][5];
			
	//	crearmatriz(matriz);
			
		mostar(matriz);
		System.out.println("" );
		
		positivos(matriz);
		System.out.println("Matriz positiva: " + positivos(matriz));
		
		diagonal1( matriz);
		System.out.println("La matriz es diagonal: " + diagonal1(matriz));
		
		triangularsuperio(matriz);
		System.out.println("La matriz es triangular: " + triangularsuperio(matriz));
		
		simetrica(matriz);
		System.out.println("La matriz es simetrica: " + simetrica(matriz));
		
		dispersa (matriz);
		
//		inicializar( matriz);
		
		invertir (matriz);
		System.out.println ("La matriz es invertida: "  + invertir(matriz));
		
		
		unidimensional(matriz);
		System.out.println ("La matriz es invertida: "  + unidimensional(matriz));
		
		transponer(matriz);
		System.out.println ("La matriz es invertida: "  + transponer(matriz));
		
		
		
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
	

	
	public static boolean positivos (int matriz[][]) {
		boolean esPositiva = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					esPositiva = false;
				}
			}
		}
		return esPositiva;
	}
	
	
	public static boolean diagonal1 (int matriz[][]) {
		boolean esPositiva = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				 if(matriz[i][j]!= matriz[j][i]){		 
					
					 esPositiva = false;
	             }
			}
		}
		return esPositiva;
	}
	
	public static boolean triangularsuperio(int[][] matriz) {
		boolean esPositiva = true;
		int n=3;
    	
		  int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];
		  int tri_sup = 1;
		    for(int i=0;i < n-1;i++)
		    {
		        for(int j= n-1;j > 0+i; j--)
		        {
		            if(matriz[j][i] == 0) {
		            	 tri_sup = 1;
		            	 esPositiva = true;
		            }
		               
		            else {
		                tri_sup = 0;
		                esPositiva = false;
		            }
		        }
		    }
		    return esPositiva;
            }
	
	public static boolean dispersa (int matriz[][]) {
		

		for (int i = 0; i < matriz.length; i++) {
			boolean esPositiva = false;
			
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]==0) {
				 esPositiva = true;
	
			}
				if(matriz[i][j]!=0) {
					return false;
				}
			}	
		}
	}
	
    public static boolean simetrica(int matriz[][]){
        for(int i=0; i < matriz.length; i++){
            for(int j=0; j < matriz[i].length ; j++){
                if(matriz[i][j] != matriz[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
			
	
	public static void invertir (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
	            if(matriz[j][i] > 0) {
	            	matriz[i][j]= matriz[j][i]*(-1);
	            	
	            } 
	            else {  
	            	matriz[i][j]= matriz[j][i]*(+1);
	            }		      
			}
		}
	}

		
		
   public static void inicializar(int matriz[][]){
        System.out.println("Inicializando la matriz...\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("filas de la matriz: ");
        int fila = sc.nextInt();
        matriz = new int[fila][5];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.printf("Introduce el valor fila %d - columna %d: ", (i+1), (j+1));
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

 	
	private static void transponer(int[][] matriz) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.print(" transponer");
			System.out.println(" ");
				for(int i=0;i<matriz.length;i++){
					System.out.println(" ");
				    for(int j=0;j<matriz[i].length;j++){
				    	 matriz[i][j] = matriz[j][i];
				    		  }
				    }
				}
	
			

		
		public static boolean unidimensional(int matriz[][]){
			int array[] = new int[50];
		
		    for(int i=0; i < matriz.length; i++){
		        for(int j=0; j < matriz[i].length ; j++){
		        array[i*matriz[i][j].length]= matriz[i][j];
		      
		            }
		        }
		    }
}  
	
	


