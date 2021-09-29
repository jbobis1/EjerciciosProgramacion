package capitulo02.bloque01;

import javax.swing.JOptionPane;

//
//  3�.- Repetir el ejercicio 1� de este bloque de ejercicios, 
//  pero pidiendo al usuario cinco variables. Es decir, se pedir�n 
//  al usuario cinco variables y se mostrar� el mayor valor en pantalla.
//


public class Ejercicio03 {
	
	
	public static void main(String args[]) {
		
		String str = JOptionPane.showInputDialog("Introduzca el valor del numero1: ");
		int var1 = Integer.parseInt(str);
		
		str =JOptionPane.showInputDialog("Introduzca el valor del numero2: ");
		int var2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el valor del numero3: ");
		int var3 = Integer.parseInt(str);
		
		str =JOptionPane.showInputDialog("Introduzca el valor del numero4: ");
		int var4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el valor del numero5: ");
		int var5 = Integer.parseInt(str);
		

			
		if (var1>var2) {
			if (var1>var3) {
				if(var1>var4) {
					if(var1>var5) {
						System.out.println("El numero insertados " + var1 + "," + var2 + "," + var3 + "," + var4 + "," + var5 );
						System.out.println("El numero mayor es: " + var1 );
					}
				}
			}
		}
							
	
		 if (var2>var1) {
			 if (var2>var3) {
				 if(var2>var4) {
					 if(var2>var5) {
						 	System.out.println("El numero insertados " + var1 + "," + var2 + "," + var3 + "," + var4 + "," + var5 );
							System.out.println("El numero mayor es: " + var2 );
					 }
				 }
			 }
		 }

		 if (var3>var1){
			 if (var3>var2) {
				 if(var3>var4) {
					 if(var3>var5) {
						 System.out.println("El numero insertados " + var1 + "," + var2 + "," + var3 + "," + var4 + "," + var5 );
						 System.out.println("El numero mayor es: " + var3 );
					 }
				 }
			 }
		 }
		
		 if (var4>var1){
			 if (var4>var2){
				 if(var4>var3){
					 if(var4>var5){
						 	System.out.println("El numero insertados " + var1 + "," + var2 + "," + var3 + "," + var4 + "," + var5 );
							System.out.println("El numero mayor es: " + var4 );
					 }
				 }
			 }
		 }

		 if (var5>var1){
			 if (var5>var2){
				 if(var5>var3){
					 if(var5>var4){
						 System.out.println("El numero insertados " + var1 + "," + var2 + "," + var3 + "," + var4 + "," + var5 );
						 System.out.println("El numero mayor es: " + var5 );
					 }
				 }
			 }
		 }

				
	
	}

}
