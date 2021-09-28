package capitulo01.bloque01;

import javax.swing.JOptionPane;

public class Ejercicios06 {
	
	public static void main(String []args) {
				
		
		String str = JOptionPane.showInputDialog("Introduce el Importe a hipotecar 2: ");
		float importe = Float.parseFloat(str);
		
		
		str = JOptionPane.showInputDialog("Introduce el numero de meses: ");
		float n = Float.parseFloat(str);		
				
		str = JOptionPane.showInputDialog("Introduce los Euros: ");
		float eur = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduce el diferencial: ");
		float dif = Float.parseFloat(str);	
		
		float ianual = eur + dif;  
		
		double im = (ianual/12)/100;
	
	   	double cmesual =importe*(((im*Math.pow((1+im),n)))/(Math.pow((1+im),n)-1));
		
	   	System.out.println("La cueta mensual es de: " + cmesual );
				
				
	}
	
			
}
