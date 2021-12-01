package examenarray;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = new int[5];
		int array2[] = new int[5];
		int array3[] = new int[5];
		media(array1,array2,array3);
	}



	private static void media(int[] array1, int[] array2, int[] array3) {
		// creamos el primer array
		System.out.print("array1: ");
		for (int i = 0; i < array1.length; i++) {
			//creamos los numero al azar
			array1[i] = (int)Math.round(Math.random() * (100 - 0)) + 0;
			System.out.print(array1[i] + " ");
			
		}System.out.println("");
		System.out.print("array2: " );
		
		// creamos el primer array
		for (int i = 0; i < array2.length; i++) {
			//creamos los numero al azar
			array2[i] = (int)Math.round(Math.random() * (100 - 0)) + 0;
			System.out.print(array2[i] + " ");
		}
		System.out.println("");
		System.out.print("array3: " );
		
		//hacemos la media de los 2 array y lo agragamos el 3 array
		for (int i = 0; i < array3.length; i++) {
			array3[i] =(array2[i]+array1[i])/2;
			System.out.print((float)array3[i] + " ");
			}
		
	}
}


