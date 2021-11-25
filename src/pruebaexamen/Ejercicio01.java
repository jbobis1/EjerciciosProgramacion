package pruebaexamen;

public class Ejercicio01 {


	public static void main(String[] args) {
		int minimo=100;
		int maximo=0;
		int numeros[] = new int[150];
		int media=0,suma=0;
		
		System.out.println("Array:");
		// Inicialización de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
			minimo = numeros[i];
			maximo = numeros[i];		
		}
		for (int i = 0; i < 1; i++) {
			minimo = numeros[i];
			maximo = numeros[i];		
		}
	
	
				
		// Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {

			suma=numeros[i]+suma;
			media=suma/100;
			
			System.out.print(numeros[i] + " ");
			if (numeros[i] >= maximo) {
				maximo = numeros[i] ;		
			}	

			else{
				minimo = numeros[i] ;
			}
		}
	
		System.out.println(" ");
		System.out.print("Media: "+ media + "\n"+ "Suma: " + suma  );
		System.out.println(" ");
		System.out.print("maximo: "+ maximo + "\n"+ "minimo: " + minimo  );
	}
}



