package SeleniumPrep;

import java.util.Arrays;

public class Q37_DupsInArry_WO_Collections {

	public static void main(String[] args) {
		int[] arry = { 2, 23, 2, 4, 56, 13, 24, 11, 1,2, 4,11 };
		maxOccuirngIntInAnArray(arry);
	}
	
	//Method Max Occcuring Integer in an array without collections
	
	static void maxOccuirngIntInAnArray(int[] numbers) {
		
		//Bubble Sort
		int temp;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		// 2 2 2 4 4
		
		//After sorting
		int numDup = 0, dupCount = 0;
		int previous = Integer.MIN_VALUE;
		for (int i=0; i < numbers.length; ++i) {
		    if (numbers[i] == previous) {
		            ++dupCount;
		            if (dupCount == 1) {
		                System.out.print(numbers[i]+" ");
		                numDup++;
		            }
		    }
		    else {
		        previous = numbers[i];
		        dupCount=0;
		    }
		}
		System.out.println("\nNumber of duplicates values: " + numDup);
	}
}
