package capitulo04.bloque03;


public class Guerra {
	

	public static void main(String args[]) {		
		// Con esta línea se inicializa el campo de batalla
		CampoBatalla.getInstance().mezclarArray(CampoBatalla.getInstance().getArrayHumanos());
		CampoBatalla.getInstance().mezclarArray(CampoBatalla.getInstance().getArrayMalvado());
		
		
		// Se realiza la batalla
		CampoBatalla.getInstance().comienzaBatalla();
	}
}


