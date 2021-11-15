package capitulo05.bloque06;

public class Ejercicio03 {
	public static void main(String[] args) {
		int array[] = new int[1000];
		int contador =0;
		int media=0;
		
		crear(array,contador, media); 
		   System.out.println("el numero de numnero es de: " + contador);
	       System.out.println("La media de la matriz: " + media);
	}

	private static void crear(int [] array, int contador,int media) {
		int suma=0;
		int array= new int[1000];
		do{
			array = (int)Math.round(Math.random() * (1000 - 0)) + 0;
			contador++;
			suma=array+array;
			media = suma/contador;
		}
		
		while( media < 0.490 ||media > 0.509);		
	}		
}
