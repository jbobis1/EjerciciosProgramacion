package capitulo05.bloque07;

public class Ejercicio01 {
	public static void main(String[] args) {
	int array[] = new int [] {10,66,67};	
	String str	= stringFromArray(array);
	System.out.println("str " + str);
	
	}
	
	public static String stringFromArray( int array[]) {
		int asciiValue = 12;

		  for(int i = asciiValue; i <= 90; i++){
	            String convertedChar = Character.toString(i);
	            System.out.println(i+" => "+convertedChar);
	        }
		return "";
		
	}
	
}
