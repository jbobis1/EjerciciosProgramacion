package capitulo06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ejercicio04 {

	public class EjemploFicheroPropiedades {
	
		private static Properties propiedades = null;
	
		public EjemploFicheroPropiedades () {
			super();
		}
		
		/**
		 * 
		 * @return
		 */
		private static Properties getPropiedades() {
			if (propiedades == null) {
				propiedades = new Properties();
			    
				try {
					// Una forma de leer el fichero de propiedades
	//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));
	
					// Otra forma de leer el fichero de propiedades
					File file = new File("./src/capitulo06/ejemplo.properties");
					System.out.println("Fichero encontrado: " + file.exists());
					propiedades.load(new FileReader(file));
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
			}
			return propiedades;
		}
	
		public static String getProperty(String nombrePropiedad) {
			return getPropiedades().getProperty(nombrePropiedad);
		}
	
		public static int getIntProperty (String nombrePropiedad) {
			return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
		}
	
		public static Float getFloatProperty (String nombrePropiedad) {
			return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
		}
		
		public static Boolean getBooleanPropert (String nombrePropiedad) {
			return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
		}
		
		
		public static void main (String args[]) {
			
			String usuario = EjemploFicheroPropiedades.getProperty("USUARIO");
			String password = EjemploFicheroPropiedades.getProperty("PASSWORD");
			String id = EjemploFicheroPropiedades.getProperty("ID_USUARIO");	
			
			int usuario2 = EjemploFicheroPropiedades.getIntProperty("USUARIO2");
			int password2 = EjemploFicheroPropiedades.getIntProperty("PASSWORD2");
			int id2 = EjemploFicheroPropiedades.getIntProperty("ID_USUARIO2");
			
			Float usuario3 = EjemploFicheroPropiedades.getFloatProperty("USUARIO3");
			Float password3 = EjemploFicheroPropiedades.getFloatProperty("PASSWORD3");
			Float id3 = EjemploFicheroPropiedades.getFloatProperty("ID_USUARIO3");
	
			boolean usuario4 = EjemploFicheroPropiedades.getBooleanPropert("USUARIO4");
			boolean password4 = EjemploFicheroPropiedades.getBooleanPropert("PASSWORD4");
			boolean id4 = EjemploFicheroPropiedades.getBooleanPropert("ID_USUARIO4");
				
			System.out.println("Usuario leido del fichero de propiedades: " + usuario);
			System.out.println("Password leido del fichero de propiedades: " + password);
			System.out.println("Id de usuario leido del fichero de propiedades: " + id);
			
			System.out.println("Usuario leido del fichero de propiedades: " + usuario2);
			System.out.println("Password leido del fichero de propiedades: " + password2);
			System.out.println("Id de usuario leido del fichero de propiedades: " + id2);
			
			System.out.println("Usuario leido del fichero de propiedades: " + usuario3);
			System.out.println("Password leido del fichero de propiedades: " + password3);
			System.out.println("Id de usuario leido del fichero de propiedades: " + id3);
			
			System.out.println("Usuario leido del fichero de propiedades: " + usuario4);
			System.out.println("Password leido del fichero de propiedades: " + password4);
			System.out.println("Id de usuario leido del fichero de propiedades: " + id4);
			

		}
	}
}
