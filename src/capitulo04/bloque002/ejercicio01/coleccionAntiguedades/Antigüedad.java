package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

public class Antigüedad {
	private String origen;
	private int año_fabricacion;
	private int precio;
	
	
	public Antigüedad() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Antigüedad [origen=" + origen + ", año_fabricacion=" + año_fabricacion + ", precio=" + precio + "]";
	}


	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}


	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}


	/**
	 * @return the año_fabricacion
	 */
	public int getAño_fabricacion() {
		return año_fabricacion;
	}


	/**
	 * @param año_fabricacion the año_fabricacion to set
	 */
	public void setAño_fabricacion(int año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}


	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}

