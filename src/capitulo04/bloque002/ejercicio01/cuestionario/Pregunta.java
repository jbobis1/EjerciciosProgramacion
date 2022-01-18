package capitulo04.bloque002.ejercicio01.cuestionario;

public abstract class Pregunta {
	private String enunciado;

	
	public Pregunta() {
	}

	public Pregunta(String enunciado) {
		this.enunciado = enunciado;
	}
	
	
	public abstract boolean pedirRespuesta();
	
	
	
	/**
	 * @return the enunciado
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * @param enunciado the enunciado to set
	 */
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
}
