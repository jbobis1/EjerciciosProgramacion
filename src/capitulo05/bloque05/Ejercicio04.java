package capitulo05.bloque05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {
		int matriz[][] = new int[][] {  	
			{1,		0, 	0},
			{0, 	7, 	1},	
			{0, 	0, 	5}};

	//		int[][] transpuesta = new int[5][5];
	//	crearmatriz(matriz);
		mostar(matriz);
		positivos(matriz);
		System.out.println("Matriz positiva: " + positivos(matriz));
		
		diamgonal( matriz);
		System.out.println("La matriz es diagonal: " + diamgonal(matriz));
		
//		simetrica(matriz);
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
	
	
	public static boolean diamgonal (int matriz[][]) {
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

	
	
	
	
		public static int[][] simetrica(int[][] matriz) {
	    	System.out.println(" ");
			System.out.println(" ");
			System.out.print(" simetrica");
			System.out.println(" ");
			  int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];
					
			  for (int x=0; x < matriz.length; x++) {
				  System.out.println(" ");
			    for (int y=0; y < matriz[x].length; y++) {
			      nuevaMatriz[y][x] = matriz[x][y];
			      System.out.print(matriz[y][x]+ " ");
			      
			    }
			  }		
			  return nuevaMatriz;
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
	
  


	
	


