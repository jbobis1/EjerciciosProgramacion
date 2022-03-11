package examensegundo2022;

public class Jugador {
	private String nombre;
	private int puntos;
	
	
	
	public Jugador() {
		super();
	}



	public Jugador(String nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}



	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntos=" + puntos + "]";
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}



	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public void add(Jugador jugador) {
		// TODO Auto-generated method stub
		
	}



	public void put(String nombre2, Jugador a) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
