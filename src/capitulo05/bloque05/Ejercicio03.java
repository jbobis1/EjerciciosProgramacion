package capitulo05.bloque05;

public class Ejercicio03 {
	public static void main(String[] args) {

			
			//Declaramos las variables
			double array1[]=new double[20];
			double array2[]=new double[20];
		
			
			//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
			for (int i = 0; i < array1.length ||i < array2.length; i++) {		//creacion del numero aleatorio
				array1[i] = (int) Math.round (Math.random() * (100.00-0.0)) + 0;
				array2[i] = (int) Math.round (Math.random() * (1.0-0.0)) + 0;
				
				System.out.println("Array1: " + array1[i]);
				System.out.println("Array2: " + array2[i]);
				System.out.println("-----");
			}	
	}
		
}
