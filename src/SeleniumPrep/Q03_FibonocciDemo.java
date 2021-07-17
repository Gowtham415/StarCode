package SeleniumPrep;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q03_FibonocciDemo {
	public static void main(String[] args) {
		oneToN(10);
		System.out.println();
		System.out.println(fibo2(3));
		System.out.println(fibo3(5));
		fiboWithprime(100);
		
	}

	// Fibonocci series below 10.
	public static void oneToN(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");
		while ((c=(a + b)) <= n) {
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

	// Nth number in the fibonocci series
	public static int fibo2(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	// Fobonocci Series using Recursion

	public static int fibo3(int n) {
		if(n<0) {
			return -1;
		}else if(n==1 || n==2) {
			return n-1;
		}else {
			return fibo3(n-1)+fibo3(n-2);
		}
	}
	
	
	//Fibonocci Numbers which are prime
	public static void fiboWithprime(int n) {
		int a=0;
		int b=1;
		int c=0;
		while((c=(a+b))<n) {
			if(isPrime(c)) {
				System.out.print(c+" ");
			}
			a=b;
			b=c;
		}
	}

	private static boolean isPrime(int c) {
		if(c<2)
			return false;
		return Stream.iterate(2,x->x+1).limit(c/2).filter(i->c%i==0).findAny().isPresent()?false:true;
	}

}