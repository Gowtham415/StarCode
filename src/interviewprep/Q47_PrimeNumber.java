package interviewprep;

import java.util.stream.Stream;

public class Q47_PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeWithStreams(19));
		fibonocciPrimeNumbers(100);
	}

	private static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrimeWithStreams(int n){
		return Stream.iterate(2,i->i+1).limit(n/2).filter(i->n%i==0).findAny().isPresent()?false:true;
	}
	
	
	//Fibonocci Numbers which are prime below n
	
	private static void fibonocciPrimeNumbers(int n) {
		int a=0;
		int b=1;
		int c=0;
		while((c=a+b)<100){
			if(isPrime(c)) {
				System.out.println(c+" ");
			}
			
			a=b;
			b=c;
		}
		
	}
	

}
