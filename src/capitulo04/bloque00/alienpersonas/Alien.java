package capitulo04.bloque00.alienpersonas;

public class Alien {

	private int vida;
	private int daño;
	private int PorcentajeAcierto;
	
	public Alien() {
		super();
	}

	public Alien(int vida, int daño, int porcentajeAcierto) {
		super();
		this.vida = vida;
		this.daño = daño;
		PorcentajeAcierto = porcentajeAcierto;
	}

	@Override
	public String toString() {
		return "Alien [vida=" + vida + ", daño=" + daño + ", PorcentajeAcierto=" + PorcentajeAcierto + "]";
	}

	/**
	 * @return the vida
	 */
	public int getVida() {
		return vida;
	}

	/**
	 * @param vida the vida to set
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}

	/**
	 * @return the daño
	 */
	public int getDaño() {
		return daño;
	}

	/**
	 * @param daño the daño to set
	 */
	public void setDaño(int daño) {
		this.daño = daño;
	}

	/**
	 * @return the porcentajeAcierto
	 */
	public int getPorcentajeAcierto() {
		return PorcentajeAcierto;
	}

	/**
	 * @param porcentajeAcierto the porcentajeAcierto to set
	 */
	public void setPorcentajeAcierto(int porcentajeAcierto) {
		PorcentajeAcierto = porcentajeAcierto;
	}
	
}

