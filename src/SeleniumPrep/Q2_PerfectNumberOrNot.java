package SeleniumPrep;

public class Q2_PerfectNumberOrNot {

	public static void main(String[] args) {
		System.out.println(perfectOrNot(6));
		listOfPerfectNumbers(10000);
	}

	public static boolean perfectOrNot(int n) {
		
		int sum =0;
		
		if (n<=0){
			return false;
		}else if(n>0){
			for (int i=1;i<n;i++) {
				if(n%i==0) {
					sum+=i;
				}
			}
			
			if(sum==n) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	public static void listOfPerfectNumbers(int n) {
		for(int i=1;i<=n;i++) {
			if(perfectOrNot(i)) {
				System.out.println(i);
			}
		}
	}

}
