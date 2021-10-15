package capitulo03.bloque04;

import java.util.Date;

public class Ejercicio02 {

	public static void numerosPrimos () {
		int limite = 50000;
		int numero = 2;
		int i =2;
		long millisDesde1970 = new Date().getTime();
		
		while( numero < limite) {
			
			boolean numeroEsPrimo = true;
			while ( i < (numero / 2 + 1)) {
				if (numero % i == 0) {
					numeroEsPrimo = false;
					break;
				}
				i++;
			}
			
			if (numeroEsPrimo == true) {
				System.out.println("el número " + numero + " es primo");
			}
			
			 numero++;
			
		}
	
	
	}	
}
