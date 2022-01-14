package capitulo04.bloque002.ejercicio01.articulosComestibles;

public class Cuadro {
	private String pintor;

	public Cuadro(String pintor) {
		super();
		this.pintor = pintor;
	}

	@Override
	public String toString() {
		return "Cuadro [pintor=" + pintor + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	/**
	 * @return the pintor
	 */
	public String getPintor() {
		return pintor;
	}

	/**
	 * @param pintor the pintor to set
	 */
	public void setPintor(String pintor) {
		this.pintor = pintor;
	}
	
	

}
