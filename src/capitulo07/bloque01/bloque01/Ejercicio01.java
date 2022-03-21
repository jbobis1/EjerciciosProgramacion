package capitulo07.bloque01.bloque01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio01 {
	
	private static String tablas[] = new String[] {"venta", "concesionario", "cliente", "coche", "fabricante"};
	private static String nombres[] = new String[] {"Eva", "Juan", "Carmen", "Pablo", "Rafa", "Pilar", "Pedro", 
			"Lola", "Casimiro", "Gertrudis", "Eustaquio", "Gerarda", "Nepomunosio", "Argimira", "Ascensio", "Baltasara", "Baudilio", "Bernabea"};
	private static String apellidos[] = new String[] {"Gonzalez", "Lopez", "Gutierrez", "Ruiz", "Jurado", "Carrasco", "Flores", 
			"Sanchez", "Bose", "Martin", "Martinez", "Santos", "Pozo", "Quijano", "Romero", "Pisano", "Cuevas", "Sanz"};
	private static String tiposEmpresas[] = new String[] {"Hermanos", "Sociedad", "Concesionario", "Coches de"};
	private static String localidades[] = new String[] {"Lucena", "Cabra", "Priego de Cordoba", "Puente Genil", "Benameji", "Palenciana","Baena","Albendin", "Moriles", "Rute", "Aguilar de la Frontera"};
	private static String fabricantes[] = new String[] {"Renault", "Citroen", "Peugeot", "Dacia", "Kia", "Hyundai", "Honda"};
	private static String colores[] = new String[] {"Blanco", "Negro", "Azul", "Rojo", "Verde", "Amarillo", "Gris"};
	private static String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	private static SimpleDateFormat sdfFechaNacimiento = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static int CONT_NOTIFICACION_INSERCION = 10;
	private static int REGISTROS_A_INSERTAR_EN_CONCESIONARIO = 20;
	private static int REGISTROS_A_INSERTAR_EN_CLIENTE = 200;
	private static int REGISTROS_A_INSERTAR_EN_COCHE = 200;
	private static boolean LOG = true;
	
	/**
	 * 
	 * @param args
	 * @throws SQLException
	 * @throws ImposibleConectarException
	 */
	
	public static void main (String args[]) throws SQLException, ImposibleConectarException {
		
		conectar ();
		Connection conn;
		conn = ConnectionManagerV2.getConexion();
		
		System.out.println("Menu:");
		System.out.println("0.- Salir");
		System.out.println("1.- Lista de usuario");
		System.out.println("2.- Crear nuevo usuario");
		System.out.println("3.- Modifica un usuario");
		System.out.println("4.- Elimina un usuario");
		
		long startTime = new Date().getTime();
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
				creacionDatosFabricantes(conn);
				break;
				
			case 3:
				ModificarArticulos(conn);
				break;
				
				
			case 4:
				EliminarArticulos(conn);
				break;							
	
			default:
				System.out.printf("ERROR " );
				break;
				
			}	
			
			long usedMillis = new Date().getTime() - startTime;
			int secs = (int) (usedMillis/1000);
			 str = JOptionPane.showInputDialog("Introduzca la opcion: ");
				opcion = Integer.parseInt(str);
				
		}while (opcion!=0);
	}
	
	/*
	 * 
	 */
	
	private static void MostrarArticulos() {
		
		try {
			// A través de la siguiente línea comprobamos si tenemos acceso al driver MySQL, si no fuera así
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los parámetros de conexión.
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "Abcdefgh.1");
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getInt (2)+ 
						" " + rs.getInt(3)); 
			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		}
		
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
			
		}
		
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		
	}
		
	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 * @throws ImposibleConectarException
	 */
	 	
	private static void creacionDatosFabricantes (Connection conn) throws SQLException, ImposibleConectarException {
		Statement s = (Statement) conn.createStatement();
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros de en la tabla fabricante");

		for (int i = 0; i < fabricantes.length; i++) {	
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Introduce un id: ");
			String id =sc1.next();
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduce un cif: ");
			String cif =sc2.next();
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Introduce un nombre: ");
			String nombre =sc3.next();
			
			String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " +
					"VALUES  (" + nextIdEnTabla(conn, "fabricante") + id + ", '" + cif + "', '" + nombre + fabricantes[i] + "')";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla fabricante");
			}
		}
		s.close();
	}
	
	/**
	 * 	
	 * @param conn
	 */
	
	private static void ModificarArticulos(Connection conn) {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		   
		// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
		// le tenemos que pasar los parámetros de conexión.
		Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "Abcdefgh.1");
	   
		
		// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
		Statement s = (Statement) conexion.createStatement(); 
		
		// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
		// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
		ResultSet rs = s.executeQuery ("select * from fabricante");			
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un codigo: ");
		String num =sc.next();

		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce un codigo: ");
		String id =sc1.next();
	

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce un codigo: ");
		String cif =sc2.next();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Introduce un codigo: ");
		String nombre =sc3.next();
		

		ResultSet rs1 = s.executeQuery("SELECT MAX(id) FROM fabricante",	"EL id es : ", 	rs.getDouble(id) , 
				"El cif es:  ", rs.getDouble(cif),
				"El nombre es el:", rs.getString(nombre));
		
	}
	
	/**
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	
	private static void EliminarArticulos(Connection conn) throws SQLException {
		
		Statement s = (Statement) conn.createStatement();

		
		if (LOG)
			System.out.println("Eliminando los registros de todas las tablas");
		
		for (String fabricante : fabricantes) {
			int registrosAfectados = s.executeUpdate("delete from tutorialjavacoches." + fabricante);
			
			if (LOG)
				System.out.println("\t" + registrosAfectados + " registros eliminados en la tabla " + fabricante);
		}
		s.close();
	}
	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	
	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		
		return maxIdEnTabla(conn, tabla) + 1;
		
	}

	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
			
		}
		
		rs.close();
		s.close();
		return max;
		
	}
	
	/**
	 * 
	 */
	
	private static Connection conexion = null;
	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	
	public static Connection getConexion () throws SQLException {
		
		// Si es la primera vez que accedemos a la conexi�n, debemos instanciarla
		if (conexion == null) {
			conectar();
			
		}
		// Compruebo si la conexi�n sigue estando activa
		while (!conexion.isValid(5)) {
			conectar();
			
		}
		
		return conexion;
	}
	
	/*
	 * 
	 * 
	 */
	
	private static void conectar () throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?autoReconnect=true&serverTimezone=Europe/Madrid&useSSL=False&allowPublicKeyRetrieval=TRUE" , "java" , "Abcdefgh.1");			   
		
		}
		
		catch (ClassNotFoundException ex) {
			
			System.out.println("Imposible acceder al driver Mysql");
			
		}
		
	}
	
}
	