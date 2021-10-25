package capitulo02.bloque02;

import javax.swing.JOptionPane;

//
//  2.- Realiza un ejercicio igual al anterior, pero con las dos siguientes diferencias:
//  no existe la categoria de numeros negativos, por tanto si el usuario introduce un
//  negativo, el programa debe terminar; la otra diferencia es que, al acabar, el programa
//  no debe mostrar la suma de los numeros, sino cuantos han entrado en cada categoria.
//  A esto se llema contadores, a diferencia del ejercicio anterior, que reciben el
//  nombre de acumuladores.
//


public class Ejercicio02 {
    public static void main(String args[]) {
		
        Integer numBajo = 0;
        Integer numMedio = 0;
        Integer numAlto = 0;
        System.out.println("Introduzca el valor del numero1: ");
        
        
		String str1 = JOptionPane.showInputDialog("Introduzca el valor del numero1: ");
		int num1 = Integer.parseInt(str1);

		if(num1 < 0) {
            System.out.println("La cantidad de número introducidos ha sido:\nNumeros bajos: " + numBajo + "\nNumeros medios: " + numMedio + "\nNumeros altos: "+numAlto);
		} 
		else {
            if(num1 >= 0 && num1 <= 25) {
                numBajo++;
            } else if(num1 >= 26 && num1 <= 250) {
                numMedio++;
            } else {
                numAlto++;
            }
 		    String str2 = JOptionPane.showInputDialog("Introduzca el valor del numero2: ");
		    int num2 = Integer.parseInt(str2);
            if(num2 <0) {
                System.out.println("La cantidad de número introducidos ha sido:\nNumeros bajos: " + numBajo + "\nNumeros medios: " + numMedio + "\nNumeros altos: "+numAlto);
            } else {
            	 if(num2 >= 0 && num2 <= 25) {
                     numBajo++;
                 } else if(num2 >= 26 && num2 <= 250) {
                     numMedio++;
                 } else {
                     numAlto++;
                 }
            	
            	String str3 = JOptionPane.showInputDialog("Introduzca el valor del numero3: ");
     		    int num3 = Integer.parseInt(str3);
                if(num3<0) {
                	System.out.println("La cantidad de número introducidos ha sido:\nNumeros bajos: " + numBajo + "\nNumeros medios: " + numMedio + "\nNumeros altos: "+numAlto);
                } else {
                	 if(num3 >= 0 && num3 <= 25) {
                         numBajo++;
                     } else if(num3 >= 26 && num3 <= 250) {
                         numMedio++;
                     } else {
                         numAlto++;
                     }
                	
          		    String str4 = JOptionPane.showInputDialog("Introduzca el valor del numero4: ");
        		    int num4 = Integer.parseInt(str4);
                    if(num4 <0) {
                        System.out.println("La cantidad de número introducidos ha sido:\nNumeros bajos: " + numBajo + "\nNumeros medios: " + numMedio + "\nNumeros altos: "+numAlto);
                    } else {
                    	 if(num4 >= 0 && num4 <= 25) {
                             numBajo++;
                         } else if(num4 >= 26 && num4 <= 250) {
                             numMedio++;
                         } else {
                             numAlto++;
                         }
                    	
               		    String str5 = JOptionPane.showInputDialog("Introduzca el valor del numero4: ");
            		    int num5 = Integer.parseInt(str5);
                        if(num5 < 0) {
                            System.out.println("La cantidad de número introducidos ha sido:\nNumeros bajos: " + numBajo + "\nNumeros medios: " + numMedio + "\nNumeros altos: "+numAlto);
                        } else {
                        	 if(num5 >= 0 && num5 <= 25) {
                                 numBajo++;
                             } else if(num5>= 26 && num5 <= 250) {
                                 numMedio++;
                             } else {
                                 numAlto++;
                             }                         
                        }
                    }
                }
            }
        }
		
	}
	
		
}
