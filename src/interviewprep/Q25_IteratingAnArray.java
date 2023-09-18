package interviewprep;

public class Q25_IteratingAnArray {
//Different ways to iterate through an Array
	public static void main(String[] args) {

		int arryEle[] = { 1, 32, 545, 245, 5, 368, 356, 578, 68 };

		int len = arryEle.length;
		// For loop
		for (int i = 0; i <= len - 1; i++) {
			System.out.print(arryEle[i] + " ");
		}

		// 2nd - For each
		System.out.println();
		for (Integer i : arryEle) {
			System.out.print(i + " ");
		}
		
		//3rd - While loop
		System.out.println();
		int n=0;
		while(n<len) {
			System.out.print(arryEle[n]+" ");
			n++;
		}
		
		//4th - Do-While
		System.out.println();
		int k=0;
		do {
			System.out.print(arryEle[k]+" ");
			k++;
		}while(k<len);
		
	}

}
