package interviewprep;

//To find largest two numbers of an Array
public class Q07_FindTheLargestTwoNumberOfAnArray {

	public static void main(String[] args) {
		int arry[] = {24,45,3,56,789,78,99,34};
		largestTwo(arry);
	}
	
	public static void largestTwo(int[] arr) {
//		int firstlargest= arr[0];
//		int secondLargest = arr[1];

		int temp=0;
	// Bubble sort-- O(n2)	
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}	
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("First Highest number is "+arr[arr.length-1]);
		System.out.println("Second highest number is "+arr[arr.length-2]);
	}



}
