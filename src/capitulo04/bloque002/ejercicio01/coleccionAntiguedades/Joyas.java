package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

public class Joyas extends Antigüedad{
	private String materal;





	public Joyas(String materal) {
		super();
		this.materal = materal;
	}

	public Joyas() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Joyas [materal=" + materal + ", getMateral()=" + getMateral() + ", toString()=" + super.toString()
				+ ", getOrigen()=" + getOrigen() + ", getAño_fabricacion()=" + getAño_fabricacion() + ", getPrecio()="
				+ getPrecio() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * @return the materal
	 */
	public String getMateral() {
		return materal;
	}

	/**
	 * @param materal the materal to set
	 */
	public void setMateral(String materal) {
		this.materal = materal;
	}


	
	
	
}
