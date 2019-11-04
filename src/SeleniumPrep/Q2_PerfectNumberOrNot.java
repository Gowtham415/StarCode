package SeleniumPrep;

public class Q2_PerfectNumberOrNot {

	public static void main(String[] args) {
		System.out.println(perfectOrNot(8128));
		listOfPerfectNumbers(10000);
	}

	public static boolean perfectOrNot(int n) {
		int sum = 0;
		if (n <= 0) {
			return false;
		}

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;//1,
			}
		}
		
		if(sum==n) {
			return true;
		}
		
		return false;
	}
	
	public static void listOfPerfectNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(perfectOrNot(i)) {
				System.out.println(i);
			}
		}
	}

}
