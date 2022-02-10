package capitulo05.bloque08;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {

		HashMap<String,Articulo> hm = new HashMap<String,Articulo>();


		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Lista de Articulos");
		System.out.println("2.- Crear nuevo Articulos");
		System.out.println("3.- Eliminar un Articulos");
		System.out.println("4.- Actualizar un Articulos");

	
		String str = JOptionPane.showInputDialog("Introduzca la opcion: ");
		int opcion = Integer.parseInt(str);
		
		do {	
			str = JOptionPane.showInputDialog("Introduzca la opcion: ");
			opcion = Integer.parseInt(str);
			switch(opcion) {
			
			case 0:
				System.out.printf("Fin");
				break;		
			
			case 1:
				MostrarArticulos(hm);
				break;
				
			case 2:
				NuevoArticulos(hm);
				break;
				
			
			case 3:
				EliminarArticulos(hm);
				break;
				
				
			case 4:
				ActualizarArticulos(hm);
				break;
				
			default:
				System.out.printf("ERROR " );
				break;
			}	
		
		}while (opcion!=0);
	}
	
	private static void MostrarArticulos(HashMap<String,Articulo> hm) {
		// recorremos el array para ya mostrarlo
	
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}	 
    }
	
	private static void NuevoArticulos(HashMap <String,Articulo> hm) {
	
		Articulo a = new Articulo();
		
		String codigo = JOptionPane.showInputDialog("Código del artículo: ");	
		a.setNumBarras(codigo);
		hm.put(a.getNumBarras(), a);
		
		String Estante = JOptionPane.showInputDialog("Código del Estante: ");	
		a.setNumEstante(Estante);
		hm.put(a.getNumEstante(), a);
		
		String Unidad = JOptionPane.showInputDialog("Código del Estante: ");	
		a.setCantidadUnidad(Unidad);
		hm.put(a.getCantidadUnidad(), a);

    }
	
	private static void EliminarArticulos(HashMap<String,Articulo> hm) {
	
		String codigo = JOptionPane.showInputDialog("Introduzca la opcion a elminar: ");	
		hm.remove(codigo);
			
    }
	
	private static void ActualizarArticulos(HashMap <String,Articulo>hm) {



		hm.get(a.getNumBarras());
		hm.get(a.getNumEstante());
		hm.get(a.getNumEstante());
		
		String codigo = JOptionPane.showInputDialog("Código del artículo: ");			
		a.setNumBarras(codigo);
		hm.put(a.getNumBarras(), a);
		
		String Estante = JOptionPane.showInputDialog("Código del Estante: ");	
		a.setNumEstante(Estante);
		hm.put(a.getNumEstante(), a);
		
		String Unidad = JOptionPane.showInputDialog("Código del unidda: ");	
		a.setCantidadUnidad(Unidad);
		hm.put(a.getCantidadUnidad(), a);
	 	
    }	
}
