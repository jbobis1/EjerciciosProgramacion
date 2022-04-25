package capitulo07.bloque01.bloque05;

public class Estudiante {

	
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String Dni;
	private String Direccion;
	private String email;
	private String telefono;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(int id, String nombre, String apellido1, String apellido2, String dni, String direccion,
			String email, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		Dni = dni;
		Direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", Dni=" + Dni + ", Direccion=" + Direccion + ", email=" + email + ", telefono=" + telefono + "]";
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

}
