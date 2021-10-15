package capitulo02.bloque02;

import javax.swing.JOptionPane;

//
//  1�.- Realiza un ejercicio que acumule cinco n�meros introducidos por el usuario, 
//  es decir, que sume las cantidades introducidas, pero realizando cuatro categor�as: 
//  n�meros negativos, n�meros bajos (entre 0 y 25, ambos inclusive), n�meros medios 
//  (entre 26 y 250, ambos inclusie) y n�meros grandes (mayores de 250). Al finalizar el programa, 
//  se debe mostrar el total de las sumas de los n�meros introducidos en cada una de las categor�as.
//

public class Ejercicio01 {
	public static void main(String args[]) {
		
		String str = JOptionPane.showInputDialog("Introduzca el valor del numero1: ");
		int num1 = Integer.parseInt(str);
		
		str =JOptionPane.showInputDialog("Introduzca el valor del numero2: ");
		int num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el valor del numero3: ");
		int num3 = Integer.parseInt(str);
		
		str =JOptionPane.showInputDialog("Introduzca el valor del numero4: ");
		int num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca el valor del numero5: ");
		int num5 = Integer.parseInt(str);
		
		int negativos = 0;
		int bajos = 0;
		int medios = 0;
		int grandes = 0;
		
		
		
		
		if (num1 < 0) {
			 negativos = negativos+ num1;
		}
		else { 
			if ( num1 <= 25) { 
				bajos = bajos + num1;
			}
			else 
				if (num1 >=26 && num1<= 250){ 
				medios = medios + num1;
			}
			else 
				if (num1  > 250){
					grandes = grandes + num1;
			
				}
		}
		
		if (num2 < 0) {
			 negativos = negativos+ num2;
		}
		else { 
			if ( num2 >=0 && num2 <= 25) { 
				bajos = bajos + num2;
			}
			else 
				if (num2 >=26 && num2<= 250){
					medios = medios + num2;
			}
			else 
				if (num2  > 250){
					grandes = grandes + num2;
			
				}
		}
		
		if (num3 < 0) {
			 negativos = negativos+ num3;
		}
		else { 
			if ( num3 >=0 && num3 <= 25) { 
				bajos = bajos + num3;
			}
			else 
				if (num3 >=26 && num3<= 250){
					medios = medios + num3;
			}
			else 
				if (num3  > 250){
					grandes = grandes + num3;
			
				}
		}
		
		
		if (num4 < 0) {
			 negativos = negativos+ num4;
		}
		else { 
			if ( num4 >=0 && num4 <= 25) { 
				bajos = bajos + num4;
			}
			else 
				if (num4 >=26 && num4<= 250){
					medios = medios + num4;
			}
			else 
				if (num4  > 250){
					grandes = grandes + num4;
			
				}
		}
		
		if (num5 < 0) {
			 negativos = negativos+ num5;
		}
		else { 
			if ( num5 >= 0 && num5 <= 25) { 
				bajos = bajos + num5;
			}
			else 
				if (num5 >= 26 && num5 <= 250){
					medios = medios + num5;
			}
			else 
				if (num5  > 250){
					grandes = grandes + num5;
			
				}
			}
		
		System.out.println("Los numeros negativos; " + negativos);
		System.out.println("Los numeros bajos; " + bajos);
		System.out.println("Los numeros medios; " + medios);
		System.out.println("Los numeros grandes; " + grandes);
	
		
		
		
		
	}

	
	
}
