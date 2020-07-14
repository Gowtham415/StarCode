package SeleniumPrep;

import java.util.Arrays;

public class Q33_Anagrams_Strings {

	public static void main(String[] args) {
		anagramStringOrNot("Anagram", "gramana");
		System.out.println(anagramStringsOrNot("Anagram", "gramana"));
	}

	// Method 1
	static void anagramStringOrNot(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
		}

		char[] str1Arry = str1.toLowerCase().toCharArray();
		char[] str2Arry = str2.toLowerCase().toCharArray();

		Arrays.sort(str1Arry);
		Arrays.sort(str2Arry);

		String strt1 = new String(str1Arry);
		String strt2 = new String(str2Arry);
		if (strt1.equals(strt2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}

	// Method 2

	static boolean anagramStringsOrNot(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		char[] ch = a.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder(b.toLowerCase());
		for (char c : ch) {
			int index = sb.indexOf("" + c);
			if (index != -1) {
				sb.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sb.length()==0 ? true : false;
	}
}
