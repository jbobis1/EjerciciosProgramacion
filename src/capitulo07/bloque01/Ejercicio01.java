package capitulo07.bloque01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import javax.swing.JOptionPane;




public class Ejercicio01 {

	public static void main (String args[]) {
		
		
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Lista de usuario");
		System.out.println("2.- Crear nuevo usuario");
		System.out.println("3.- Modifica un usuario");
		System.out.println("4.- Elimina un usuario");


		String str = JOptionPane.showInputDialog("Introduzca la opcion: ");
		int opcion = Integer.parseInt(str);
		
		do {	
	
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
				EliminarArticulos();
				break;
				
				
	
			default:
				System.out.printf("ERROR " );
				break;
			}	
			 str = JOptionPane.showInputDialog("Introduzca la opcion: ");
				opcion = Integer.parseInt(str);
		}while (opcion!=0);
	}
	
	private static void MostrarArticulos() {
		for (int i = 0; i < fabricantes.length; i++) {
			System.out.println("fabricantes"+ fabricantes[i]);
		}
		
	
	 
    }
	
	private static void NuevoArticulos(Connection conn) {
		Statement s = (Statement) conn.createStatement();
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros de en la tabla fabricante");

		for (int i = 0; i < fabricantes.length; i++) {
			String cif = getDNICIFAzar();
			
			String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " +
					"VALUES  (" + nextIdEnTabla(conn, "fabricante") + ", '" + cif + "', '" + fabricantes[i] + "')";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla fabricante");
			}
		}
		s.close()
    }
	
	private static void EliminarArticulos() {
		// recorremos el array para ya mostrarlo
	 
    }
	
}
	



