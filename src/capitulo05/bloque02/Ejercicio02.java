package capitulo05.bloque02;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int array1[]=new int[5];
		int array2[]=new int[5];
		int array3[]=new int[5];
		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 5; i++) {
			//creacion del numero aleatorio
			array1[i]=(int)Math.round(Math.random()*(100-0))+0;
			array2[i]=(int)Math.round(Math.random()*(100-0))+0;
			
			System.out.println("Array1: " + array1[i]);
			System.out.println("Array2: " + array2[i]);
			System.out.println("-----");
		}	
		for (int i=0;i<=150; i++) {

			if((i % 2 ) == 0 ) {
				array3[i]= array2[i];
		    }
			  
			else {
				  array3[i]= array1[i];
			}	
			System.out.println(array3[i]);
		}
	}	
}
		

