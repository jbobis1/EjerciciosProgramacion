package examen03;

public class Ejercicio03 {
	public static void main (String args[]) {
		int a=1, b=1, c, n=10;
		float[]  array = new float[10];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Fibonacci: "+a);

			
			c=a+b;
			a=b;
			b=c;

			array[i] = (a*(b/2)+b/2);
			
			System.out.println("array Fibonacci:  "+ array[i]);
			System.out.println(" ");
//			int z=((a*x)+)
//			
		}	
		
		
		
	}
}
