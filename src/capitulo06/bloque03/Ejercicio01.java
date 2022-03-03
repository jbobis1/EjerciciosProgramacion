package capitulo06.bloque03;

import javax.swing.JOptionPane;


public class Ejercicio01 {

	public Ejercicio01() {
		public static void main(String[] args) {
		
			try {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero"));
				
				System.out.println(pideNumeroPar(numero));
			} 
			catch ( NumeroParExecption  e) {
				System.out.println("EL numero es par: " + e.getMessage());
				
			}

		}
		
		
		private static String pideNumeroPar(int numero) throws NumeroParExecption {						
			StringBuffer sb = new StringBuffer();
			
			if (numero % 2 == 0) {
				throw new NumeroParExecption("el numero es par");
			}
			
			return sb.toString();

		}
	
	}
}
	