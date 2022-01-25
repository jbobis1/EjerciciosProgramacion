package capitulo04.bloque03;

public class CampoBatalla {
		
		private Humano arrayHumanos[] = new Humano[20];
		private Malvado arrayMalvado[] = new Malvado[20];
		 	
		
		private static CampoBatalla instance = null;
		/**
		 * Método del Singleton
		 * @return
		 */
		public static CampoBatalla getInstance () {
			if (instance == null) {
				instance = new CampoBatalla();
			}
			return instance;
		}
		
		
	public CampoBatalla() {
		
		for (int i = 0; i < arrayMalvado.length; i++) {
			if (i < arrayMalvado.length) {
				arrayMalvado[i] = new  Malvado(); 	
			}
			
			Personaje ultimoElemento = arrayMalvado[arrayMalvado.length - 1];
			ultimoElemento.setVida(ultimoElemento.getVida() * 2);
			
		}
			
		for (int i = 0; i < arrayHumanos.length; i++) {
			if (i < arrayHumanos.length) {
				arrayHumanos[i] = new  Humano(); 	
			}
			
			Personaje ultimoElemento = arrayMalvado[arrayHumanos.length-1];
			ultimoElemento.setVida(ultimoElemento.getVida() * 2);
		
		}
		
	}
		
	
	public void comienzaBatalla() {
		Malvado primerAlienVivo;
		Humano primerHumanoVivo;
		
		do {


			// Disparamos Alien sobre Humano
			primerAlienVivo = (Malvado) localizarPrimerPersonajeVivo(arrayMalvado);
			primerHumanoVivo = (Humano) localizarPrimerPersonajeVivo(arrayHumanos);
			disparaSobrePersonaje(primerAlienVivo, primerHumanoVivo);
			
			// Disiparamos Humano sobre Alien
			primerHumanoVivo = (Humano) localizarPrimerPersonajeVivo(arrayHumanos);
			if (primerHumanoVivo == null) {
				System.out.println("Han ganado los Aliens");
			}
			else {
				disparaSobrePersonaje(primerHumanoVivo, primerAlienVivo);
				
				// Compruebo los bandos
				primerAlienVivo = (Malvado) localizarPrimerPersonajeVivo(arrayMalvado);
				if (primerAlienVivo == null) {
					System.out.println("Han ganado los humanos");
				}
			}
			
		} while (primerHumanoVivo != null && primerAlienVivo != null);
	}
	
	
	public Malvado[] mezclarArray (Personaje array[]) {
			
		for (int i = 0; i < array.length; i++) {
			int pos1 = (int) Math.round(Math.random() * (array.length-1));
				int pos2 = (int) Math.round(Math.random() * (array.length-1));
				Personaje aux = array[pos1];
				array[pos1] = array[pos2];
				array[pos2] = aux;
			}
			return arrayMalvado;	
	}
	
	
	public void disparaSobrePersonaje (Personaje queDispara,  Personaje queRecibe) {
		int danio = (int) Math.round(Math.random() * (25 - 5) + 5);
		queRecibe.setVida(queRecibe.getVida() - danio);
			
		if (queRecibe.getVida() <= 0) {
			queRecibe.setVivo(false);	
		}
	
		queRecibe.setDisparosrecibidos(queRecibe.getDisparosrecibidos()+1);
			
	}
	

	public static Personaje localizarPrimerPersonajeVivo (Personaje array[]) {
		for (Personaje p : array) {
			if (p.getVida() > 0) {
				return p;
			}
		}
		
		return null;
	}
	
	
	public static Personaje personajeConMasdisparos (Personaje array[]) {
		Personaje p = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i].getDisparosrecibidos() > p.getDisparosrecibidos()) {
				p = array[i];
			}
		}
		
		return p;
	}
	
	
	public static Personaje personajeConMenosdisparos (Personaje array[]) {
		Personaje m = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i].getDisparosrecibidos() < m.getDisparosrecibidos()) {
				m = array[i];
			}
		}
		
		return m;
	}
	
	public static Malvado MalvadoConMasdisparos (Malvado array[]) {
		Malvado Malvadom = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i].getDisparosrecibidos() < Malvadom.getDisparosrecibidos()) {
				Malvadom = array[i];
			}
		}
		
		return (Malvado) Malvadom;
	}
	
	
	public static Malvado MalvadoMenosdisparos (Malvado array[]) {
		Malvado Malvadon = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i].getDisparosrecibidos() < Malvadon.getDisparosrecibidos()) {
				Malvadon = array[i];
			}
		}
		
		return (Malvado) Malvadon;
	}
	
	
	
	public static Humano HumanoConMenosdisparos (Humano array[]) {
		Humano humanon = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i].getDisparosrecibidos() < humanon.getDisparosrecibidos()) {
				humanon = array[i];
			}
		}
		
		return (Humano) humanon;
	}
	
	
	public static Humano HumanoConMasdisparos (Humano array[]) {
		Humano humanom = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i].getDisparosrecibidos() < humanom.getDisparosrecibidos()) {
				humanom = array[i];
			}
		}
		
		return (Humano) humanom;
	}
	
	
	
	public static void setInstance(CampoBatalla instance) {
		CampoBatalla.instance = instance;
	}

	public Humano[] getArrayHumanos() {
		return arrayHumanos;
	}

	public void setArrayHumanos(Humano[] arrayHumanos) {
		this.arrayHumanos = arrayHumanos;
	}

	public Malvado[] getArrayMalvado() {
		return arrayMalvado;
	}

	public void setArrayMalvado(Malvado[] arrayMalvado) {
		this.arrayMalvado = arrayMalvado;
	}	
	
}
