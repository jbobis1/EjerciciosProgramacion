package examen15_03_22;

import capitulo04.bloque002.ejercicio01.articulosComestibles.Articulo;

public class Pizza extends Articulo {

	private String sabor;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}



	public Pizza(String codigo, String nombre, int precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}






	/**
	 * @return the sabor
	 */
	public String getSabor() {
		return sabor;
	}

	/**
	 * @param sabor the sabor to set
	 */
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
