package capitulo06.bloque02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class Ejercicio04 {

	public static void main(String[] args) throws ParseException {

		Date date = null;
		String patron = "yyyy-MM-dd";
		
		String fecha = (JOptionPane.showInputDialog("2012-05-11: ")) ;

		SimpleDateFormat sdf = new SimpleDateFormat(patron);
		date = sdf.parse("2012-05-11");
				
		Calendar calenda = new Calendar ("2012-05-11");
		
	}

}
