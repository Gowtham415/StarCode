package Basic;

public class NthHighestNumber {

	public static void main(String[] args) {
		int[] array = {0,-1,2,-2,1};
		System.out.println(getNthHighestNumber(array,2));

	}
	
	static int getNthHighestNumber(int[] intArray, int n) {
		int temp=1;
		int len = intArray.length;
		for(int i=0;i<len-1;i++) {
			if(intArray[i]>intArray[i+1]) {
				temp = intArray[i];
				intArray[i]=intArray[i+1];
				intArray[i+1]=temp;
			}
		}
		
		return intArray[len-n];
	}
}
