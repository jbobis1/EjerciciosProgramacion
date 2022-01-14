package capitulo04.bloque002.ejercicio01.articulosComestibles;

import javax.swing.JOptionPane;

import capitulo04.bloque002.ejercicio01.coleccionAntiguedades.Joyas;

public class Menu {
	
public void menu (){
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
		Joyas.set(JOptionPane.showInputDialog("Codigo DEL articulo "));

			
	case 2:	
		Libro fisica = new Libro();
		Libro.set
	case 3:
			
	case 4:


		
	default:
		System.out.printf("ERROR " );
		
	}
	
}

}