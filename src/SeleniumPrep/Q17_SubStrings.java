package SeleniumPrep;

public class Q17_SubStrings {

	public static void main(String[] args) {
//		allSubStrings("Gowtham");
		isASubString("geeks","geeksforgeeks");
		allSubStrings("Oracle");
	}
	// Java program to print all substrings of a string

	private static void allSubStrings(String str) {
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				System.out.println(str.substring(i, j));
				count++;
			}
		}
		System.out.println("Total Sub strings: " + count);
	}

	// Check if a string is substring of another
	private static void isASubString(String s1, String s2) {
		int s1_len = s1.length();// Small String
		int s2_len = s2.length();// Large String
		boolean isSubstring=false;
		for (int i = 0; i < s2_len - s1_len; i++) {
			int j;
			for(j=0;j<s1_len;j++) {
				if(s2.charAt(i+j)==s1.charAt(j)) {
					continue;
				}else {
					break;
				}
			}
			
			if(j==s1_len) {
				isSubstring=true;
				break;
			}
		}
		
		System.out.println(isSubstring);
	}
}
