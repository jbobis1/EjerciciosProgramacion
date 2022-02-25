package capitulo06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Ejercicio04 {


	
		private static Properties propiedades = null;
	
		public Ejercicio04 () {
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
			
			String usuario = Ejercicio04.getProperty("USUARIO");
			int password2 = Ejercicio04.getIntProperty("PASSWORD");
			Float id3 = Ejercicio04.getFloatProperty("ID_USUARIO");
			boolean id4 = Ejercicio04.getBooleanPropert("FICHADO");
				
			System.out.println("Usuario leido del fichero de propiedades: " + usuario);	
			System.out.println("Password leido del fichero de propiedades: " + password2);
			System.out.println("Id de usuario leido del fichero de propiedades: " + id3);
			System.out.println("Fichado: " + id4);
			

		}
	
}
