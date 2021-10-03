package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	public static void main(String[] args) {
		String str, str1, str2, str3;
		int opcion;
		double numero, numero1, numero2;
		double pi = 3.1416;
		System.out.println("Menu:");
		System.out.println("1.-  Cálculo de la hipotenusa de un triángulo");
		System.out.println("2.- Cálculo de la superficie de una circunferencia ");
		System.out.println("3.- Cálculo del perímetro de una circunferenco");
		System.out.println("4.- Cálculo del área de un rectángulo ");
		System.out.println("5.- Cálculo del área de un triángulo");
		System.out.println("0.- Salir");
			
		str = JOptionPane.showInputDialog("Introduzca la opcion: ");
		opcion = Integer.parseInt(str);
		

		
		switch(opcion) {
		case 0:
			System.out.printf("fin");
			break;
			
		
		case 1:
			str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str);
			str1 = JOptionPane.showInputDialog("Introduzca el segundo2 numero: ");
			numero1 = Integer.parseInt(str1);
					
			double hipotenusa = Math.sqrt(Math.pow(numero, 2) + Math.pow(numero1, 2));
			System.out.printf("La hipotenusa: " + hipotenusa);
			break;
			
		case 2:
			str2 = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str2);
			double area = pi * Math.pow(numero,2);
			System.out.printf("El area del numero es numero introducido es: " + area);
			break;
			
		
		case 3:
			str3 = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str3);
			double perimetro = (pi * pi) * (numero);
			System.out.printf("El perimetro del numero es numero introducido es: " + perimetro);
			break;
			
			
		case 4:
			str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str);
			str1 = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero1 = Integer.parseInt(str1);
			double rectángulo = numero*numero1;
			System.out.printf("El perimetro del numero es numero introducido es: " + rectángulo);
			break;
			
			
		case 5:
			str = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero = Integer.parseInt(str);
			str1 = JOptionPane.showInputDialog("Introduzca el primer numero: ");
			numero1 = Integer.parseInt(str1);
			double Triangulo = (numero*numero1)/2;
			System.out.printf("El perimetro del numero es numero introducido es: " + Triangulo);
			break;
			
			
		default:
			System.out.printf("ERROR " );
			
			
		}
		
	}
	
	
}
