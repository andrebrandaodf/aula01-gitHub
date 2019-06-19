package udemyJava;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class Calendario {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = (Date) Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int min = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH); 
		
		System.out.println("Minutos: " + min);
		System.out.println("Mês: " + mes);

		
	}

}
