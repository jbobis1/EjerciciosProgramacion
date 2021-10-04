package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	public static void main(String[] args) {
		String str, str1, str2, str3;
		int opcion;
		double numero, numero1;
		double pi = 3.1416;
		System.out.println("Menu:");
		System.out.println("1.-  C�lculo de la hipotenusa de un tri�ngulo");
		System.out.println("2.- C�lculo de la superficie de una circunferencia ");
		System.out.println("3.- C�lculo del per�metro de una circunferenco");
		System.out.println("4.- C�lculo del �rea de un rect�ngulo ");
		System.out.println("5.- C�lculo del �rea de un tri�ngulo");
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
			double rectangulo = numero*numero1;
			System.out.printf("El perimetro del numero es numero introducido es: " + rectangulo);
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
