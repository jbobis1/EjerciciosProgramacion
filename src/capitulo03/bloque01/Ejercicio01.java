package capitulo03.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	public static int letra (String cadena, char letra) {
		int contador=0, n=0, lon;
		lon=cadena.length();
	
		
		if (lon>0) {
			do {
				if(cadena.charAt(contador)==letra) {
					n++;
				}
				contador++;
				lon--;
			}while(lon>0);
		}
		return n;
	}	
}
