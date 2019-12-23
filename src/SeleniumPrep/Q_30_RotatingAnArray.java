package SeleniumPrep;

public class Q_30_RotatingAnArray {
	
	public static void main(String[] args) {
		
		int[] tempArry= {0,1,2,3,4,5,6,7,8,9};
		tempArry= leftRotateArray(tempArry,3);
		for(int i:tempArry) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] tempArry2= {0,1,2,3,4,5,6,7,8,9};
		tempArry2= rightRotateArray(tempArry2,3);
		for(int i:tempArry2) {
			System.out.print(i+" ");
		}
	}

	
	//Left Rotating Array by n elements
	static int[] leftRotateArray(int[] arry,int n) {
		int len = arry.length;
		int[] tempArry= new int[n];
		for(int i=0;i<n;i++) {
			tempArry[i]=arry[i];
		}	
		for(int i=0;i<len-n;i++) {
			arry[i]=arry[i+n];
		}
		for(int i=0;i<n;i++) {
			arry[(len-n)+i]=tempArry[i];
		}	
		return arry;
	}
	
	
	//Right Rotating Array by n elements
		static int[] rightRotateArray(int[] arry,int n) {
			int len = arry.length;
			int[] tempArry= new int[n];
			for(int i=0;i<n;i++) {
				tempArry[i]=arry[len-(n-i)];
			}	
			for(int i=0;i<len-n;i++) {
				arry[(len-1)-i]=arry[(len-1)-(n+i)];	
			}
			for(int i=0;i<n;i++) {
				arry[i]=tempArry[i];
			}	
			return arry;
		}
	
}
