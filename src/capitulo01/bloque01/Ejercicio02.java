package capitulo01.bloque01;

import javax.swing.JOptionPane;

//2.- Realiza un programa igual al anterior, con la particularidad de 
//que ahora se debe mostrar cada número justo a continuación del momento en 
//que ha sido introducido.//

public class Ejercicio02 {
	public static void main(String args[]) {
	String str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
	int var = Integer.parseInt(str);
	System.out.println("- Número introducido: " + var );
		
	str =JOptionPane.showInputDialog("Intoduzca un numero flotante: ");
	float var1 = Float.parseFloat(str);
	System.out.println("- Número introducido: " + var1 );
	
	str = JOptionPane.showInputDialog("Introduzca otro número doble: ");
	double var2 = Double.parseDouble(str);
	System.out.println("- Número introducido: " + var2 );
					
	
}

}
