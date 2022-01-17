package capitulo04.bloque002.ejercicio01.cuestionario;

public class Pregunta {
	private String Pregunta1;
	private String Pregunta2;
	private String Pregunta3;
	private String Pregunta4;
	
	public Pregunta() {
		super();
	}

	public Pregunta(String pregunta1, String pregunta2, String pregunta3, String pregunta4) {
		super();
		Pregunta1 = pregunta1;
		Pregunta2 = pregunta2;
		Pregunta3 = pregunta3;
		Pregunta4 = pregunta4;
	}

	@Override
	public String toString() {
		return "Pregunta [Pregunta1=" + Pregunta1 + ", Pregunta2=" + Pregunta2 + ", Pregunta3=" + Pregunta3
				+ ", Pregunta4=" + Pregunta4 + "]";
	}

	public String getPregunta1() {
		return Pregunta1;
	}

	public void setPregunta1(String pregunta1) {
		Pregunta1 = pregunta1;
	}

	public String getPregunta2() {
		return Pregunta2;
	}

	public void setPregunta2(String pregunta2) {
		Pregunta2 = pregunta2;
	}

	public String getPregunta3() {
		return Pregunta3;
	}

	public void setPregunta3(String pregunta3) {
		Pregunta3 = pregunta3;
	}

	public String getPregunta4() {
		return Pregunta4;
	}

	public void setPregunta4(String pregunta4) {
		Pregunta4 = pregunta4;
	}

}
