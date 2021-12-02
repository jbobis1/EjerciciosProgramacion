package examenarray;

public class Ejercicio03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creamos el primer array
		int array1[] = new int[100];

		media(array1);
		valor(array1);
	}
	

	private static void media(int[] array1) {

		System.out.print("Array1: ");
		for (int i = 0; i < array1.length; i++) {
			//damos valor al primer array
			array1[i] = (int)Math.round(Math.random() * (100 - (-100))) -100;
			System.out.print(array1[i] + " ");
			
		}
	}
	
	public static void valor(int[]array1){
	
		float  suma=0, media=0;
		int contador=0, alto=0, bajo=0;
		
		// creamos un bucle que nos recorra el array y nos calcule la suma y numero de veces que pasa
	    for (int i = 0; i < array1.length; i++) {
	    suma=array1[i] + suma;
	    contador++;
	    
	    }
	    media =suma/contador;
	    
	    // creamos un bucle para saber la media baja de los numero del array
	    for (int i = 0; i < array1.length; i++) {
		if(array1[i]<media) {
    		bajo++;	
    	}
    
	    }
	 // Mostramos por pantalla
	    System.out.println(" ");
	    System.out.print("La suma es: " + suma);
	    System.out.println(" ");
	    System.out.println("Pocentaje por debajo de la media:  "+ (bajo*100)/array1.length+"%");
    }

}

	


