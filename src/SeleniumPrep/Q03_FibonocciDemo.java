package SeleniumPrep;

public class Q03_FibonocciDemo {
	public static void main(String[] args) {
		oneToN(10);
		System.out.println();
		System.out.println(fibo2(3));
	}

	// Fibonocci series below 10.
	public static void oneToN(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");
		while ((a + b) < n) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

	// Nth number in the fibonocci series
	public static int fibo2(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	// Fobonocci Series using Recursion

//	public static int fibo3(int n) {
//		return fibo3();
//
//	}

}