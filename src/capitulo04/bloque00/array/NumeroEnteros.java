package capitulo04.bloque00.array;

public class NumeroEnteros {

	private int valor;

	public NumeroEnteros() {
		
	
	}

	public NumeroEnteros(int valor) {
		
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "NumeroEnteros [valor=" + valor + "]";
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
