package JavaPractice_Geeks;

import java.util.Scanner;

public class RotatingElementsinArrays {

	public static void main(String[] args) {
		int[] arry= {1,45,64,67,88,32};
//		rotateArrayByN(arry,2);
		rotateArrayByN2(arry,3);
		
	}
	
	
	// O(n3)
	
	static void rotateArrayByN(int[] arry,int n) {
		int[] tempArry= new int[n];
		for(int i=0;i<tempArry.length;i++) {
			tempArry[i]=arry[i];
		}
		
		for(int i=0;i<arry.length-n;i++) {
			arry[i]=arry[i+n];
		}
		
		for(int i=0;i<=n;i++) {
			arry[arry.length-n]=tempArry[i];
			n--;
		}
		
		for(int a:arry) {
			System.out.print(a+" ");
		}
	}
	
	// O(n*k)
	
	static void rotateArrayByN2(int[] arry,int n) {
		for(int i=0;i<n;i++) {
			int temp=arry[0];
			for(int j=0;j<arry.length-1;j++) {
				arry[j]=arry[j+1];		
			}
			arry[arry.length-1]=temp;
		}
		for(int a:arry) {
			System.out.print(a+" ");
		}
	}

}
