package capitulo04.bloque00.prueba;

public class baraja {
	/**
	 * 
	 * @author diurno
	 *
	 */
	public class GesionarCromo {
		 private String  palocarta;
		 private int valor,idcarta;
		 	 
		/**
		 *  
		 */
		public GesionarCromo() {
			super();
		}
		
		/**
		 * 
		 * @param palocarta
		 * @param valor
		 * @param idcarta
		 */
		public GesionarCromo(String palocarta, int valor, int idcarta) {
			super();
			this.palocarta = palocarta;
			this.valor = valor;
			this.idcarta = idcarta;
		}

		/**
		 * 
		 * @return
		 */
		
		public String getPalocarta() {
			return palocarta;
		}

		/**
		 * 
		 * @param palocarta
		 */
		public void setPalocarta(String palocarta) {
			this.palocarta = palocarta;
		}

		/**
		 * 
		 * @return
		 */
		public int getValor() {
			return valor;
		}

		/**
		 * 
		 * @param valor
		 */
		public void setValor(int valor) {
			this.valor = valor;
		}

		/**
		 * 
		 * @return
		 */
		public int getIdcarta() {
			return idcarta;
		}

		/**
		 * 
		 * @param idcarta
		 */
		public void setIdcarta(int idcarta) {
			this.idcarta = idcarta;
		}

		@Override
		public String toString() {
			return "GesionarCromo [palocarta=" + palocarta + ", valor=" + valor + ", idcarta=" + idcarta + "]";
		} 
	}
}
