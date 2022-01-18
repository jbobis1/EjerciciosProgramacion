package capitulo04.bloque002.ejercicio01.cuestionario;

import java.util.List;
import java.util.Scanner;

public class PreguntaUnica extends Pregunta {

	List<String> Posiblesrespuestas;
	int  respuesta;
	public PreguntaUnica() {
		
	}

	public PreguntaUnica(String enunciado,List<String> Posiblesrespuestas, int  respuesta) {
		super(enunciado);
		this.Posiblesrespuestas = Posiblesrespuestas;
		this.respuesta = respuesta;
	}

	@Override
	public String getEnunciado() {
		String e = super.getEnunciado();
		for (int i =0;i <this.Posiblesrespuestas.size();i++) {
			e += "\t" + (i +1) + "-" + this.Posiblesrespuestas.get(i) + "\n";
		}
		e += "Tu respuesta es: ";
		return e;
	}

	@Override
	public boolean pedirRespuesta() {
		Scanner sc = new Scanner(System.in);
		int respuestaUsuario =sc.nextInt();
		
		if(respuestaUsuario == this.respuesta) {
			System.out.println("Respuesta Correcta");
			return true;
			
		}
		else {
			System.out.println("Respuesta Incorrecta");
			return false;
		}
	}





	
}
