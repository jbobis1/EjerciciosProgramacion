package entorno;

import javax.swing.JOptionPane;

public class Numero {

		public static void main(String[] args) {
		int a = 0;
		int b = 0;

//		
//		pedir(a, b);
//		System.out.println(pedir(a,b));
		
		iguales(a, b);
		System.out.println(iguales(a,b));
		do{
			 a = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
			 System.out.println(a);
			 
			 b = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
			 System.out.println(b);
//			 System.out.println("NO Son Iguales");		 

		 }while(a != b);
		
		}
//		public static int pedir(int a, int b) {
//				
//			do{
//				 a = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
//				 System.out.println(a);
//				 
//				 b = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
//				 System.out.println(b);
////				 System.out.println("NO Son Iguales");		 
//
//			 }while(a != b);
////			System.out.println("Son Iguales");
////			System.out.println("Fin");
//			 return a;
//		 
//		}
//		
		public static boolean iguales(int a, int b) {
			boolean igual = false;
			
			if(a==b) {
				igual = 1;
			}
			else {
				igual = false;
			}
			 return igual;
		}
	}


