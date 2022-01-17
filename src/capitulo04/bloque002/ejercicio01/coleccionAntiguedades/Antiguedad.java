package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

public class Antiguedad{
	private String origen;
	private String fecha_fabricacion;
	private int precio;
	
	public Antiguedad() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Antiguedad(String origen, String fecha_fabricacion, int precio) {
		super();
		this.origen = origen;
		this.fecha_fabricacion = fecha_fabricacion;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Antiguedad [origen=" + origen + ", fecha_fabricacion=" + fecha_fabricacion + ", precio=" + precio
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getFecha_fabricacion() {
		return fecha_fabricacion;
	}
	public void setFecha_fabricacion(String fecha_fabricacion) {
		this.fecha_fabricacion = fecha_fabricacion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	



	

	
}

