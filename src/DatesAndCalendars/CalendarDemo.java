package DatesAndCalendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date1 = new Date();
		System.out.println(sdf.format(date1));
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 15);	
		String newDate = sdf.format(cal.getTime());
		System.out.println(newDate);
		
		// From string to Date
		String date ="29/01/2020";
		try {
			Date newDate1= sdf.parse(date);
			System.out.println(sdf.format(newDate1));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		//Adding a some days to  a given date in String
		String date3= "29/03/2020";
		Date dateEle3 = null;
		try {
			dateEle3 = sdf.parse(date3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(dateEle3);
		cal2.add(Calendar.DATE, 23);
		System.out.println(sdf.format(cal2.getTime()));
		
		//Comparing Two dates
		Date date10 = null;
		Date date11 = null;
		try {
			 date10 = sdf.parse("02/01/2019");
			 date11 = sdf.parse("29/01/2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date10.after(date11));
	}

}
