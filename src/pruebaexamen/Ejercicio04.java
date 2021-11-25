package pruebaexamen;

public class Ejercicio04 {
	public static void main(String[] args) {
		
	int numero[] = new int[20];
    int div=0;
    int contador=0;

    
    for (int i = 0; i < numero.length; i++) {
		
		numero[i] = (int)Math.round(Math.random() * (50 - 1)) + 1;
		System.out.print(numero[i] + " ");
	
	}
	    for(int i = 1 ; i <numero.length ; i++){
	        if(numero[i] % 2 == 0){
	            
	            div+=contador;
	        }
	        else {
	            contador++;
	            div+=contador;
	        }
	
	    }
	    
	    
	    for(int i = 1 ; i <numero.length ; i++){
	    
	    System.out.println(" ");
	    System.out.print(numero[i]+" :" + div);
	    }
	
	    
	    
	}
}
