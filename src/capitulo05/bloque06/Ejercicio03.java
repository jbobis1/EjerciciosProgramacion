package capitulo05.bloque06;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		crear(); 

	}

	private static void crear() {
		int suma = 0, contador = 0;
		int num;
		float media;
		
		do{
			num = (int) Math.round(Math.random() * (1000 - 0)) + 0;			
			contador++;
			suma = suma + num;
			media = suma / (float) contador;
			
		} while( media < 499.5 || media > 500.5);
       System.out.println("La media: " + media);
	   System.out.println("He necesitado: " + contador + " numeros");

	}		
}
