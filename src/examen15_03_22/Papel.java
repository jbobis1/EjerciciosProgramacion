package examen15_03_22;

import capitulo04.bloque002.ejercicio01.articulosComestibles.Articulo;

public class Papel extends Articulo {

	private int capas;
	
	public Papel() {
		// TODO Auto-generated constructor stub
	}

	public Papel(String codigo, String nombre, int precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the capas
	 */
	public int getCapas() {
		return capas;
	}

	/**
	 * @param capas the capas to set
	 */
	public void setCapas(int capas) {
		this.capas = capas;
	}

}
