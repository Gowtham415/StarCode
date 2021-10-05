package SeleniumPrep;

import java.util.stream.Stream;

public class Q36_NearestPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1441));
		System.out.println(nearestPalindrome(126));
		System.out.println(reverseOfNumber(143));
		System.out.println(isArmstrong(153));

	}

	public static int nearestPalindrome(int n) {
		int lowerBound;
		int UpperBound;
		lowerBound = Stream.iterate(n,s->s-1).filter(num->isPalindrome(num)).findFirst().get();
		UpperBound = Stream.iterate(n,s->s+1).filter(num->isPalindrome(num)).findFirst().get();
		return Math.abs(n-lowerBound)>Math.abs(n-UpperBound)?lowerBound:UpperBound;
	}
	
	// To check the nearest palindrome of a given number

		public static int nearestpalindrome(int n) {
			int lowerBound;
			int UpperBound;
			for (int i = n;; i--) {
				if (isPalindrome(i)) {
					lowerBound = i;
					break;
				}
			}
			for (int i = n;; i++) {
				if (isPalindrome(i)) {
					UpperBound = i;
					break;
				}
			}

			if (Math.abs(n - lowerBound) > Math.abs(UpperBound - n)) {
				return UpperBound;
			} else if (Math.abs(n - lowerBound) < Math.abs(UpperBound - n)) {
				return lowerBound;
			} else {
				return UpperBound;
			}
		}


// To check if a number is a palindrome or not.	
	public static boolean isPalindrome(int n) {
		int temp = n;
		int sum = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		return (sum == temp);	
	}

	// Reverse of a number

	public static int reverseOfNumber(int n) {
		int sum = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		return sum;
	}

	// Armstrong number or not

	public static boolean isArmstrong(int n) {
		int temp =n;
		int sum = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem*rem*rem;
			n=n/10;
		}
		return (sum==temp);
	}


}
