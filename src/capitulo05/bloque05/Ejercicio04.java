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
		
		inicializar( matriz);
		
		
		invertir(matriz);
		
		unidimensional(matriz);
		
		transponer( matriz);
		
		

	
//		transponer( matriz,  transpuesta);
//		cuadrada(matriz);
		//matriz= cargar(matriz);
//		diagonal( matriz);
//		TriangularSuperior( matriz);
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
			for (int j = 0; j < matriz[i].length; j++) {
			}
		}
		return false;
			
	
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
			
	
//	public static boolean invertir (int matriz[][]) {
//		boolean esPositiva = true;
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[i].length; j++) {
//			    while( matriz > 0 ) {
//			         resto = matriz % 10;
//			         invertido = invertido * 10 + resto;
//			         matriz /= 10;
//			      }
//			}
//		}
//		return esPositiva;
//	}

		
		
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
 	
		
		
		
		
		
		
		
	
	   static void cuadrada(int[][] matriz){
	        int aux;
	    	System.out.println(" ");
			System.out.println(" ");
			System.out.print(" cuadrada");
			System.out.println(" ");
	        for(int i=0;i<matriz.length;i++){
	        	  System.out.println(" ");
	            for(int j=0;j<matriz[i].length;j++){ if(i>j){
	                    aux = matriz[i][j];
	                    matriz[i][j] = matriz[j][i];
	                    matriz[j][i] = aux;
	                    System.out.print(matriz[j][i]+ " ");
	                }
	            }
	        }
	    }
	   
	    static void transponer(int[][] matriz, int[][] transpuesta){
	    	System.out.println(" ");
			System.out.println(" ");
			System.out.print(" transponer");
			System.out.println(" ");
	        for(int i=0;i<matriz.length;i++){
	        	System.out.println(" ");
	            for(int j=0;j<matriz[i].length;j++){
	                transpuesta[j][i] = matriz[i][j];
	                System.out.print(matriz[j][i]+ " ");
	            }
	        }
	    }
	    

	    
		private static void diagonal(int[][] matriz) {
            
		    int sumDiag=0;
	         for(int i=0;i<matriz.length;i++){
	             for(int j=0;j<matriz[0].length;j++){
	                 if(!(i==j)){ //Saltamos las posiciones de la diagonal, estas posiciones no necesitan ser sumadas
	                    sumDiag+=matriz[i][j];
	                 }
	              }
	          }
	          if(sumDiag==0){
	              JOptionPane.showMessageDialog(null, "Es diagonal!!!");    
	     }
		else{
	        JOptionPane.showMessageDialog(null, "No es cuadrada por lo tanto no puede haber diagonal");
	     }    
				
		}	
		
	private static void TriangularSuperior(int[][] matriz) {
	
        int sum=0;
        for(int i=1;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(j<i){
                        sum+=matriz[i][j];      
                }
            }
        }

        if(sum==0){
                JOptionPane.showMessageDialog(null,"Es una matriz triagular superior");
        }
        else{
                JOptionPane.showMessageDialog(null,"No es una matriz triagular superior");
        }
        

    }  
				
	
		
		
		
		
	    public static int[][] cargar(int[][] matriz) {
		       
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.print("Cuantas fila tiene la matriz:");
	        Scanner teclado = new Scanner(System.in);
	        int filas=teclado.nextInt();  
	        int[][] mat = new int[filas][5];	        
	        for (int i = 0; i < mat.length; i++) {
	        	System.out.println(" ");
				for (int j = 0; j < mat[i].length; j++)
				
				matriz[i][j] = (int) Math.round (Math.random() * (+200)) -100;
				}
			return mat;
	    
	    } 
		
}
	
  


	
	


