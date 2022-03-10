package pruebaexamen.nuevo;

import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia, mes , anno;
		Calendar hoy = Calendar.getInstance();
		dia= hoy.get(Calendar.DATE);
		mes= hoy.get(Calendar.MONDAY);
		anno= hoy.get(Calendar.YEAR);
		System.out.println("dia " + dia + " mes: "+ mes + " año: " + anno);

		
	}
}

