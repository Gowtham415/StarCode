package SeleniumPrep;

public class Q08_Q09_Q010_Palindromes {

	public static void main(String[] args) {
		ReverseOfNumber(145);
		palindromeOrNot(15523);
		ArmstrongOrNot(153);
	}
	
	//Q8
	public static void ReverseOfNumber(int n) {
		
		int sum =0;
		int rem;
		
		while(n>0) {
			rem = n%10;
			sum = sum*10 + rem;
			n = n/10;
		}	
		System.out.println(sum);
	}
	
	// Q9
	public static void palindromeOrNot(int n) {
		int temp = n;
		int sum =0;
		int rem;
		
		while(n>0) {
			rem = n%10;
			sum = sum*10 + rem;
			n = n/10;
		}	
		
		if(temp==sum) {
			System.out.println(temp + " is a palindrome!");
		}else {
			System.out.println(temp+" is not a palindrome!");
		}
	}
	
	//Q10- Armstrong number is the sum of cubes of each digit in a number is equal to the number
	public static void ArmstrongOrNot(int n) {
		int temp = n;
		int sum =0;
		int rem;
		
		while(n>0) {
			rem = n%10;
			sum = sum + rem*rem*rem;
			n = n/10;
		}	
		if(temp==sum) {
			System.out.println(temp + " is a Armstrong number!");
		}else {
			System.out.println(temp+" is not a Armstrong number!");
		}
	}

}
