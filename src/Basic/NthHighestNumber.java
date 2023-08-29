package Basic;

import java.util.Arrays;

public class NthHighestNumber {

	public static void main(String[] args) {
		int[] array = {0,-1,2,-2,1,3,5,7,8,-5};
		System.out.println(getNthHighestNumber(array,5));

	}
	
	static int getNthHighestNumber(int[] intArray, int n) {
		int temp=1;
		int len = intArray.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-i-1;j++){
				if(intArray[j]>intArray[j+1]) {
					temp = intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
				}
			}

		}

		System.out.println(Arrays.toString(intArray));
		
		return intArray[len-1-n];
	}
}
