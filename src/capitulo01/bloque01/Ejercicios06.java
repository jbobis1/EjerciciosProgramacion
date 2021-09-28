package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicios06 {
	
	public static void main(String []args) {
		
		
		
		String str = JOptionPane.showInputDialog("Introduce el Importe a hipotecar: ");
		float importe = Float.parseFloat(str);
		
		
		str = JOptionPane.showInputDialog("Introduce el numero de meses: ");
		float n = Float.parseFloat(str);		
				
		str = JOptionPane.showInputDialog("Introduce los Euros: ");
		float eur = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el diferencial: ");
		float dif = Float.parseFloat(str);	
		
		float ianual = eur + dif;  
		
	//	doble in = (ianual/12)/100;
	
	// doble cmesual =importe*(((im*Math.pow((1+im),n)))/(Math);
				
		
		
	}
	
	
	
	
}
