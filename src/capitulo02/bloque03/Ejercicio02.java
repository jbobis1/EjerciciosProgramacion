package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	public static void main(String[] args) {
		String str, str2;
		int opcion;
		double numero, numero1;
		System.out.println("Menu:");
		System.out.println("1.- raices");
		System.out.println("2.- potencias ");
		System.out.println("3.- modulo de division");
			
		str = JOptionPane.showInputDialog("Introduzca la opcion: ");
		opcion = Integer.parseInt(str);
		
			
		
	
				
		switch(opcion) {
		case 1:
			str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str);
			double raizCuadrada = Math.sqrt(numero);
			System.out.printf("Raíz cuadrada de %.2f es %.2f\n", numero, raizCuadrada);
			break;
			
		case 2:
			str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str);
			double potencia = (numero*numero);
			System.out.printf("La potencia del numero es numero introducido es: " + potencia);
			break;
			
		case 3:
			str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str);
			str2 = JOptionPane.showInputDialog("Introduzca el segundo numero: ");
			numero1 = Integer.parseInt(str2);
			double modulo = (numero%numero1);
			System.out.printf("El resto del numero es numero introducido es: " + modulo);
			
			break;
		default:
			System.out.printf("ERROR " );
			
			
		}
	}
}
