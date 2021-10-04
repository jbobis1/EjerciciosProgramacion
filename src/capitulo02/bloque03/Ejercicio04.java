package capitulo02.bloque03;

import javax.swing.JOptionPane;

public class Ejercicio04 {
	public static void main(String[] args) {
		float euro, cincocuentacent, venticincocent,cincocent,unocent,
		 coste,importe, pagofinal;
		
		float euro1, cincocuentacent1, venticincocent1,cincocent1, unocent1;
		
		String str;
	

		str = JOptionPane.showInputDialog(" Cuanto cuesta: ");
		coste = Integer.parseInt(str);
		System.out.printf(" coste de lo comprado: " + coste);
		
		str = JOptionPane.showInputDialog("monedas de un euro: ");
		euro = Integer.parseInt(str);
		euro1 = (float) (euro * 1.00);
		//System.out.printf("monedas de euro: " + euro1);
			

		str = JOptionPane.showInputDialog(" -Monedas de cincuenta centimos: ");
		cincocuentacent = Integer.parseInt(str);
		cincocuentacent1 = (float) (cincocuentacent * 0.50);
		//System.out.printf(" -Monedas de euro: " + cincocuentacent1);
	
		str = JOptionPane.showInputDialog(" -Monedas de veinticinco centimos: ");
		venticincocent = Integer.parseInt(str);
		venticincocent1 = (float) (venticincocent * 0.25);
		//System.out.printf(" -Monedas de euro: " + venticincocent1);
		
		str = JOptionPane.showInputDialog(" -Monedas de un cinco centimos: ");
		cincocent = Integer.parseInt(str);
		cincocent1 = (float) (cincocent * 0.05);
		//System.out.printf(" -Monedas de euro: " + cincocent1);
		
		str = JOptionPane.showInputDialog(" -Monedas de un centimo: ");
		unocent = Integer.parseInt(str);
		unocent1 = (float) (unocent * 0.01);
		//System.out.printf(" -Monedas de euro: " + unocent1);
		
		importe = cincocuentacent1 + euro1 + venticincocent1+ cincocent1 + unocent;
		System.out.printf(" -Importe: " + importe);
		
		pagofinal = importe - coste;
		
		System.out.printf(" -Me debuelven: " + pagofinal);
		
		
				
				
			
	//	numero = Integer.parseInt(str);
	//	cincocuentacent = 0.50;
	//	venticincocent = 0.25;
	//	cincocent = 0.05;
	//	unocent = 0.01;
		
	
			
		
		
	}
}
	 
	
	
	