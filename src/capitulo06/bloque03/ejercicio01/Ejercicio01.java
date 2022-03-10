package capitulo06.bloque03.ejercicio01;

import javax.swing.JOptionPane;


public class Ejercicio01 {

		public static void main(String[] args) {
		
			try {
				
				System.out.println(pideNumeroPar());
			} 
			catch ( NumeroParExecption  e) {
				System.out.println("EL numero es par: " + e.getMessage());
				e.printStackTrace();
			}
		}
		
		private static String pideNumeroPar() throws NumeroParExecption {						
			StringBuffer sb = new StringBuffer();
			int numero;
			do {
	
				 numero = Integer.parseInt(JOptionPane.showInputDialog("cantidad de numero"));
				
			}while(numero % 2 != 0);
						
			if (numero % 2 == 0) {
				throw new NumeroParExecption("el numero es par");
			}
			
			return sb.toString();
		}
	}

	