package capitulo06.bloque02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) throws ParseException {

		String patron = "yyyy-MM-dd";
		
		String fecha = (JOptionPane.showInputDialog("19/03/1977 15:33:00")) ;

		SimpleDateFormat sdf = new SimpleDateFormat(patron);
	
		Date date = sdf.parse(fecha);
		
		Calendar fechaCalendar = new GregorianCalendar(1918, Calendar.APRIL, 01, 22, 05, 23);
		fechaCalendar.get(Calendar.YEAR);
		fechaCalendar.get(Calendar.MONTH);
		fechaCalendar.get(Calendar.WEEK_OF_MONTH);
		fechaCalendar.get(Calendar.HOUR_OF_DAY);
		
		SimpleDateFormat  sdf2 = new SimpleDateFormat("yyyy");
		
			Date años = sdf.parse("yyyy");
			sdf2.format(años);
			
			Date mes = sdf.parse("MM");
			sdf2.format(mes);
			
			Date dia = sdf.parse("dd");
			sdf2.format(dia);
			
			Date hora = sdf.parse("HH:mm:ss");
			sdf2.format(hora);
		 
	}

}
