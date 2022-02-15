package capitulo06;

public class Ejercicio03 {

	public static void main (String args[]) {

	     int decimales[] = new int [100];
			for (int i = 0; i < decimales.length; i++) {
				 decimales[i] = (int) Math.round(Math.random() * (1)*0+i);
			
		
				System.out.println(decimales[i]);

				
			}
	            for (int decimal : decimales) {
	            String hexadecimal = Integer.toHexString(decimal);
	            System.out.printf("El Numero Hexadecimal %d es %s\n", decimal, hexadecimal);

	        }
	    }

	    public static String decimalAHexadecimal(int decimal) {
	        String hexadecimal = "";
	        String caracteresHexadecimales = "0123456789abcdef";
	        while (decimal > 0) {
	            int residuo = decimal % 16;
	            hexadecimal = caracteresHexadecimales.charAt(residuo) + hexadecimal; // Agregar a la izquierda
	            decimal /= 16;
	        }
	        return hexadecimal;
	    }
	
}
