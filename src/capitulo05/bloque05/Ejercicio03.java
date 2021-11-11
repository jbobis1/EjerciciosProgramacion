package capitulo05.bloque05;

public class Ejercicio03 {
	public static void main(String[] args) {
			float array1[]=new float[20];
			empezararray(array1);
	}
	
		private static void empezararray(float[] array1) {	
			int entero=0; 
			float decimal=0 ;
			
			for (int i = 0; i < array1.length; i++) {		
				entero = (int) Math.round (Math.random() * (100.00-1.0)) + 0;	
				decimal = (float) Math.round (Math.random() * (100.00-1.0)) /100;										
				array1[i] =  entero+decimal;		
				//System.out.print(total);	
				if(decimal <= .49) {
		    		System.out.println(array1[i]);
		    	}	
			}
		}		
}
