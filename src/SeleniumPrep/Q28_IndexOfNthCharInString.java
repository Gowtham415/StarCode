 package SeleniumPrep;

public class Q28_IndexOfNthCharInString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println(indexOfNthChar(str, 'e', 3));

	}

//	28. How to find the index of nth occurring character in a string?
	static int indexOfNthChar(String str, char ch, int n) {
		int idx = str.indexOf(ch);
		int count = 0;
		if (n > 1 && idx != -1) {
			count = 1;
			while ((idx = str.indexOf(ch, idx + 1)) != -1) {
				count++;
				if (count == n) {
					return idx;
				} 
			}

		} else if (n == 1) {
			return idx;
		}
		return -1;
	}
}
