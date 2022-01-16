package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;


public class Libro extends Antiguedad{

	
	private String autor;
	private String titulo;
	
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String origen, String fecha_fabricacion, int precio) {
		super(origen, fecha_fabricacion, precio);
		// TODO Auto-generated constructor stub
	}
	public Libro(String autor, String titulo) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		
	}
	
	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", toString()=" + super.toString() + ", getOrigen()="
				+ getOrigen() + ", getFecha_fabricacion()=" + getFecha_fabricacion() + ", getPrecio()=" + getPrecio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
}
