package examenes.examen2021102;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero=0;
		int imp =0;
		int pares=0;
		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 10; i++) {
			numero= Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero Minimo: "));

			//creamos una condicion que pide que todos impares de los numero aleatorios y lo suma
			  if ((numero % 2) == 0) {
				  pares++;
		        } 
			  //creamos la condicion  para los multiplos de 5 generados si son multiplos los sume
			  if ((numero % 2) != 0) {
				 imp++;
		        } 
			  
		} 
		//imprimimos por pantalla la suma de los numero impares y la suma de los multiplos de 5
		System.out.println("Suma numero pares: "  + pares );
		System.out.println("Suma numero impares: " +imp );
	}	
}
		
	

