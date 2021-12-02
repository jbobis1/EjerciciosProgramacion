package pruebaexamen;

public class Veces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int [] {1,2,3,4,5,5,6,4,5,5,5,5};
	
		int nuevoarray[]= eliminar( array, 5);
		mostrar ( nuevoarray);

		
	}
	
	public static int[] eliminar(int array[], int numeroeliminar) {
		int nuevoarray[];
		int veces;
		int k= 0;
		veces=ocurencias( array,  numeroeliminar);
		nuevoarray= new int [array.length-veces];
		
		for (int i =0; i < array.length; i++) {
			if (array[i]!=numeroeliminar) {
				nuevoarray[k]=array[i];
				k++;
			}
		}return nuevoarray;
	}
	
	
	
	public static int ocurencias(int array[], int numero) {
		int contador=0;
	
		for (int i =0; i < array.length; i++) {
			if (array[i]==numero) {
				contador++;
			}
		}
		return contador;
	}
	
	public static void mostrar(int nuevoarray[]) {
		
		for(int i= 0; i < nuevoarray.length; i++ ) {
			System.out.print(nuevoarray[i]+" ");			
		}
		
	}
}
