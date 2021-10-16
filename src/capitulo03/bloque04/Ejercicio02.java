package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	
	public static void main (String args[]) {
		boolean primo = true;
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero Minimo: "));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero Maximo: "));
		int i = 2;
		
		
		while (minimo <= maximo) {
			int num = minimo;
			
			while (i<= num /2 && primo) {
				if(num % i == 0)
					primo = false;
				i++;
			}
			
			i = 2;
			if (primo) System.out.println("El numero " + num + " es primo");
			else System.out.println("El numero " + num + " no primo");
			primo =true;
			minimo++;
		}
	}
}

