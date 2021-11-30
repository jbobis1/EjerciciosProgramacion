package ejercicio.ejercicio04;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numeroa = Integer.parseInt(JOptionPane.showInputDialog("Primer Numero:  "));
		int numerob = Integer.parseInt(JOptionPane.showInputDialog("Segundo Numero:  "));
		double valor = 0; 

		numeros(numeroa,  numerob, valor);
		System.out.println(	numeros(numeroa,  numerob, valor));	
	}
	
	public static double numeros(int numeroa, int numerob,  double valor) {
		
		if (numeroa < 0) {
			valor=0;
		
		}
		else if (numerob < 0) {
			valor=0;
		}
		else  {
			valor=(numeroa+numerob)/2;
		}
		return valor;
	}
}
