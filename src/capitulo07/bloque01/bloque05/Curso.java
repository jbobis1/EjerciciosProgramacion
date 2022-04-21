package capitulo07.bloque01.bloque05;

public class Curso {

	private int id;
	private String descripcion;
	
	
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Curso(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Curso [" + id + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
