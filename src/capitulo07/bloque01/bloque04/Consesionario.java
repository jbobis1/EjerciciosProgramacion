package capitulo07.bloque01.bloque04;

public class Consesionario {

	private int id;
	private String cif;
	private String nombre;
	private String localidad;
	
	


	public Consesionario() {
		super();
	}


	public Consesionario(int id, String cif, String nombre, String localidad) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
		this.localidad = localidad;
	}


	@Override
	public String toString() {
		return "Consesionario [id=" + id + "]";
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
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}


	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
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
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	

}
