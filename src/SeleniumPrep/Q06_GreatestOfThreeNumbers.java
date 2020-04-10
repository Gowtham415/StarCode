package SeleniumPrep;

public class Q06_GreatestOfThreeNumbers {

	public static void main(String[] args) {
		System.out.println(greatestOfThreeNum(-997, 3676, 666));
		System.out.println(greatestOfThreeNum2(-997, 3676, 666));
	}

	static int greatestOfThreeNum(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else if (c > a && c > b) {
			return c;
		} else {
			return 0;
		}
	}

	static int greatestOfThreeNum2(int a, int b, int c) {
		int largest = a > b ? a : b;
		largest = c > largest ? c : largest;
		return largest;
	}

}
