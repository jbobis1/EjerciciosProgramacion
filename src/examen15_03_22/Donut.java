package examen15_03_22;

import capitulo04.bloque002.ejercicio01.articulosComestibles.Articulo;

public class Donut extends Articulo {

	private String color;
	
	public Donut() {
		// TODO Auto-generated constructor stub
	}

	public Donut(String codigo, String nombre, int precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
