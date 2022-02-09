package capitulo05.bloque08;

import java.util.HashMap;

import javax.swing.JOptionPane;



public class Menu {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		// Inserción de datos en un HashMap general
		hm.put("1", new Articulo ("11111111", "54884", "8754"));
		hm.put("2", new Articulo ("22222222", "9894", "8788"));
		hm.put("3", new Articulo ("33333333", "944", "44"));
		hm.put("4", new Articulo ("44444444", "594591", "999"));
		hm.put("5", new Articulo ("55555555", "588", "599"));
		
		
		
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Lista de Articulos");
		System.out.println("2.- Crear nuevo Articulos");
		System.out.println("3.- Eliminar un Articulos");
		System.out.println("4.- Actualizar un Articulos");


			
		String str = JOptionPane.showInputDialog("Introduzca la opcion: ");
		int opcion = Integer.parseInt(str);
		

		
		switch(opcion) {
		case 0:
			System.out.printf("Fin");
			break;
			
		
		case 1:
			MostrarArticulos();
			break;
			
		case 2:
			NuevoArticulos();
			break;
			
		
		case 3:
			EliminarArticulos();
			break;
			
			
		case 4:
			ActualizarArticulos();
			break;
			
		default:
			System.out.printf("ERROR " );
			
			
		}
	}
	
	private static void MostrarArticulos(Object hm) {
		// recorremos el array para ya mostrarlo

		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}	 
    }
	
	
	private static void NuevoArticulos(Object hm) {
	
	 	
    }
	
	private static void EliminarArticulos(Object hm) {
	
	 	
    }
	
	private static void ActualizarArticulos(Object hm) {
	
	 	
    }
	
	
}
