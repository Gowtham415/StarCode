package interviewprep;

import java.util.ArrayList;
import java.util.List;

public class Q24_OddSum {

	/*
	 * 24. Print the Odd sum of the the received values. Example if the received
	 * values are 4,5,7 then return values should be 4,9,16 (1+3=4, 1+3+5=9,
	 * 1+3+5+7=16).
	 * 
	 */

	public static void main(String[] args) {
		List<Integer> ol = new ArrayList<Integer>();
		ol.add(3);
		ol.add(5);
		ol.add(7);
		ol.add(3);

		getoddSum(ol).forEach(x -> System.out.println(x));
	}

	public static List<Integer> getoddSum(List<Integer> arry) {
		int sum=0;
		List<Integer> ol = new ArrayList<Integer>();
		for(Integer i:arry) {
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					sum+=j;
				}
			}	
			ol.add(sum);
			sum=0;
		}
		
		return ol;
	}
}
