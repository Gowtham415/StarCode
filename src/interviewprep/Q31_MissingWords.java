package interviewprep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//31. Find the missing words by comparing one string with other.
public class Q31_MissingWords {

	public static void main(String[] args) {

		String str1 = "I am an honest man with great work ethic";
		String str2 = "I am an with great work";
//		printMissingWords(str1, str2);
		missingWords(str1,str2).forEach(System.out::println);

	}

	static void printMissingWords(String str1, String str2) {
		String[] strArry1 = str1.split("\\s");
		String[] strArry2 = str2.split("\\s");

		for (String strTemp : strArry1) {
			boolean exists = false;
			for (int i = 0; i < strArry2.length; i++) {
				if (strTemp.equals(strArry2[i])) {
					exists = true;
					break;
				}
			}
			if (!exists) {
				System.out.println(strTemp);
			}
		}
	}

	private static Set<String> missingWords(String firstLine, String secondLine){
		Set<String> firstLineSet = new HashSet<String>(Arrays.asList(firstLine.split(" ")));
		Set<String> secondLineSet = new HashSet<String>(Arrays.asList(secondLine.split(" ")));
		Set<String> missingWords = new HashSet<String>(firstLineSet);
		missingWords.removeAll(secondLineSet);
		return missingWords;
	}

}
