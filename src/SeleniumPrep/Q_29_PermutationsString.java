package SeleniumPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q_29_PermutationsString {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "ABC";
		System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
		System.out.println(permutationFinder(s2).size());

	}

	public static Set<String> permutationFinder(String str) {
		Set<String> perm = new HashSet<String>();
		if (str == null) {
			return null;
		}
		if (str.length() == 0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = permutationFinder(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		String finalString = begin + c + end;
		return finalString;
	}
}
