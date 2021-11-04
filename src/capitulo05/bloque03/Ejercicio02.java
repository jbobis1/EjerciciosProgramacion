package capitulo05.bloque03;

public class Ejercicio02 {
	public static void main(String[] args) {
		int arreglo[] = new int[10];		
		
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.print(arreglo[i]+"-");
		}
		   System.out.println("----");
		   int i,clave, N=arreglo.length;
		for ( int j = 1; j <N; j++) {
		        clave =arreglo[j];
		        i= j-1;
		        while (i >-1 && arreglo[i]>clave ) {
		        	arreglo[i+1]=arreglo[i];
		        	i=i-1;
		        }
		        arreglo[i+1]=clave;
		    }
		
		for ( i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+"-");
		}
	}
}

