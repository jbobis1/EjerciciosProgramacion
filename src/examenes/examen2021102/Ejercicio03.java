package examenes.examen2021102;

import javax.swing.JOptionPane;

public class Ejercicio03 {
	public static void main(String[] args) {
		//Declaramos las variables
		
		int bajos =0;
		int altos=0;
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i < 10; i++) {
			//creacion del numero aleatorio
			
			//numero = (int)Math.round(Math.random() * (50 - 20)) + 20;
			//Te pide 10 numero para que los puedas meter  
			int numero = Integer.parseInt(JOptionPane.showInputDialog("numero: "));

			System.out.println(numero);
			
			//numero enre 20 y 30
			if (numero >=20 && numero<= 30) {
				  
				 System.out.println("numero entre 20-30: " + numero);
				 
		        } 
			  //numero entre 40-50
			else if (numero >=40 && numero<= 50){ 
					
				  System.out.println("numero entre 40-50: " + numero); 
		    }  
			//numero que no estan en el rangosolicitado
			else{
				
				System.out.println("Intervalo que no este;"+ numero);
			}
		} 
	}
}
	

