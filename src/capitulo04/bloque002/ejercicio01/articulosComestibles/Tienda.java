package capitulo04.bloque002.ejercicio01.articulosComestibles;

import javax.swing.JOptionPane;

public class Tienda {
	public static void main(String[] args) {
		
		
		Perecedero patatasFritas = new Perecedero(null);
		
		patatasFritas.setCodigo(JOptionPane.showInputDialog("Codigo DEL articulo "));
		patatasFritas.setNombre(JOptionPane.showInputDialog("nombre "));
		patatasFritas.setPrecio (Integer.parseInt(JOptionPane.showInputDialog("precio ")));
		
		if(patatasFritas instanceof Perecedero) {
			Perecedero p =(Perecedero)patatasFritas;
			p.setFechaCaducidad (JOptionPane.showInputDialog("fecha caducidad "));
		}

		System.out.println("patatasFritas");
		System.out.println(patatasFritas);
		
		System.out.println(" ");
		
		Perecedero pizza = new Perecedero(null);
		
		pizza.setCodigo(JOptionPane.showInputDialog("Codigo DEL articulo "));
		pizza.setNombre(JOptionPane.showInputDialog("nombre "));
		pizza.setPrecio (Integer.parseInt(JOptionPane.showInputDialog("precio ")));
		
		if(pizza instanceof Perecedero) {
			Perecedero a =(Perecedero)pizza;
			a.setFechaCaducidad (JOptionPane.showInputDialog("fecha caducidad "));
		}

		System.out.println("pizza");
		System.out.println(pizza);
		
		System.out.println(" ");
		
		
		Nopedecedero monitor = new Nopedecedero();
		
		monitor.setCodigo(JOptionPane.showInputDialog("Codigo DEL articulo "));
		monitor.setNombre(JOptionPane.showInputDialog("nombre "));
		monitor.setPrecio (Integer.parseInt(JOptionPane.showInputDialog("precio ")));
	
	
		System.out.println("monitor");
		System.out.println(monitor);
		
		System.out.println(" ");
		
		
		Nopedecedero libro = new Nopedecedero();
		
		libro.setCodigo(JOptionPane.showInputDialog("Codigo DEL articulo"));
		libro.setNombre(JOptionPane.showInputDialog("Nombre del articulo "));
		libro.setPrecio (Integer.parseInt(JOptionPane.showInputDialog("Precio del articulo ")));
	
	
		System.out.println("libro");
		System.out.println(libro);
		
		System.out.println(" ");
		
	
	}
	
	
}
