package SeleniumPrep;

public class Q44_ReverseOfWords {

	public static void main(String[] args) {

		String str = "I love my freedom";
		String temp = "";
		String[] strArry = str.split("\\s");
		for (String s:strArry) {
			for (int j = s.length() - 1; j >= 0; j--) {
				temp = temp + s.charAt(j);
			}
			System.out.print(temp+" ");
			temp="";
		}

	}

}
