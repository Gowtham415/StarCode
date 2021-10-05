package SeleniumPrep;

import java.util.HashMap;
import java.util.Map;

public class Q46_DaysOfWeek {

	public static void main(String[] args) {
		System.out.println(dayOfWeek("Sun", 21));

	}
	
	
	public static String dayOfWeek(String s, int k) {
		String[] days= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		Map<String,Integer> daysOfWeek =new HashMap<>();
		daysOfWeek.put("Sun",0);
		daysOfWeek.put("Mon",1);
		daysOfWeek.put("Tue",2);
		daysOfWeek.put("Wed",3);
		daysOfWeek.put("Thu",4);
		daysOfWeek.put("Fri",5);
		daysOfWeek.put("Sat",6);
		
		return days[(daysOfWeek.get(s)+k)%7];
	}

}
