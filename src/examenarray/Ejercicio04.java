package examenarray;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = new int[10];
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion quieres del Array:  "));
		int nuevoArray[] = removeInteger(array1, posicion);

		media(array1);
	}
	
	private static void media(int[] array1) {
		// creamos el primer array
		System.out.print("Array1: ");
		for (int i = 0; i < array1.length; i++) {
			//creamos los numero al azar
			array1[i] = (int)Math.round(Math.random() * (100 - 0)) +0;
			System.out.print(array1[i] + " ");
			
		}System.out.println(" ");
	}

	public static int[] removeInteger (int array1[], int posicion) {
		int nuevoArray[]; 
		int k = 0;
		System.out.println("Nuevo Array: ");
		
		// creamos el nuevo array con una pocision de menos
		nuevoArray = new int[array1.length - 1];
		
		// creamo el bucle donde copiaremos el array1 en el nuevo
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]!=posicion ) {
				nuevoArray[k] = array1[i];
				k++;			
			}System.out.print(nuevoArray);
		}
		
		return nuevoArray;
	}

}
