package SeleniumPrep;

public class Q18_DuplicatesOfAString {
//Remove duplicate characters from a String and Print it.
	public static void main(String[] args) {
		removeDups("pavankumar");

	}

	public static void removeDups(String str) {

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (sb.toString().indexOf(ch) == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}
