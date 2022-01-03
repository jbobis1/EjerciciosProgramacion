package capitulo04.bloque02.ejercicio02;

import javax.swing.JOptionPane;



public class Menu {
	private Texto arraytexto[] = new Texto[3];

	public void inicializaPersonas (){
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Agregar una linea de textos");	
		System.out.println("2.- Insertar una línea en cualquier posición del texto ");
		System.out.println("3.- Editar una línea");	
		System.out.println("4.- Borrar una línea ");
		System.out.println("5.- Cortar un conjunto de línea");
		System.out.println("6.- Pegar un conjunto de líneas cortadas en una determinada posición ");
		System.out.println("7.- Imprimir lista ");
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
		
		

		
		switch(opcion) {
		case 0:
			System.out.printf("Fin");
			break;
				
		case 1:
			 Texto arraytexto1[] = new Texto[4];
			for (int i = 0; i < arraytexto.length; i++)  {
				if(arraytexto[3] != null) {
					Texto text = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
					arraytexto[3]=text;
					
				}
				System.out.println(arraytexto[i]);
			}

				
		case 2:
			int linea = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un linea: "));
			
			for (int i = 0; i < arraytexto.length; i++)  {
				if(arraytexto[i] != linea) {
					arraytexto[i+1]=arraytexto[i];
				}
				System.out.println(arraytexto);
			}
			
			
			
			
		case 3:
			int linea1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un linea: "));
			
			for (int i = 0; i < arraytexto.length; i++)  {
				if(arraytexto[i] == linea1) {
					Texto nueva = JOptionPane.showInputDialog("Introduzca un linea: ");
					arraytexto[i]=nueva;
				}
				System.out.println(arraytexto);
			}
		
		case 4:
		int linea2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un linea: "));
			
			for (int i = 0; i < arraytexto.length; i++)  {
				if(arraytexto[i] == linea2) {
					arraytexto[i+1]=arraytexto[i];
				}
				System.out.println(arraytexto);
			}
		case 5:
	
			
		case 6:
			
			

		case 7:
				
			for (int i = 0; i < arraytexto.length; i++) {
				System.out.println(arraytexto[i]);
			}
			
		default:
			System.out.printf("ERROR " );
			
		}
	}
}

