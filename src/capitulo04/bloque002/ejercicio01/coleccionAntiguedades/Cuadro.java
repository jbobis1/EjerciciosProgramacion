package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

public class Cuadro extends Antiguedad{
	private String pintor;

	public Cuadro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuadro(String origen, String fecha_fabricacion, int precio) {
		super(origen, fecha_fabricacion, precio);
		// TODO Auto-generated constructor stub
	}

	public Cuadro(String pintor) {
		super();
		this.pintor = pintor;
	}

	@Override
	public String toString() {
		return "Cuadro [pintor=" + pintor + ", toString()=" + super.toString() + ", getOrigen()=" + getOrigen()
				+ ", getFecha_fabricacion()=" + getFecha_fabricacion() + ", getPrecio()=" + getPrecio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getPintor() {
		return pintor;
	}

	public void setPintor(String pintor) {
		this.pintor = pintor;
	}


	
	

}
