package capitulo05.bloque05;

public class Ejercicio03 {
	public static void main(String[] args) {
			//Declaramos las variables
			double array1[]=new double[20];
			double array2[]=new double[20];
			double array3[]=new double[40];
			
			empezararray(array1, array2,array3);
			calculoNota(array3);
	}
		
		private static void empezararray(double[] array1, double[] array2, double[] array3) {
		// TODO Auto-generated method stub
			for (int i = 0; i < array1.length ||i < array2.length; i++) {		//creacion del numero aleatorio
				array1[i] = (double) Math.round (Math.random() * (100.00-1.0)) + 0;
				array2[i] = (double) Math.round (Math.random() * (0.9-0.1)) + 0;
				array3[i]=array1[i]+array2[i];
			}
	}
		
		public static void calculoNota(double[] array3){
		    for (int i = 0; i < array3.length; i++) {
		    	if(array3[i]>=0.0||array3[i]>=0.5) {
		    		System.out.println(array3[i]);
		    	}  	
		    }
	    }	
}
