package examen15_03_22;

public class Caja {
	private int id;
	private String nombre;
	private int unidades;
	private float precio;
	
	
	
	
	public Caja() {
		super();
	}




	public Caja(int id, String nombre, int unidades, float precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.unidades = unidades;
		this.precio = precio;
	}




	@Override
	public String toString() {
		return "Caja [id=" + id + ", nombre=" + nombre + ", unidades=" + unidades + ", precio=" + precio + "]";
	}




	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}




	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}




	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}




	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	/**
	 * @return the unidades
	 */
	public int getUnidades() {
		return unidades;
	}




	/**
	 * @param unidades the unidades to set
	 */
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}




	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}




	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
}
