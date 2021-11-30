package ejercicio.lapices;

import javax.swing.JOptionPane;

public class Lapices {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el numero de Lapices: ");
		int lapi = Integer.parseInt(JOptionPane.showInputDialog("Numero de lapices:  "));
		float precio=(float) 0.20;
		float valor =0;
		lapices(lapi, precio, valor);
		
		System.out.println(lapices(lapi, precio,valor));
		
	}
	
	public static float lapices(int lapi,float precio,float valor ) {	 
		
			if (lapi < 50) {
				valor=(float) (lapi*precio);
				System.out.println("50-El valor de: " + lapi + " es de: "+valor+"€");
				}
			else if (lapi < 100) {
				valor=(float) ((lapi*precio)/0.05);
				System.out.println("100-El valor de: "+ lapi + " es de: "+valor+"€");
			}
			else if (lapi < 1000) {
				valor=(float) ((lapi*precio)/0.10);
				System.out.println("1000-El valor de: "+ lapi + " es de: "+valor+"€");
			}
			return  valor;
				
		}
	}

