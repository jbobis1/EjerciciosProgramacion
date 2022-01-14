package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

public class Coche {
	private String modelo;

	public Coche(String modelo) {
		super();
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	
}
