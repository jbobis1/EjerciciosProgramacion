package pruebaexamen;

public class Bolos {
	public static void main(String[] args) {
		int matriz[][] = new int[4][4]; 
		crearmatriz( matriz);
		dar( matriz);
		Probavilidad();
		tira ( matriz);
	}
		
		public static int[][]crearmatriz(int matriz[][]){
			
			int bolos = 1 ;
			
			for (int i = 0; i< matriz.length; i++) {
				//Indiciamos el número de asteriscos en cada fila
				for (int j = 0; j < matriz[i].length; j++) {
				//Hay que meter los asteriscos en la matriz	
					
					if (i == 0 && j >=0)  {
						matriz[i][j] = bolos;
					}
					if (i == 1 && j >=1)  {
						matriz[i][j] = bolos;
					}
					if (i == 2 && j >=2)  {
						matriz[i][j] = bolos;
					}
					if (i == 3 && j >=3)  {
						matriz[i][j] = bolos;
					}
					else if (matriz[i][j] != bolos) {
						matriz[i][j] = 0;
					}
		
					
				}
				
			}
			return matriz;	
		}

		public static void dar(int matriz[][]){
			for (int i = 0; i< matriz.length; i++) {
				System.out.println( " ");
				for (int j = 0; j < matriz[i].length; j++) {	
					System.out.print(matriz[i][j] + " ");
				}
			}	
		}
		
		public static int  Probavilidad(){
			int probavilidad =(int)Math.round(Math.random() * 100) ;
			return probavilidad;
		}
		
		public static int[][]  tira(int matriz[][]){
			
			for (int i = 0; i< matriz.length; i++) {
				//Indiciamos el número de asteriscos en cada fila
				for (int j = 0; j < matriz[i].length; j++) {
				
				do {
					
					int  tiro =Probavilidad();
					if (tiro >=50 && matriz[i][j]== 1){
						matriz[i][j]=0;	
					}
					if (tiro <=50 && matriz[i][j]== 1){
						matriz[i][j]=1;	
					}
				}while(matriz[i][j]!= 0);
				System.out.println(matriz[i][j]);
					
					
				}
			}
			return matriz;
		}

}