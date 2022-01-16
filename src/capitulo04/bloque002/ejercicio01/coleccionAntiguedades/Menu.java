package capitulo04.bloque002.ejercicio01.coleccionAntiguedades;

import javax.swing.JOptionPane;

public class Menu {
	

	public static void main(String[] args) {
	System.out.println("Menu:");
	System.out.println("0.- Salir");
	System.out.println("1.- joyas");	
	System.out.println("2.- libro ");
	System.out.println("3.- coche");	
	System.out.println("4.- cuadro ");
	
	
	int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
	
	switch(opcion) {
	case 0:
		System.out.printf("Fin");
		break;
		
	case 1:
		Joyas collar = new Joyas();
		
		collar.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		collar.setMateral((JOptionPane.showInputDialog("Material ")));
		collar.setOrigen((JOptionPane.showInputDialog("Origen ")));
		collar.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		System.out.println("collar");
		System.out.println(collar);
		
		System.out.println(" ");

			
	case 2:
		Libro mkl = new Libro();
		
		mkl.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		mkl.setAutor((JOptionPane.showInputDialog("Autor ")));
		mkl.setTitulo((JOptionPane.showInputDialog("Titulo ")));
		mkl.setOrigen((JOptionPane.showInputDialog("Origen ")));
		mkl.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		System.out.println("mkl");
		System.out.println(mkl);
		
		System.out.println(" ");

	case 3:
		Cuadro monalisa = new Cuadro();
		
		monalisa.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		monalisa.setPintor((JOptionPane.showInputDialog("Pintor ")));
		monalisa.setOrigen((JOptionPane.showInputDialog("Origen ")));
		monalisa.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		System.out.println("monalisa");
		System.out.println(monalisa);
		
		System.out.println(" ");

	case 4:
		Coche maserati = new Coche();
		
		maserati.setFecha_fabricacion((JOptionPane.showInputDialog("Fecha Fabricacion ")));
		maserati.setModelo((JOptionPane.showInputDialog("Modelo ")));
		maserati.setOrigen((JOptionPane.showInputDialog("Origen ")));
		maserati.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio ")));
		
		System.out.println("maserati");
		System.out.println(maserati);
		
		System.out.println(" ");

			

		
	}
	
}

}