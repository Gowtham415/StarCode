package SeleniumPrep;

public class Q13_FewCharactersAsAsked {

	public static void main(String[] args) {
		String s = "jsHjjkjdjdh";	
		fewCharToUC(s);
	}

	public static void fewCharToUC(String str) {
		char[] chArry = str.toCharArray();
		for (int i = 1; i < chArry.length;i++) {
			if (i % 4 == 0) {
				chArry[i-1]=Character.toUpperCase(chArry[i-1]);
			}
		}
		String s = new String(chArry);
		System.out.println(s);
	}

}
