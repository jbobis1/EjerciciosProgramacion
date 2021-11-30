package ejercicio.io;

import javax.swing.JOptionPane;

public class numero {
	public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
	
	pedir(a, b);
	System.out.println(pedir(a,b));
	
	iguales(a, c);
	System.out.println(iguales(a,c));
	}
	public static int pedir(int a, int b) {
			
		do{
			 a = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
			 System.out.println(a);
			 
			 b = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero: "));
			 System.out.println(b);
//			 System.out.println("NO Son Iguales");		 

		 }while(a != b);
//		System.out.println("Son Iguales");
//		System.out.println("Fin");
		 return a;
	 
	}
	
	public static boolean iguales(int a, int c) {
		boolean igual = false;
		if(a==c) {
			igual = true;
		}
		else {
			igual = false;
		}
		 return igual;
	}
}
