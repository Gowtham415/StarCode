package SeleniumPrep;

public class Q5_SwapTwoNumbers {
// Swap two numbers without using third variable.
	public static void main(String[] args) {
		swapTwo(65,24);
		swapTwo2(34,23);
	}
	
	public static void swapTwo(int a,int b) {
		System.out.println("Number before swapping:a="+a+",b="+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
			System.out.println("Number after swapping:a="+a+",b="+b);
	}
	public static void swapTwo2(int a,int b) {
		System.out.println("Number before swapping:a="+a+",b="+b);
		 a=a*b;
		 b=a/b;
		 a=a/b;
			System.out.println("Number after swapping:a="+a+",b="+b);
	}
}
