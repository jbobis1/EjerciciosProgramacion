package capitulo06.bloque02;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio05 {

	public static void main(String[] args) {
		System.out.println("Zonas Horarias: ");
		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar ahoraEnWashintong  = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		
		
		System.out.println("Hora Roma: " + ahoraEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora Washintong: " + ahoraEnWashintong.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(" ");
		System.out.println("Diferencia de Zonas Horarias: ");
		int Roma = ahoraEnRoma.get(Calendar.HOUR_OF_DAY);
		int Washintong = ahoraEnWashintong.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Diferencia horaria entre Roma y Washintong: " + (Roma - Washintong )+"h");
		
	}

}
