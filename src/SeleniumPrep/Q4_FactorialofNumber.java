package SeleniumPrep;

public class Q4_FactorialofNumber {

	public static void main(String[] args) {
		System.out.println(factorialDemo(5));
		System.out.println(factorialDemo2(7));

	}
	
	
	public static int factorialDemo(int n) {
		int sum =1;
		while(n>=1) {
			sum = sum * n;
			n--;
		}
		return sum;
	}
	
	public static int factorialDemo2(int n) {
		int fact=1;
		if(n==0)
			return 1;
		fact = n * factorialDemo2(n-1);
		return fact;
	}
	

}
