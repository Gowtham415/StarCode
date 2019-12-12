package JavaPractice_Geeks;

public class KthHighestElement {

	public static void main(String[] args) {
		int arr[] = {12,32,11,3,4,67,78,5};
		kthSmallest(arr,5);
	}
	
	//O(n*n)
	static void kthSmallest(int[] arry,int k) {
		int temp=0;
		for(int j=0;j<arry.length-1;j++) {
			for(int i=0;i<arry.length-1;i++) {
				if(arry[i]>arry[i+1]) {
					temp=arry[i];
					arry[i]=arry[i+1];
					arry[i+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Kth Samllest Element is :"+arry[k-1]);
	}

	//O(n)
}
