package Basic;

public class StringDemo2 {

	public static void main(String[] args) {
//		System.out.println(countHi("abc hi ho"));
//		System.out.println(countHi("ABChi hi"));

//		System.out.println(countCode("aaacodebbb"));

		// System.out.println(repeatFront("Chocolate", 4));
//
//		System.out.println(prefixAgain("abXYabc", 3));
		
		System.out.println(oneTwo("tcagdo"));
	}

//Given a string, return a string where for every char in the original, there are two chars.
//doubleChar("The")  "TThhee"
//doubleChar("AAbb")  "AAAAbbbb"
//doubleChar("Hi-There")  "HHii--TThheerree"
	private static String doubleChar(String str) {
		char[] chArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char c : chArray) {
			sb.append(c);
			sb.append(c);
		}
		return sb.toString();
	}

//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
//countCode("aaacodebbb")  1
//countCode("codexxcode") 2
//countCode("cozexxcope")  2

	private static int countCode1(String str) {
		return 0;
	}

//Given two strings, return true if either of the strings appears at the very
//end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

	private static boolean endOther(String a, String b) {
		String str1 = a.toLowerCase();
		String str2 = b.toLowerCase();

		if (str1.endsWith(str2)) {
			return true;
		} else if (str2.endsWith(str1)) {
			return true;
		} else {
			return false;
		}
	}

	private static int countHi(String str) {

//		//int count = 0;
//		  // Loop to length-1 so we can access index i and i+1 in the loop.
//		  for (int i = 0; i < (str.length() - 1); i++) {
//		    if (str.substring(i, i+2).equals("hi")) count++;
//		  }
		return countHi2(str, 0);

	}

	private static int countHi2(String str, int start) {
		start = str.indexOf("hi", start);
		System.out.println("Start:" + start);
		if (start == -1) {
			return 0;
		}

		int count = 0;
		if (start == 0 || start != -1) {
			count++;
		}
		return count + countHi2(str, start + 2);
	}

	private static boolean catDog(String str) {
		int catCount = 0;
		int dogCount = 0;
		for (int i = 0; i < (str.length() - 2); i++) {
			if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
				catCount++;
			}
		}
		for (int i = 0; i < (str.length() - 2); i++) {
			if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
				dogCount++;
			}
		}

		if (catCount == dogCount) {
			return true;
		} else
			return false;

	}

//	Return the
//	number of
//	times that
//	the string"code"
//	appears anywhere
//	in the
//	given string, except we'll accept
//	any letter for the'd',so"cope"and"cooe"count.

	private static int countCode(String str) {
		int count = 0;
		for (int i = 0; i < (str.length() - 3); i++) {
			if (((str.substring(i, i + 2)).equalsIgnoreCase("co")) && (str.charAt(i + 3) == 'e')) {
				count++;
			}
		}
		return count;
	}

//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

	public static boolean xyzThere(String str) {

		for (int i = 0; i < (str.length() - 2); i++) {
			if ((i - 1) != -1) {
				if (((str.substring(i, i + 3)).equalsIgnoreCase("xyz")) && (str.charAt(i - 1) != '.')) {
					return true;
				}
			} else if ((i - 1) == -1) {
				if (((str.substring(i, i + 3)).equalsIgnoreCase("xyz"))) {
					return true;
				}
			}
		}
		return false;

	}

//	Return true if
//	the given
//	string contains a"bob"string,
//	but where
//	the middle'o'
//	char can
//	be any char.

	public boolean bobThere(String str) {
		if (str.length() < 3) {
			return false;
		}
		for (int i = 0; i < (str.length() - 2); i++) {
			if ((str.charAt(i) == 'b') && (str.charAt(i + 2) == 'b')) {
				return true;
			}
		}
		return false;
	}

	// We'll say that a String is xy-balanced if for all the 'x' chars in the
	// string, there exists a 'y' char somewhere later in the string. So "xxy" is
	// balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
	// the given string is xy-balanced.
	public boolean xyBalance(String str) {
		int len = str.length() - 1;
		char ch;
		for (int i = len; i >= 0; i--) {
			ch = str.charAt(i);
			if (ch == 'x')
				return false;
			else if (ch == 'y')
				return true;
		}
		return true;
	}

	// Given two strings, A and B, create a bigger string made of the first char of
	// A, the first char of B, the second char of A, the second char of B, and so
	// on. Any leftover chars go at the end of the result.
	public String mixString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();
		int i = 0;
		StringBuilder stbuild = new StringBuilder(aLen + bLen);
		for (; i < aLen && i < bLen; i++) {
			stbuild.append(a.charAt(i));
			stbuild.append(b.charAt(i));
		}
		// only 1 for loop will actually run
		for (; i < aLen; i++)
			stbuild.append(a.charAt(i));
		for (; i < bLen; i++)
			stbuild.append(b.charAt(i));
		return stbuild.toString();
	}

	public String repeatEnd(String str, int n) {
		StringBuffer str1 = new StringBuffer();
		String newSubStr = str.substring(str.length() - n);
		for (int i = 0; i < n; i++) {
			str1.append(newSubStr);
		}
		return str1.toString();
	}

//Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

	public static String repeatFront(String str, int n) {
		int temp = n;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			String strSub = str.substring(0, temp);
			sb.append(strSub);
			temp--;
		}
		return sb.toString();

	}

	// Given two strings, word and a separator sep, return a big string made of
	// count occurrences of the word, separated by the separator string.

	public String repeatSeparator(String word, String sep, int count) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < count; i++) {
			sb.append(word);
			sb.append(sep);
		}
		return sb.substring(0, sb.length() - sep.length()).toString();
	}

	// Given a string, consider the prefix string made of the first N chars of the
	// string. Does that prefix string appear somewhere else in the string? Assume
	// that the string is not empty and that N is in the range 1..str.length().
	public static boolean prefixAgain(String str, int n) {
		String subStr = str.substring(0, n);
		String searchSub = str.substring(n);
		if (searchSub.contains(subStr)) {
			return true;
		} else {
			return false;
		}

	}

	// Returns true if for every '*' (star) in the string, if there are chars both
	// immediately before and after the star, they are the same.
	public boolean sameStarChar(String str) {
		int len = str.length() - 1;
		for(int i = 1; i < len; i++)
		{
			if(str.charAt(i) == '*')
			{
				if(str.charAt(i-1) != str.charAt(i+1))
					return false;
			}	
		}
		return true;
	}
	
	//Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
	
	public static String oneTwo(String str) {	
		int len = str.length();
		int remLen=0;
		int q = len/3;
		if(len%3!=0) {
			remLen=len%3;
		}
		StringBuffer sb = new StringBuffer();
		 for(int i=0;i<q;i++) {
			 int j=i*3;
			 String subStr = str.substring(j, j+3);
			 sb.append(Character.toString(subStr.charAt(1))+Character.toString(subStr.charAt(2))+Character.toString(subStr.charAt(0)));
		 }	 
		 return sb.toString();
	}
	
}
