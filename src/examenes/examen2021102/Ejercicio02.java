package examenes.examen2021102;

import javax.swing.JOptionPane;

public class Ejercicio02 {
	public static void main(String[] args) {
		
		//Declaramos las variables
		int numero;
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero Minimo: "));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero Maximo: "));
		
		//Cremos el buble que se repetiras 10 veces y tambien que el numero sea aleatorio
		for (int i = 0; i <= 10; i++) {
		
			//creacion del numero aleatorio
			numero = (int)Math.round(Math.random() * (maximo - minimo)+minimo);
			System.out.println(numero);
		
			
			//condicion para los maximo
			  if (numero<=0) {
				  maximo=numero; 
		        } 
			  //condicion para los numero minimo
			  else if (numero>0) {
				  numero=minimo;
		        } 
		} 
		//imprimimos por pantalla el maximo y minimo de los numero generados
		 System.out.println("Positico"+ maximo);
		 System.out.println("negativo"+ minimo);
	}	
}
