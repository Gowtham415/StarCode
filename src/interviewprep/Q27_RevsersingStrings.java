package interviewprep;

import java.util.stream.Stream;

public class Q27_RevsersingStrings {

	public static void main(String[] args) {
		reverseofString1("gowtham");
		reverseofString2("gowtham");
		reverseofString3("gowtham");
		reverseofString4("gowtham");
	}
	
	// Logic  1 using + operator
	
	static void reverseofString1(String str) {
		int len = str.length();
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	// Logic 2 using Char Array
	
	static void reverseofString2(String str) {
		char[] ch1= str.toCharArray();
		int len = ch1.length;
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev=rev+ch1[i];
		}
		System.out.println(rev);
	}
	
	// Logic 3 using StringBuffer reverse method
	static void reverseofString3(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse());
	}
	
	// Logic 4 using Streams reverse method
	static void reverseofString4(String str) {
		int len = str.length();
		Stream.iterate(len-1, x-> x-1).limit(len).forEach(x -> System.out.print(str.charAt(x)));
	}


}
