package capitulo06.bloque03.ejerciocio02;

import javax.swing.JOptionPane;


public class Ejercicio02 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(frase());
		} 
		catch ( EspacioBlancoException | CantidadException | NoBombillaException | PalabrasOfensivasException e) {
			System.out.println("La frase: " + e.getMessage());
			
		}
	}
	
	private static String frase() throws EspacioBlancoException, CantidadException,NoBombillaException, PalabrasOfensivasException  {						
		StringBuffer sb = new StringBuffer();
		String texto = "La bombillaestontassds dsd sdsd sd";
		texto = texto.trim();
		
		if (texto != " " ) {
			throw new EspacioBlancoException(" no tiene caracteres distintos al espacio en blanco");
		}
		
		else {
			int cantidad = 0;
			String palabras[] = texto.split(" ");
			for (int i = 0; i < palabras.length; i++) {
				cantidad ++;
			}
				
			if (cantidad < 3) {
				throw new CantidadException("no tiene mas de 3 palabras");
			
			}
	
			else {
				String pala = "bombilla ";
			
				for (int i = 0; i <= palabras.length; i++) {			
					if (pala!=palabras[i]) {
						throw new NoBombillaException("no aparece la palabra bombilla");
					}
			
				
					else {
						String tonto = "tonto ";
						String tonta = "tonta ";
						String idiota = "idiota ";
						
						for (int j = 0; i <= palabras.length; j++) {
											
							if (tonta != palabras[j] | tonto != palabras[j]   | idiota != palabras[j]) {
								throw new PalabrasOfensivasException("En la frase aparece una palabra ofensiva de la siguiente relaci�n: tonto, tonta, idiota.");
							}
							
							else {
								sb.append("LA FRASE ESTA CORRECTA");		
							}		
						}
					}
				}
			}
		}
		
		return sb.toString();
		
	}	
}
	
