package capitulo05.bloque07;

import javax.swing.JOptionPane;

public class Ejercicio05 {
	public static void main(String[] args) {
	int n = Integer.parseInt(JOptionPane.showInputDialog("Que numero quieres numero:  "));
	int array[] = new int [] {1,2,6,1,9,};
	int contador=0;
	removeInteger(array, nuevoarray);
//	System.out.print(findAndReplace(array));
	}

	private static void removeInteger(int[] array, int[] nuevoarray ) {
		  for(int i = 0; i <= array.length; i++){  
			  if (array[i]==n) {		 
				  contador++;	  
			  }	 
		  }	 
		  System.out.println("Numero de veces que se repite el numero es: " + contador);	  
	}
}
