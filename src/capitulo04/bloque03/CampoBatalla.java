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
}

