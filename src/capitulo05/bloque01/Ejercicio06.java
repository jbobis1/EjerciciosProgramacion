package capitulo05.bloque01;

public class Ejercicio06 {
	public static void main(String[] args) {
	int numeros[] = new int[150];
	int suma = 0;
	int pos =150;
	int contador=0;
	
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * (150 - 0)) + 0;
		
			 	if (numeros[i]<= pos) { 
			 		suma = suma + numeros[i];
			 		contador++;
			 		i++;
			    } 	
		}
		System.out.println("-Total de numero de indice Par: "+ contador + ""
				+ "\n-Suma del indice Par: " + suma );
	}	
}
