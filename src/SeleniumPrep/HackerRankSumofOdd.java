package SeleniumPrep;

import java.util.ArrayList;
import java.util.List;

public class HackerRankSumofOdd {
	
	// Sum of Odd -------Lack of Clarity in question

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=1;i<20;i++){
			intList.add(i);
		}	
		sum_To_Odd(intList);
	}
	
	public static void sum_To_Odd(List<Integer> arr) {
		int[] arry = new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			arry[i]=arr.get(i);
		}
		
		for(int i=0; i<arry.length;i++) {
			if(arry[i]/2==1) {
				
			}
		}
	}
}
