package interviewprep;

import java.util.stream.Stream;

public class Q21_PowerofNumber {
///21. Calculate power of a number using a while loop
	public static void main(String[] args) {

		System.out.println(powerofNumber(3, 4));
		System.out.println(powerOfNumFor(3, 4));
		System.out.println(powerOfNumFor(3, 4));
	}

	// Using while loop
	static int powerofNumber(int base, int exponent) {
		int result = 1;
		while (exponent > 0) {
			result = result * base;
			exponent--;
		}
		return result;
	}

	// using forloop
	static int powerOfNumFor(int base, int expo) {
		int result = 1;

		for (int i = expo; i > 0; i--) {
			result *= base;
		}
		return result;
	}
	
	// using Streams
		static int powerOfNumStreams(int base, int expo) {
			return Stream.iterate(expo,x->x-1).reduce(1, (x,y)-> x*base);
		}
}
