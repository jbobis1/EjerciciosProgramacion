package capitulo04.bloque002.ejercicio01.cuestionario;

import java.util.ArrayList;
import java.util.List;

public class Cuestionario {
	
	public static void main(String[] args) {
		
		Pregunta  Cuestionario[] = new Pregunta[5];
		int contadorcorrecto=0;
		
		
		Cuestionario[0] = new PreguntaVoF("Curry es el jugador con mas triples anotados de la NBA", "V");
		Cuestionario[1] = new PreguntaVoF("El ultimo campeon de la NBA son los Warriors", "F");
		
		List <String>respuesta =new ArrayList<String>();
		respuesta.add("Chicago Bulls");
		respuesta.add("Golden State Warrios");
		respuesta.add("Ocklahoma City Thunder");
		respuesta.add("Milwaukee Bucks");
		Cuestionario[2] = new PreguntaUnica("Quien es el actual campeon de la NBA", respuesta, 4);
		
		List <String>respuesta1 =new ArrayList<String>();
		respuesta1.add("Lebron James");
		respuesta1.add("Nicolas Jokic");
		respuesta1.add("Giannis Antetokounmpo");
		respuesta1.add("Joel Embiid");
		Cuestionario[3] = new PreguntaUnica("Quien fue el ultimo MVP",respuesta, 2);
		
		List <String>respuesta2 =new ArrayList<String>();
		respuesta2.add("Minnesota Timberwolves");
		respuesta2.add("Utah Jazz");
		respuesta2.add("Phoenix Suns");
		respuesta2.add("Cleveland Cavaliers");
		Cuestionario[4] = new PreguntaUnica("Donde juega actualmente Ricky Rubio",respuesta, 4);
		
		
		for (int i= 0; i <Cuestionario.length; i++) {
			System.out.println(Cuestionario[i].getEnunciado());
			if(Cuestionario[i].pedirRespuesta()==true){
				contadorcorrecto++;
			}
		}
		System.out.println("Preguntas acertadas: " + contadorcorrecto);
	}
}
