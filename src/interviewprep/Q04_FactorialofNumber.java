package interviewprep;

import java.util.stream.Stream;

public class Q04_FactorialofNumber {

	public static void main(String[] args) {
		System.out.println(factorialDemo(5));
		System.out.println(factorialDemo2(7));
		System.out.println(factorialDemo3(7));
	}

	public static int factorialDemo(int n) {
		int fact = 1;
		while (n > 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

	public static int factorialDemo2(int n) {
		if (n == 0)
			return 1;
		return n * factorialDemo2(n - 1);
	}

	public static int factorialDemo3(int n) {
		return Stream.iterate(n, x -> x - 1).limit(n).reduce(1,(x, y) -> (x * y));
	}
}
