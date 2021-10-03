package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	public static void main (String args[]) {
		String str;
		int opcion;
		
		str = JOptionPane.showInputDialog("Introduzca la Nota: ");
		opcion = Integer.parseInt(str);
		
		
		switch (opcion) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy deficiente"); // Se llega en los cases 0, 1 y 2
			break; // Con esta instrucción salimos del switch
		case 3:
		case 4:
			System.out.println("Deficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Error, el valor no pertenece a ninguna nota");
	}
}
	
}
