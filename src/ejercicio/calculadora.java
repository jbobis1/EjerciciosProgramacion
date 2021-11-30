package ejercicio;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Introdusca un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		num3 = sc.nextInt();
		
		Suma(num1, num2);
		System.out.println("Suma: " + Suma(num1, num2));
		
		Resta(num1, num2);
		System.out.println("Resta: " + Resta(num1, num2));
		
		Division(num1, num2);
		System.out.println("División: " + Division(num1, num2));
		
		Multiplicacion(num1, num2);
		System.out.println("Multiplicación: " + Multiplicacion(num1, num2));
		
		mitadSiPar(num3);
		System.out.println("Mitad núemro par: " + mitadSiPar(num3));
	
	}
	
	public static int Suma(int num1, int num2) {
		
		int suma = (num1 + num2);
		return suma;
	}
	
	public static int Resta(int num1, int num2) {
		
		int resta = (num1 - num2);
		return resta;
	}
	
	public static int Division(int num1, int num2) {
		
		int division = (num1 / num2);
		int n = 0;
		if(num2 == 0) {
			n = 0;
		}
		else {
			n = num1/num2;
		}
		return n;
	}
	
	public static int Multiplicacion(int num1, int num2) {
		
		int multiplicacion = (num1 * num2);
		return multiplicacion;
	}
	
	public static int mitadSiPar(int num3) {
		int mitad = 0;
		
		if(esPar(num3) == true) {
			mitad = num3 / 2;
		}
		else {
			mitad = num3;
		}
		return mitad;
	}
	
	public static boolean esPar(int num3) {
		
		boolean esPar = false;
		if(num3 % 2 == 0) {
			esPar = true;
		}
		else {
			esPar = false;
		}
		return esPar;
		
	}
}


