package SeleniumPrep;

public class Q11_Strings {
//A String is given remove the white spaces, reverse it and print the only odd position characters.
	public static void main(String[] args) {
		String s = "I am the only owner of all my deeds and I am solely responsible person for all the chances that I encounter";
		Q11_StringsChallenge(s);
	}

	public static void Q11_StringsChallenge(String str) {
		String s = str.replaceAll("\\s", "");
		int len = s.length();
		System.out.println(s);
		String strReverse = "";
		// For reversing
		for (int i = (len - 1); i >= 0; i--) {
			strReverse = strReverse + s.charAt(i);
		}

		System.out.println("Reversed Array:" + strReverse);
		for (int i = strReverse.length(); i > 0; i--) {
			if (i % 2 == 1) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
