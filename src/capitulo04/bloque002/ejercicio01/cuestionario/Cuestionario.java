package capitulo04.bloque002.ejercicio01.cuestionario;

import java.util.ArrayList;
import java.util.List;

public class Cuestionario {
	
	public static void main(String[] args) {
		
		Pregunta  Cuestionario[] = new Pregunta[5];
		int contadorcorrecto=0;
		
		
		Cuestionario[0] = new PreguntaVoF("Curry es el mejor triplita de la NBA", "V");
		Cuestionario[1] = new PreguntaVoF("El ultimo campeon de la NBA son los Warriors", "F");
		
		List <String>respuesta =new ArrayList<String>();
		respuesta.add("Chicago Bulls");
		respuesta.add("Warrios");
		respuesta.add("Thunder");
		respuesta.add("milwaukee bucks");
		Cuestionario[2] = new PreguntaUnica("quien es el actual campeon de la NBA", respuesta, 2);
		
		List <String>respuesta1 =new ArrayList<String>();
		respuesta1.add("");
		respuesta1.add("");
		respuesta1.add("");
		respuesta1.add("");
		Cuestionario[3] = new PreguntaUnica("");
		
		List <String>respuesta2 =new ArrayList<String>();
		respuesta2.add("");
		respuesta2.add("");
		respuesta2.add("");
		respuesta2.add("");
		Cuestionario[4] = new PreguntaUnica("");
	}
}
