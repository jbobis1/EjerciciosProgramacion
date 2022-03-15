package examen15_03_22;

import capitulo04.bloque002.ejercicio01.articulosComestibles.Articulo;

public class Pan extends Articulo {
	
	private String tipo;
	
	
	public Pan() {
		// TODO Auto-generated constructor stub
	}

	public Pan(String codigo, String nombre, int precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
