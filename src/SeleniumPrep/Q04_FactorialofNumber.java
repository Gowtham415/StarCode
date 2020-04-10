package SeleniumPrep;

public class Q04_FactorialofNumber {

	public static void main(String[] args) {
		System.out.println(factorialDemo(5));
		System.out.println(factorialDemo2(7));

	}
	
	
	public static int factorialDemo(int n) {
		int fact = 1;
		while(n>0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
	
	public static int factorialDemo2(int n) {
		int fact=1;
		if(n==0)
			return 1;
		fact = n * factorialDemo2(n-1);
		return fact;
	}
	

}
