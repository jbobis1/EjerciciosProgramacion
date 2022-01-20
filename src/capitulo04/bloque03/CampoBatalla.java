package capitulo04.bloque03;

public class CampoBatalla {
		
		private Humano arrayHumanos[] = new Humano[20];
		private Malvado arrayMalvado[] = new Malvado[20];
		 	
	 		
	public CampoBatalla() {
		
		inicializaArrayPersonajes(arrayMalvado);
		inicializaArrayPersonajes(arrayHumanos);
		
	}
	
	public static void inicializaArrayPersonajes (Personaje array[]) {
		
		for (int i = 0; i < array.length; i++) {
			if (array instanceof Malvado[]) {
				array[i] = new Malvado(); 		
			}
			if (array instanceof Humano[]) {
				array[i] = new Humano();	
			}	
		}

		Personaje ultimoElemento = array[array.length - 1];
		ultimoElemento.setVida(ultimoElemento.getVida() * 2);
		
		}
	
	
	public void iniciaBatalla() {
		Malvado primerAlienVivo;
		Humano primerHumanoVivo;
		
		do {
			// Después de los dos disparos
			muestraCampoBatalla();

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
			}
			
			// Compruebo los bandos
			primerAlienVivo = (Malvado) localizarPrimerPersonajeVivo(arrayMalvado);
			if (primerAlienVivo == null) {
				System.out.println("Han ganado los humanos");
			}


		} while (primerHumanoVivo != null && primerAlienVivo != null);
	}
	
	public void muestraCampoBatalla() {
		System.out.print("Aliens: ");
		for (Malvado a : this.arrayMalvado) {
			muestraEnConsolaSerializable(a);
		}
		System.out.print("\nHumanos: ");
		for (Humano h : this.arrayHumanos) {
			muestraEnConsolaSerializable(h);
		}
		System.out.println("\n");
	}
	
	
	private void muestraEnConsolaSerializable (Serializable s) {
		System.out.print(s.serializar());
	}
	
	public static Personaje localizarPrimerPersonajeVivo (Personaje array[]) {
		for (Personaje p : array) {
			if (p.getVida() > 0) {
				return p;
			}
		}
		return null;
	}
}

