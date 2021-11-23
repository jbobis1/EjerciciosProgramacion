package capitulo04.bloque00;

public class Monitor {
	private int pulgadas;
	private String relacionAspecto;
	private int resoluccion;
	private int contraste;
	private int brillo;
	private String conectores;
	
	
	public Monitor(int pulgadas,String relacionAspecto,int resoluccion,int contraste,int brillo,String conectores) {
		this.pulgadas=pulgadas;
		this.relacionAspecto=relacionAspecto;
		this.resoluccion=resoluccion;
		this.contraste=contraste;
		this.brillo=brillo;
		this.conectores=conectores;
	}
	public String toString () {
		return "La pulgada es" + 24 + " La relacion relacion Aspecto es " + 19/6 + " La resoluccion es" + 1600/900 + " Contraste" + 22 + "brillo" + 19 + "conectores" +5;
	}
	
	public int getpulgadas () {
		return this.pulgadas;
	}

	public void setpulgadas (int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public String getrelacionAspecto () {
		return this.relacionAspecto;
	}

	public void setrelacionAspecto (String relacionAspecto) {
		this.relacionAspecto = relacionAspecto;
	}
	
	public int getresolucciono () {
		return this.resoluccion;
	}

	public void setrelacionAspecto (int resoluccion) {
		this.resoluccion = resoluccion;
	}
	public int getcontraste () {
		return this.contraste;
	}

	public void setcontraste (int contraste) {
		this.contraste = contraste;
	}
	
	public int getbrillo () {
		return this.brillo;
	}

	public void setbrillo (int brillo) {
		this.brillo = brillo;
	}
	
	public String getconectores () {
		return this.conectores;
	}

	public void setconectores(String conectores) {
		this.conectores = conectores;
	}
	
	
	
	
}

