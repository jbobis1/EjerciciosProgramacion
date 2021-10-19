package capitulo03.bloque04;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main (String args[]) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
		int i =128;
		
		while ( i > 0) {
			
			if ((num & i) != 0) {
			 System.out.println( 1);
			 
			}
			else {
			
			System.out.println( 0);
			
			}
			
			i=i>>1;	
		}	
	}
}
