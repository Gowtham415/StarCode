package interviewprep;

import java.util.stream.IntStream;
import java.util.stream.Stream;


/* A perfect number is a number whose sum of divisors is equal to the number
 */

public class Q02_PerfectNumberOrNot {

	public static void main(String[] args) {
		System.out.println(perfectOrNot(6));
		listOfPerfectNumbers(10000);
		
		System.out.println(perfectOrNot2(28));
	}

	public static boolean perfectOrNot(int n) {
		
		int sum =0;
		
		if (n<=0){
			return false;
		}
		
		if(n>0){
			for (int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum+=i;
				}
			}
			return sum==n;
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
	
	public static boolean perfectOrNot2(int n) {
		return Stream.iterate(1, x -> x+1).limit(n/2).filter(x-> n%x==0).reduce(0, (x,y)-> x+y) == n ? true : false;
	}

	private static boolean isPerfect(int n){
		if(n<0)
			return false;
		int sum = IntStream.rangeClosed(1,n/2).filter(i-> n%i==0).reduce(0,(x, y)->x+y);
		return sum==n?true:false;

	}

}
