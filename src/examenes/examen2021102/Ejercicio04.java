package examenes.examen2021102;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero;
		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 10; i++) {
			//creacion del numero aleatorio
			numero = (int)Math.round(Math.random() * (150 - 0)) + 0;
			System.out.println(numero);
			

			  //creamos la condicion  para los multiplos de 5 generados si son multiplos los sume
			  if ((numero % numero) == 0 && i<=numero){
				  System.out.println("divisores"+numero);
				 numero--;
		        } 
			 
			  
		} 
		//imprimimos por pantalla la suma de los numero impares y la suma de los multiplos de 5
//		System.out.println("Suma numero impares: "  + numero );
//		System.out.println("suma multiplos de 5: " +mult );
	}	
}
	
	
	

