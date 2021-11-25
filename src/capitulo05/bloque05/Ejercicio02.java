package capitulo05.bloque05;

public class Ejercicio02 {
	public static void main(String[] args) {
		int array[] = new int[20];	
		empezararray(array);
		calculoNota(array);
	
	}
	
	public static void empezararray(int array[]){	
			
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random() * (10 - 0)) + 0;	   
		}
	} 
	public static void calculoNota(int[]array){
		float aprobado=0, suspendo=0;
		
	    for (int i = 0; i < array.length; i++) {
	    	
	    	if(array[i]>=5) {
	    		aprobado++;	
	    	}
	    	else{
	    		suspendo++;	 
	    	}
	    }
	    System.out.println("Porcentaje Aprobados: "+ (aprobado*100)/array.length+"%");
	    System.out.println("Porcentaje Suspensos: "+ (suspendo*100)/array.length+"%");
    }
}
