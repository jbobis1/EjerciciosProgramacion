package examen03;

public class Ejercicio04 {

	public static void main(String[] args) {
		char array[] = new char[] {72, 79, 76,65, 34,77,85,78,68,79};
		String frase = stringFromArray(array);
		 minuscula( frase);
		System.out.println("str: " + frase);
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	
	public static String stringFromArray (char[] array) {
		String frase = "";
		
		for (int i = 0; i < array.length; i++) {
			frase += (char) array[i];
		}
		return frase;
	}
	
	public static String minuscula (char frase[]) {
	
		for (int i = 0; i < frase.length; i++) {
			if (i != 0 || i != 5){
			frase = frase +(char) 32;
				
			}
		}
		
		return frase;
	}
	
}
