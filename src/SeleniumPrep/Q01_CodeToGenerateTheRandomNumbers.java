	package SeleniumPrep;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.stream.IntStream;

public class Q01_CodeToGenerateTheRandomNumbers {	

	public static void main(String[] args) {

		//Approach 1 using Random class in JAVA.util
		Random rn = new Random();
		
		int i= rn.nextInt();
		int j= rn.nextInt(100);
		System.out.println(i+"\n"+j);
		
		Double d= rn.nextDouble()*1000;
		System.out.println(d);
		
		//Approach 2 using the Math.random()
		Double d1 = Math.random()*1000;
		System.out.println(Math.round(d1));
		
		Double d2 = getRandomDoubleBetweenRange(5, 10);
		System.out.println(d2);
		int i2 = getRandomIntBetweenRange(10, 200);
		System.out.println(i2);
	}
	
	public static double getRandomDoubleBetweenRange(double min, double max){
	    double x = (Math.random()*(max-min))+min;
	    DecimalFormat df= new DecimalFormat(".###");
	    String d3= df.format(x);
	    return Double.parseDouble(d3);
	}
	
	public static int getRandomIntBetweenRange(double min, double max){
	    double x = (Math.random()*((max-min)+1))+min;
	    return (int) Math.round(x);
	}
	
	

}
