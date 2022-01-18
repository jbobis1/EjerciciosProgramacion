package capitulo04.bloque002.ejercicio01.cuestionario;

import java.util.Scanner;

public class PreguntaVoF extends Pregunta {
	String respuesta;
	
	public PreguntaVoF() {
		
	}
	public PreguntaVoF(String enunciado, String respuesta) {
		super(enunciado);
		this.respuesta=respuesta.toUpperCase();
	}
		
	@Override
	public String getEnunciado() {
		return super.getEnunciado()+ "(\"V\" o \"F\"):";
	}

	@Override
	public boolean pedirRespuesta() {
		Scanner sc = new Scanner(System.in);
		String respuestaUsuario = sc.next();
		
		if(respuestaUsuario.toUpperCase().equals(this.respuesta)) {
			System.out.println("Respuesta Correcta");
			return true;
		}
		else {
			System.out.println("Respuesta Incorrecta");
			return false;
		}
	}
}
