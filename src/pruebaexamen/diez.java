package pruebaexamen;

import javax.swing.JOptionPane;

public class diez {
	public static void main(String[] args) {
	int array[]= inicializaArrayPorTeclado(5);
	mostrararray(array);

	ordenar ( array);
	mostrararray(array);
	
	}
	public static int[] inicializaArrayPorTeclado (int longitud) {
		int array[]=new int [longitud];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca el siguiente numero del array: ");
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));;
		}
		return array;
	}
	public static void mostrararray (int array[]) {
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			
		}
		System.out.println();
	}
	
	public static void ordenar (int array[]) {
		boolean cambiar;
		do {
			cambiar = false;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					cambiar = true;
				}
			}

		} while (cambiar == true);

	}
	
}
