package DatesAndCalendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	private static final String DateUtil = null;

	public static void main(String[] args) {
		
		String date ="29/01/2020";
		SimpleDateFormat format = new SimpleDateFormat("dd//mm/yyyy");
		
		Calendar cal = Calendar.getInstance();
		Date date1;
		try {
			 date1= format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	//	date1.
		
		//System.out.println(cal.get(Calendar.DATE));

	}

}
