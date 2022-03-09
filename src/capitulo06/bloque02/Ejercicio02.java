package capitulo06.bloque02;

public class Ejercicio02 {

	public static void main(String[] args) {
		double pi = 0;
		int signo = 1;
		double termino;
		
		for (int i = 1; i <  10000; i+=2) {
			termino = (4f/i);
			pi += signo * termino;
			signo *= -1;
		}

		System.out.println("PI: " + pi);
	}
}
