package SeleniumPrep;

public class Q3_FibonocciDemo{
	public static void main(String[] args) {
		oneToN(10);
		System.out.println();
		System.out.println(fibo2(5));
	}
	// Fibonocci series below 10.
	public static void oneToN(int n) {
		int a =0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b+" ");
		while((a+b)<n) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	// Nth number in the fibonocci series
	public static int fibo2(int n) {
		int a =0;
		int b =1;
		int sum=0;
		for(int i=2;i<n;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}
}