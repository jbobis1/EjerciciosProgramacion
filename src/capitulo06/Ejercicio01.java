package capitulo06;

public class Ejercicio01 {

	public Ejercicio01() {
		// TODO Auto-generated constructor stub
		
		
		// Wrapper para el tipo de datos "long"
				System.out.println("\nValor m�ximo para un Long: " + Long.MAX_VALUE);
				System.out.println("Valor m�nimo para un Long: " + Long.MIN_VALUE);
				System.out.println("Tama�o en bits complemento a 2 para Long: " + Long.SIZE);

				// Wrapper para el tipo de datos "short"
				System.out.println("\nValor m�ximo para un Short: " + Short.MAX_VALUE);
				System.out.println("Valor m�nimo para un Short: " + Short.MIN_VALUE);
				System.out.println("Tama�o en bits complemento a 2 para Short: " + Short.SIZE);
				
				// Wrapper para el tipo de datos "boolean"
				System.out.println("\nForma r�pida de creaci�n de un Boolean: " + Boolean.valueOf(true));
				System.out.println("Parseo de una cadena de caracteres \"true\" a Boolean: " + Boolean.parseBoolean("true"));
				
				// Wrapper para el tipo de datos "float"
				System.out.println("\nValor m�ximo para un Float: " + Float.MAX_VALUE);
				System.out.println("Valor m�nimo para un Float: " + Float.MIN_VALUE);
				System.out.println("Tama�o en bits complemento a 2 para Float: " + Float.SIZE);
				
				// Wrapper para el tipo de datos "double"
				System.out.println("\nValor m�ximo para un Double: " + Double.MAX_VALUE);
				System.out.println("Valor m�nimo para un Double: " + Double.MIN_VALUE);
				System.out.println("Tama�o en bits complemento a 2 para Double: " + Double.SIZE);
	}

}
