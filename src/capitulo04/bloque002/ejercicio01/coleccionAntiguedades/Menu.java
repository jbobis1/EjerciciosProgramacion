package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

import javax.swing.JOptionPane;

import capitulo04.bloque002.ejercicio01.articulosComestibles.Perecedero;

public class Menu {
	
	

	public static void main(String[] args) {
	System.out.println("Menu:");
	System.out.println("0.- Salir");
	System.out.println("1.- Joyas");	
	System.out.println("2.- Libro ");
	System.out.println("3.- Coche");	
	System.out.println("4.- Cuadro ");
	
	
	int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
	
	switch(opcion) {
	case 0:
		System.out.printf("Fin");
		break;
		
	case 1:
		Joyas collar = new Joyas();
		
		collar.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		collar.setOrigen((JOptionPane.showInputDialog("Origen ")));
		collar.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		if(collar instanceof Joyas) {
			Joyas a =(Joyas)collar;
			a.setMateral((JOptionPane.showInputDialog("Material ")));
		}
		
	
		
		System.out.println("collar");
		System.out.println(collar);
		
		System.out.println(" ");

			
	case 2:
		Libro mkl = new Libro();
		
		mkl.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		mkl.setOrigen((JOptionPane.showInputDialog("Origen ")));
		mkl.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		if(mkl instanceof Libro) {
			Libro b =(Libro)mkl;
			b.setAutor((JOptionPane.showInputDialog("Autor ")));
		}
		
		if(mkl instanceof Libro) {
			Libro c =(Libro)mkl;
			c.setTitulo((JOptionPane.showInputDialog("Titulo ")));
		}
		
		System.out.println("mkl");
		System.out.println(mkl);
		
		System.out.println(" ");

	case 3:
		Cuadro monalisa = new Cuadro();
		
		monalisa.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		monalisa.setOrigen((JOptionPane.showInputDialog("Origen ")));
		monalisa.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		if(monalisa instanceof Cuadro) {
			Cuadro e =(Cuadro)monalisa;
			e.setPintor((JOptionPane.showInputDialog("Pintor ")));
		}
		
	
		
		System.out.println("monalisa");
		System.out.println(monalisa);
		
		System.out.println(" ");

	case 4:
		Coche maserati = new Coche();
		
		maserati.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		maserati.setOrigen((JOptionPane.showInputDialog("Origen ")));
		maserati.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		if(maserati instanceof Coche) {
			Coche f =(Coche)maserati;
			f.setModelo((JOptionPane.showInputDialog("Modelo ")));
			
		}
		
		
	
		System.out.println("maserati");
		System.out.println(maserati);
		
		System.out.println(" ");

			

		
	}
	
}

}