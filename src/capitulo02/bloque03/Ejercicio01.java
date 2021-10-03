package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main (String args[]) {
		String str;
		int opcion;
		
	
		
		str = JOptionPane.showInputDialog("Introduzca la opción: ");
		opcion = Integer.parseInt(str);
		
		
		switch(opcion) {
		case 1:
			System.out.println("insuficiente" );
			break;
		case 2:
			System.out.println("Suficiente");
			break;
		case 3:
			System.out.println("Bien" );
			break;
		case 4:
			System.out.println("Notable");
			break;
		case 5:
			System.out.println("Soblesaliente" );
			break;
				
		}
		
	}
	
}
