package capitulo04.bloque00.prueba;

public class gestionarbaraja {
	
	
	private baraja carta[];
	/*
	 * 
	 */
	public gestionarbaraja() {
		carta = new baraja[52];
		inicializarArrayCarta(carta);
				
	}
	public void inicializarArrayCarta(baraja[] carta2) {
		// Recoremos cada palo de la baraja
		
		int k = 0 ;
		
		for(int i=0; i < 4; i++ ) {
			
			//Recoremos todas las cartas de un palo
			for (int j = 1; j < 14; j++) {
				
			 //Inicializamos cada casrta 
			switch(i) {
			
			}
				
			carta[k]=new baraja("diamantes" , j ,k );
			k++;
			}
		}
	}
}
