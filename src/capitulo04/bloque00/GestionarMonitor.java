package capitulo04.bloque00;

import tutorialJava.capitulo4_OO.primerEjemploPersona.Persona;

public class GestionarMonitor {


		public static void main(String[] args) {
			// Creación y manejo de una persona
			Monitor Monitor1 = new Monitor(154, "Hombre", 44, true);

			Monitor Monitor2 = new Monitor(178, "Mujer", 24, true);		
			
			System.out.println(Monitor1.toString() + "\n" + Monitor2.toString());
			
		}
		
	}

