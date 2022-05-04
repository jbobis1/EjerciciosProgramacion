package capitulo07.bloque01.bloque05;

import java.util.Arrays;

public class Estudiante {

	
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String Dni;
	private String Direccion;
	private String email;
	private String telefono;
	private int Tipologiasexo_id;
	private byte[] imagen;
	
	
	public Estudiante() {
		super();
	}


	public Estudiante(int id, String nombre, String apellido1, String apellido2, String dni, String direccion,
			String email, String telefono, int tipologiasexo_id, byte[] imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		Dni = dni;
		Direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		Tipologiasexo_id = tipologiasexo_id;
		this.imagen = imagen;
	}


	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", Dni=" + Dni + ", Direccion=" + Direccion + ", email=" + email + ", telefono=" + telefono
				+ ", Tipologiasexo_id=" + Tipologiasexo_id + ", imagen=" + Arrays.toString(imagen) + "]";
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
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}


	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}


	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return Dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		Dni = dni;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return Direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}


	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

	/**
	 * @return the tipologiasexo_id
	 */
	public int getTipologiasexo_id() {
		return Tipologiasexo_id;
	}


	/**
	 * @param tipologiasexo_id the tipologiasexo_id to set
	 */
	public void setTipologiasexo_id(int tipologiasexo_id) {
		Tipologiasexo_id = tipologiasexo_id;
	}


	/**
	 * @return the imagen
	 */
	public byte[] getImagen() {
		return imagen;
	}


	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}


	
	
	

	
}
