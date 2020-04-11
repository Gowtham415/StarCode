package SeleniumPrep;

import java.util.Arrays;

public class Q37_DupsInArry_WO_Collections {

	public static void main(String[] args) {
		int[] arry = { 2, 23, 2, 4, 56, 13, 24, 11, 1,2, 4 };
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
		
		
		//After sorting
		int numDup = 0, dupCount = 0;
		int previous = -1;
		for (int i=0; i < numbers.length; ++i) {
		    if (numbers[i] == previous) {
		        ++numDup;// This variable is required because if same number is repeated third time it will not be printed	
		        if (numDup == 1) {
		            ++dupCount;
		            if (dupCount == 1) {
		                System.out.print(numbers[i]);
		            }
		            else {
		                System.out.print(", " + numbers[i]);
		            }
		        }
		    }
		    else {
		        previous = numbers[i];
		        numDup = 0;
		    }
		}

		System.out.println("\nNumber of duplicates values: " + dupCount);
	}
}
