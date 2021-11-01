package capitulo05.bloque03;

public class Ejercicio02 {
	public static void main(String[] args) {
		boolean permanecer = true;
		int interaccion=0;
		int arreglo[] = new int[10];		
		
		// Inicialización de los valores del array
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;
			   System.out.println(arreglo[i]);
		}
		   System.out.println("----");
		for (int i = 1; i < 20; i++) {
		      int actual = arreglo[i];
		        for (int j = i; j > 0 && arreglo[j - 1] > actual; j--) {
		        	arreglo[j] = arreglo[j - 1];
		        	System.out.println(arreglo[j]);
		        }
		        arreglo[i] = actual;
		        
		    }
		}
	}

