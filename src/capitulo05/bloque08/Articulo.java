package capitulo05.bloque08;

public class Articulo {
	private String NumBarras;
	private String NumEstante;
	private String CantidadUnidad;
	
	
	public Articulo(String numBarras, String numEstante, String cantidadUnidad) {
		super();
		NumBarras = numBarras;
		NumEstante = numEstante;
		CantidadUnidad = cantidadUnidad;
	}


	@Override
	public String toString() {
		return "Articulo [NumBarras=" + NumBarras + ", NumEstante=" + NumEstante + ", CantidadUnidad=" + CantidadUnidad
				+ "]";
	}


	public String getNumBarras() {
		return NumBarras;
	}


	public void setNumBarras(String numBarras) {
		NumBarras = numBarras;
	}


	public String getNumEstante() {
		return NumEstante;
	}


	public void setNumEstante(String numEstante) {
		NumEstante = numEstante;
	}


	public String getCantidadUnidad() {
		return CantidadUnidad;
	}


	public void setCantidadUnidad(String cantidadUnidad) {
		CantidadUnidad = cantidadUnidad;
	}
	
	
}
