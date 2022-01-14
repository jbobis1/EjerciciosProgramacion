package capitulo04.bloque002.ejercicio01.articulosComestibles;

public class Perecedero extends Articulo{

	private String fechaCaducidad;



	public Perecedero(String fechaCaducidad) {
		super();
		this.fechaCaducidad = fechaCaducidad;
	}


	@Override
	public String toString() {
		return "Perecedero [fechaCaducidad=" + fechaCaducidad + ", getFechaCaducidad()=" + getFechaCaducidad()
				+ ", toString()=" + super.toString() + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() +  "]";
	}


	/**
	 * @return the fechaCaducidad
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}


	/**
	 * @param fechaCaducidad the fechaCaducidad to set
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}





	
	
}
