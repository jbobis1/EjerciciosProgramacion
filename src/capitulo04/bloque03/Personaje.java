package capitulo04.bloque03;

public abstract class Personaje {

		private int Vida;
		private String Nombre;
		private boolean vivo;
		
		public Personaje() {
			this.Vida = (int) Math.round(Math.random() * (100 - 50) + 50);
		}

		public Personaje(int vida, String nombre, boolean vivo) {
			super();
			Vida = vida;
			Nombre = nombre;
			this.vivo = vivo;
		}

		@Override
		public String toString() {
			return "Personaje [Vida=" + Vida + ", Nombre=" + Nombre + ", vivo=" + vivo + "]";
		}

		/**
		 * @return the vida
		 */
		public int getVida() {
			return Vida;
		}

		/**
		 * @param vida the vida to set
		 */
		public void setVida(int vida) {
			Vida = vida;
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
		 * @return the vivo
		 */
		public boolean isVivo() {
			return vivo;
		}

		/**
		 * @param vivo the vivo to set
		 */
		public void setVivo(boolean vivo) {
			this.vivo = vivo;
		}	
		
}

