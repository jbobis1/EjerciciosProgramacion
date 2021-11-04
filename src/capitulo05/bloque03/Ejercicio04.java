package capitulo05.bloque03;
import java.lang.reflect.Array;
import java.util.Iterator;

public class Ejercicio04 {
	public static void main(String[] args) {
		int arreglo[] = new int[10];		
		int aux;
		System.out.println("Array Aleatorio:");
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.print(arreglo[i]+"-");
		}
		   System.out.println("");
		for (int i = 0; i < arreglo.length; i++) {
			for(int j = i+1; j <arreglo.length; j++) {
				if(arreglo[j] < arreglo[i]) {
					aux=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
				}
			}		
		}
		System.out.println("Array Odenado:");
		for ( int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+"-");
		}
	}
}
