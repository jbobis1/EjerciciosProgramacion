package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

public class Joyas extends Antiguedad{
	private String materal;

	public Joyas() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Joyas(String origen, String fecha_fabricacion, int precio) {
		super(origen, fecha_fabricacion, precio);
		// TODO Auto-generated constructor stub
	}

	public Joyas(String materal) {
		super();
		this.materal = materal;
	}



	@Override
	public String toString() {
		return "Joyas [materal=" + materal + ", getMateral()=" + getMateral() + ", toString()=" + super.toString()
				+ ", getOrigen()=" + getOrigen() + ", getFecha_fabricacion()=" + getFecha_fabricacion()
				;
	}

	public String getMateral() {
		return materal;
	}

	public void setMateral(String materal) {
		this.materal = materal;
	}



	
	
}
