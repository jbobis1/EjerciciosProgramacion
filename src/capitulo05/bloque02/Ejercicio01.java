package capitulo05.bloque02;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero []=new int[150];

		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 150; i++) {
			//creacion del numero aleatorio
			numero[i] = (int)Math.round(Math.random() * (100 - (-100))) -100;
			System.out.println("-----");
			System.out.println("Array Normal: " +numero[i]);
			
			//creamos una condicion que pide que todos impares de los numero aleatorios y lo suma
			  if ((numero[i] % 2) == 0) {
				  numero[i]= -numero[i];
				  System.out.println("Array Inverso: " + numero[i]);
				  System.out.println("-----");
				 
		        } 	  
		} 
	}	
}
		
	
	
	

