package examen2022.ejercicio02;

public class Cromos {

	private String IdentificadorJugador;
	private String Nombre;
	private String Puntos;
	
	
	
	public Cromos() {
		super();
	}

	public Cromos(String identificadorJugador, String nombre, String puntos) {
		super();
		IdentificadorJugador = identificadorJugador;
		Nombre = nombre;
		Puntos = puntos;
	}

	@Override
	public String toString() {
		return "cromos [IdentificadorJugador=" + IdentificadorJugador + ", Nombre=" + Nombre + ", Puntos=" + Puntos
				+ "]";
	}

	/**
	 * @return the identificadorJugador
	 */
	public String getIdentificadorJugador() {
		return IdentificadorJugador;
	}

	/**
	 * @param identificadorJugador the identificadorJugador to set
	 */
	public void setIdentificadorJugador(String identificadorJugador) {
		IdentificadorJugador = identificadorJugador;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return the puntos
	 */
	public String getPuntos() {
		return Puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(String puntos) {
		Puntos = puntos;
	}
	
}
