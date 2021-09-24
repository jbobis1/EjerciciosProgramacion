package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01_PidoTresNumero {

	public static void main(String args[]) {
		
		String str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
		int var = Integer.parseInt(str);
		
		str =JOptionPane.showInputDialog("Intoduzca un numero flotante: ");
		float var1 = Float.parseFloat(str);
		
		 str = JOptionPane.showInputDialog("Introduzca otro número doble: ");
		double var2 = Double.parseDouble(str);
		
			
		
		
		System.out.println("- Número introducido: " + var +
							" - Número flotante: " + var1 + 
							" - Número doble:" + var2);



	}

}
