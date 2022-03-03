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
		System.out.println("fecha por tipo string y pasado a date: " + date);
		
		Calendar fechaCalendar = new GregorianCalendar(1918, Calendar.APRIL, 01, 22, 05, 23);
		System.out.println(fechaCalendar.get(Calendar.YEAR));
		System.out.println(fechaCalendar.get(Calendar.MONTH));
		System.out.println(fechaCalendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println(fechaCalendar.get(Calendar.HOUR_OF_DAY));


		
		Calendar fechan = new GregorianCalendar();
		fechan.add(Calendar.DAY_OF_MONTH, 3);
		System.out.println("suma 3 días"+fechan);
		
		Calendar fechan1 = new GregorianCalendar();
		fechan1.add(Calendar.DAY_OF_MONTH, -14);
		System.out.println("suma 3 días"+fechan1);
		
		
		Calendar fechan2 = new GregorianCalendar();
		fechan2.add(Calendar.DAY_OF_YEAR, 300);
		System.out.println("suma 3 días"+fechan2);
		
		Calendar fechan3 = new GregorianCalendar();
		fechan3.add(Calendar.YEAR, -4);
		System.out.println("suma 3 días"+fechan3);
		
		
		SimpleDateFormat  sdf2 = new SimpleDateFormat("yyyy");
		
			Date anos = sdf.parse("yyyy");
			sdf2.format(anos);
			System.out.println("anos:" + anos);
			
			
			
			Date mes = sdf.parse("MM");
			sdf2.format(mes);
			System.out.println("mes:" + mes);
			
			
			
			Date dia = sdf.parse("dd" );
			sdf2.format(dia);
			System.out.println("dia:" + dia);
			
			
			
			Date hora = sdf.parse("HH:mm:ss");
			sdf2.format(hora);
			System.out.println("hora: " + hora);
	}

}
