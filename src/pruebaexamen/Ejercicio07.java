package pruebaexamen;

public class Ejercicio07 {
	public static void main (String args[]) {
		int a=0, b=1, c, n=10;
		
		for(int i = 0; i<n; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}	
		
	}
}
