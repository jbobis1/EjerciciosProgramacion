package capitulo06.bloque02;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		for (float x=0; x<1; x+=0.001) {
			
			double y1=Math.sqrt(x);
			double y2=Math.log(x);
			
			
			if (Math.abs( y1 - y2) < 0.001) {
				double dis= y1-y2;
				System.out.println("el punto medio es"+dis);
//				
			}
		}
	}
}
