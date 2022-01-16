package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

public class Coche extends Antiguedad{
	private String modelo;

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Coche(String origen, String fecha_fabricacion, int precio) {
		super(origen, fecha_fabricacion, precio);
		// TODO Auto-generated constructor stub
	}

	public Coche(String modelo) {
		super();
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", toString()=" + super.toString() + ", getOrigen()=" + getOrigen()
				+ ", getFecha_fabricacion()=" + getFecha_fabricacion() + ", getPrecio()=" + getPrecio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	
}
