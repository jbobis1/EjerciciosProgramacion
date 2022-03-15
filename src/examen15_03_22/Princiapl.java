package examen15_03_22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import examen.Jugada;
import examen.Jugador;
import examen.TiradaAl100FallidaException;

public class Princiapl {
	private static List<Articulo> articulo = new ArrayList<Articulo>();
	private static HashMap<String,Articulo> caja = new HashMap<String,Articulo>();	
	
	public static void main(String[] args) {
		
		inicializaArticulos();
		
		mostrarMenuJugadas();
		
		MostrarArticulos(caja);
		
		try {
			pago(caja);
		} catch (PagoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static int mostrarMenuJugadas() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\tJugadas posibles:");
		for (Articulo cajas : caja) {
			System.out.println("\t" + cajas.getId() + " - " + cajas.getNombre() + " " +  cajas.getPrecio() + " - " + cajas.getUnidades());
		}
		System.out.println("ELEMENTO QUE QEUIRES ELIMINAR: ");
		
		if (sc <= cajas.getId()) {
			
			String codigo = JOptionPane.showInputDialog("Introduzca la opcion a elminar: ");	
			caja.remove(codigo);
			
		}
		else {
			System.out.println("NO quieres eleminar nada");
		}
		
		
		return  sc.nextInt();

	}
	
	private static void pago(HashMap<String,Articulo> caja) throws PagoException {
		// recorremos el array para ya mostrarlo
	
		float paga=0;

		for (Articulo cajas : caja) {
			 paga+=cajas.getPrecio();
			
		}
		
		int pago = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));

		System.out.println("El precio es de"+ paga);
		
		if (pago > paga) {
			float d=pago-paga;
			System.out.println("le devuelve;"+d);
		}
		if (pago < paga) {
			throw new PagoException("no te llega el dinero");

		}
		
    }
	
	
	
	private static void MostrarArticulos(HashMap<String,Articulo> caja) {
		// recorremos el array para ya mostrarlo
	
		Object[] articulo = caja.keySet().toArray();
		for (int i = 0; i < articulo.length; i++) {
			caja=articulo.getClass();
			
		}	 
    }
	

	
	
	private static void inicializaArticulos() {
		for (int i = 0; i < 4; i++) {
			articulo.add(new Articulo(1, "PAN" , 2, 2*2));

			articulo.add(new Articulo(2,"Donuct",4,4*1));

			articulo.add(new Articulo(3, "pizza", 2, 2*2));

			articulo.add(new Articulo(4, "papel-" , 8,  8*2));

		}
		
	}

}
