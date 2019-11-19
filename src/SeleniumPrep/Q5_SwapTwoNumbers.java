package SeleniumPrep;

public class Q5_SwapTwoNumbers {
// Swap two numbers without using third variable.
	public static void main(String[] args) {
		swapTwo(65, 24);
		swapTwo2(34, 23);
		swapTwo3(-20,-89);
		swapTwo4(10,13);
	}

	// Logic 1

	public static void swapTwo(int a, int b) {
		System.out.println("Number before swapping:a=" + a + ",b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Number after swapping:a=" + a + ",b=" + b);
	}

	// Logic 2
	public static void swapTwo2(int a, int b) {
		System.out.println("Number before swapping:a=" + a + ",b=" + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("Number after swapping:a=" + a + ",b=" + b);
	}

	// Logic 3

	public static void swapTwo3(int a, int b) {
		System.out.println("Number before swapping:a=" + a + ",b=" + b);
		b = a + b - (a = b);
		System.out.println("Number after swapping:a=" + a + ",b=" + b);
	}
	
	// Logic 4 using BitWise XOR

		public static void swapTwo4(int a, int b) {
			System.out.println("Number before swapping:a=" + a + ",b=" + b);
			a=a^b;
			b=a^b;
			a=a^b;
			System.out.println("Number after swapping:a=" + a + ",b=" + b);
		}

}
