package SeleniumPrep;

public class Q38_MaxOccuringCharInString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println(maxOccurinhCharInString(str));
	}

	static char maxOccurinhCharInString(String str) {
		char[] chArry = new char[256];// 256 is maxmimum ASCII values can range upto
		int len = str.length();

		for (int i = 0; i < len; i++) {
			chArry[str.charAt(i)]++;
			// char is casted to ASCII value and count is incremented when same ASCII value
			// comes up in the traversal of string
		}

		int max = -1;
		char result = ' ';

		for (int i = 0; i < len; i++) {
			if (max < chArry[str.charAt(i)]) {
				max = chArry[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}
}
