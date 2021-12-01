package examenarray;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion quieres del Array:  "));
		int array1[] = inicializaArrayAzar(10);
		muestraArray(array1);		

		for(int i=posicion ; i<array1.length-1; i++) {
			array1[i] = array1[i+1];
		}
		array1[array1.length-1]=(int) Math.round(Math.random() * 100);
		
		muestraArray(array1);
	}
	
	public static int[]  inicializaArrayAzar(int posicion ) {
		int array1[] = new int[posicion];
		

		for(int i=0 ; i< array1.length; i++) {
			array1[i]=(int) Math.round(Math.random() * 100);
//			System.out.print(array1[i]+" ");
		}
		return array1;
		
	}
	
	public static void muestraArray(int array1[]) {
	
		for(int i=0 ; i< array1.length; i++) {
			System.out.print(array1[i] + " ");
		
		}
		System.out.println("");
	}
	
	
}
