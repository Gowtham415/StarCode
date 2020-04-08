package SeleniumPrep;

public class Q44_ReverseOfWords {

	public static void main(String[] args) {

		String str = "I love my freedom";
		String temp = "";
		String[] strArry = str.split("\\s");
		for (int i = 0; i < strArry.length; i++) {
			for (int j = strArry[i].length() - 1; j >= 0; j--) {
				temp = temp + strArry[i].charAt(j);
			}
			System.out.print(temp+" ");
			temp="";
		}

	}

}
