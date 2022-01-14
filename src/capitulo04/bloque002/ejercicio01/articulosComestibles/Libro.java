package capitulo04.bloque002.ejercicio01.articulosComestibles;

import capitulo04.bloque002.ejercicio01.coleccionAntiguedades.Antigüedad;

public class Libro extends Antigüedad{

	private String autor;
	private String titulo;
	
	public Libro() {
		super();
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
				+ getOrigen() + ", getAño_fabricacion()=" + getAño_fabricacion() + ", getPrecio()=" + getPrecio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
