package SeleniumPrep;

public class Q13_FewCharactersAsAsked {

	public static void main(String[] args) {
		String s = "jsHjjkjdjdh";	
		fewCharToUC(s);
	}

	public static void fewCharToUC(String str) {
		char[] chArry = str.toCharArray();
		for (int i = 0; i < chArry.length;i++) {
			if (i % 4 == 0) {
				chArry[i]=Character.toUpperCase(chArry[i]);
			}
		}
		String s = new String(chArry);
		System.out.println(s);
	}

}
