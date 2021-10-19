package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio01 {
		public static void main (String args[]){
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero: "));
			int contador = 2;
			boolean primo = true;
			
			while ((primo) && (contador!=numero)) {
				
				if((numero % contador == 0)) {
					primo = false;
				}
				else {
					primo = true;
				}
				contador++;
			}
			if (primo == true) {
				System.out.println("El numero " + numero + " es primo");
			}
			
			else{
				System.out.println("El nuero " + numero + " no primo");				
			}
		}
}

