package capitulo05.bloque07;

public class Ejercicio01 {
	public static void main(String[] args) {
	int array[] = new int [] {65,66,67};	
	stringFromArray(array);
	}
	
	public static String stringFromArray( int array[]) {
//		int asciiValue = 1;
		char letra;
		int i = 0;
		
		array = new int [] {65,66,67};
		for (i = 0; i < array.length; i++) {
//			 letra = Character.toString(array[i]);	
//			 letra = letra.concat(String.valueOf(array[i]));
			 char character = array.charAt(i);
			 string ascii= (string) letra ;
			 
//		  for(int j = letra; j <= array.length; j++){
//	            String convertedChar = Character.toString(letra);
//	            System.out.println(i+" => "+convertedChar);		
//	        }			
	}System.out.println("La letra es  " + letra);
		return letra;
	}	
}
//	for(int i = 0; i < nameLenght ; i++){   // while counting characters if less than the length add one
//	    char character = name.charAt(i); // start on the first character
//	    int ascii = (int) character; //convert the first character
//	    System.out.println(character+" = "+ ascii); // print the character and it's value in ascii
//	}

