package examenes.examen2021102;


public class Ejercicio01 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero;
		int suma =0;
		int mult=0;
		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 10; i++) {
			//creacion del numero aleatorio
			numero = (int)Math.round(Math.random() * (150 - 0)) + 0;
			System.out.println(numero);
			
			//creamos una condicion que pide que todos impares de los numero aleatorios y lo suma
			  if ((numero % 2) != 0) {
				  suma +=numero;
		        } 
			  //creamos la condicion  para los multiplos de 5 generados si son multiplos los sume
			  if ((numero % 5) == 0) {
				  mult += numero;
		        } 
			  
		} 
		//imprimimos por pantalla la suma de los numero impares y la suma de los multiplos de 5
		System.out.println("Suma numero impares: "  + suma );
		System.out.println("suma multiplos de 5: " +mult );
	}	
}
		
	

