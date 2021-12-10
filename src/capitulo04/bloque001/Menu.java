package capitulo04.bloque001;

import javax.swing.JOptionPane;


public class Menu {
	
	private Personas arrayPersonas[] = new Personas[3];
	
	public void inicializaPersonas (){
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Intrducir una Persona");	
		System.out.println("2.- Ver las Personas Introducidas, con Todos sus Datos");
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
		
		switch(opcion) {
		case 0:
			System.out.printf("Fin");
			break;
				
		case 1:
			for (int i = 0; i < arrayPersonas.length; i++)  {
				if (arrayPersonas[i] == null) {
					
					arrayPersonas[i] = new Personas();
					
					String nombreusuario = (JOptionPane.showInputDialog("Nombre del usuario: "));
					arrayPersonas[i].setNombre(nombreusuario);
					
					String apellidousuario = (JOptionPane.showInputDialog("apellido del usuario: "));
					arrayPersonas[i].setApellidos(apellidousuario);
					
					String dniusuario = (JOptionPane.showInputDialog("Dni del usuario: "));
					arrayPersonas[i].setDni(dniusuario);
					
					String direccionusuario = (JOptionPane.showInputDialog("Direccion del usuario: "));
					arrayPersonas[i].setDireccion(direccionusuario);
					
					String telefonousuario = (JOptionPane.showInputDialog("Telefono del usuario: "));
					arrayPersonas[i].setTelefono(telefonousuario);
				}
			}
			
		case 2:
			for (int i = 0; i < arrayPersonas.length; i++) {
				System.out.println(arrayPersonas[i]);
			}
			
		default:
			System.out.printf("ERROR " );
			
		}
	}
}
