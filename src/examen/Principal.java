package examen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	private static List<Jugador> jugadores = new ArrayList<Jugador>();
	private static List<Jugada> jugadas = new ArrayList<Jugada>();

	public static void main(String[] args) {
		inicializaJugadores();
		inicializaJugadas();
		
		
		String titulo = FicheroPropiedades.getProperty("TITULO");
		System.out.println("Bienvenido a la " + titulo);
		
		
		mostrarMenuJugadas();
		
		
		try {
			juego ();
		} catch (TiradaAl100FallidaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		podium();
	}

	
	private static void podium() {
		boolean seHanHechoIntercambios;
		// Ordeno por la burbuja
		do {
			seHanHechoIntercambios = false;

			for (int i = 0; i < jugadores.size() - 1; i++) {
				if (jugadores.get(i).getPuntuacion() < jugadores.get(i+1).getPuntuacion()) {
					Jugador aux = jugadores.get(i+1);
					jugadores.set(i+1, jugadores.get(i));
					jugadores.set(i, aux);
					seHanHechoIntercambios = true;
				}
			}

		} while (seHanHechoIntercambios == true);
		
		// Muestro los tres primeros:
		System.out.println("\n\nLos ganadores son:");
		for (int i = 0; i < 3; i++) {
			System.out.println(jugadores.get(i).toString());
		}
	}
	
	
	
	private static void juego () throws TiradaAl100FallidaException {
		// Recorrido 10 veces sobre los turnos
		for (int i = 0; i < 10; i++) {
			for (Jugador jugador : jugadores) {
				// Para cada jugador y turno, hay tres dardos
				for (int dardo = 0; dardo < 3; dardo++) {
					System.out.println("\nJuega el jugador: " + jugador.getNombre() + " con dardo " + (dardo + 1));
					// Mostramos menú y se elige jugada;
					int idJugadaElegida = mostrarMenuJugadas();
					
					// Una vez elegida la jugada se busca en la lista de jugadas, necesitamos
					// su puntuación y su probabilidad
					Jugada jugadaElegidaPorJugador = jugadas.get(idJugadaElegida-1);
					
					int numAzar = (int) Math.round(Math.random() * 100);
					
					// Con el jugador y la jugada elegida compruebo si hay acierto o no
					if (numAzar <= idJugadaElegida) {
						// El jugador acierta
						jugador.setPuntuacion(jugador.getPuntuacion() + jugadaElegidaPorJugador.getPuntuacion() );
						System.out.println("\tBiennnnn!!!, has acertado, tu puntuación ahora es: " +
								jugador.getPuntuacion());
					}
					else {
						// El jugador falla
						System.out.println("\tOOOOOOOhhhhhh, has fallado");
						if (jugadaElegidaPorJugador.getId() == 22) {
							throw new TiradaAl100FallidaException("Ibas al 100 y te has quedado sin nada");
							}
						}
					}
				}
			}
		}
	
	
	private static int mostrarMenuJugadas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t ");
		System.out.println("\t jugadas Posibles");
		
		for (Jugada jugada : jugadas) {
			
			System.out.println( "\t"+jugada.getId() +"- " + jugada.getDescripcion());

		}
		System.out.println("Elige una jugada por su id: ");
		
		return sc.nextInt();
		//return (int) Math.round(Math.random() * (22-1) + 1);
	}
	
	private static void inicializaJugadores() {
		for(int i=0; i < 4; i++) {
			jugadores.add(new Jugador("Jugador"+i,0));
		}	
	}
	
	private static void inicializaJugadas() {
		for(int i=0; i < 20; i++) {
			jugadas.add(new Jugada(i+1,"Jugada " + (i+1) +" Puntos ",  i+1, (int) Math.round(Math.random() * (90 - 10) + 10)));	
		}
		jugadas.add(new Jugada(21,"Jugada de 50 puntos " , 50 , (int) Math.round(Math.random() * (90 - 10) + 10)));	
		jugadas.add(new Jugada(22,"Jugada de 100 puntos " , 100,  (int) Math.round(Math.random() * (90 - 10) + 10)));	
	}
	
}
