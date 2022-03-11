package examensegundo2022;

public class Jugada {
	private int id;
	private String descripcion;
	private int puntos;
	private int probavilidad;
	
	
	public Jugada() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	private boolean puedoDisparar() {

		
		int disparo = (int) Math.round(Math.random() * (100 - (-10))) -100;; // Obtengo un número al azar entre 0 y 100
		// Si el número es menor o igual a la probabilidadDisparo del objeto, decido disparar
		if (disparo < probavilidad) {
			return true;
		}
		
		
		return false; // Si llego hasta aquí es porque la probabilidad no se ha cumplido
	}
	
		
		
	
	


	public Jugada(int id, String descripcion, int puntos, int probavilidad) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.puntos = puntos;
		this.probavilidad = probavilidad;
	}


	@Override
	public String toString() {
		return "Jugada [id=" + id + ", descripcion=" + descripcion + ", pntos=" + puntos + ", probavilidad="
				+ probavilidad + "]";
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * @return the pntos
	 */
	public int getPntos() {
		return puntos;
	}


	/**
	 * @param pntos the pntos to set
	 */
	public void setPntos(int pntos) {
		this.puntos = pntos;
	}
	

	/**
	 * @return the probavilidad
	 */
	public int getProbavilidad() {
		return probavilidad;
	}


	/**
	 * @param probavilidad the probavilidad to set
	 */
	public void setProbavilidad(int probavilidad) {
		this.probavilidad = probavilidad;
	}
	
	
	
	
}
