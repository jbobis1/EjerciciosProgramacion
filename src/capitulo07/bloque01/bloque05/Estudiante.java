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
	private String color;
	
	
	public Estudiante() {
		super();
	}


	public Estudiante(int id, String nombre, String apellido1, String apellido2, String dni, String direccion,
			String email, String telefono, int tipologiasexo_id, byte[] imagen, String color) {
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
		this.color = color;
	}


	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", Dni=" + Dni + ", Direccion=" + Direccion + ", email=" + email + ", telefono=" + telefono
				+ ", Tipologiasexo_id=" + Tipologiasexo_id + ", imagen=" + Arrays.toString(imagen) + ", color=" + color
				+ "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getDni() {
		return Dni;
	}


	public void setDni(String dni) {
		Dni = dni;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getTipologiasexo_id() {
		return Tipologiasexo_id;
	}


	public void setTipologiasexo_id(int tipologiasexo_id) {
		Tipologiasexo_id = tipologiasexo_id;
	}


	public byte[] getImagen() {
		return imagen;
	}


	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
}
