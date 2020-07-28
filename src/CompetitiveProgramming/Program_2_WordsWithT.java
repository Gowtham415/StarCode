package CompetitiveProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_2_WordsWithT {

	/*
	 * Print the words in a given sentence which include character 't' in it by
	 * replacing 1st character with second and third character with fourth. Handle
	 * all the possibilities if the char count is less.If there no words with 't' in
	 * it display None.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String wordsArray[] = line.split("\\s");
		List<String> wordList = new ArrayList<String>();
		for (String word : wordsArray) {
			if (word.contains("t")) {
				wordList.add(word);
				int len = word.length();
				if (len == 1) {
					System.out.println(word);
				} else if (len == 2 || len == 3) {
					StringBuffer str = new StringBuffer();
					str.append(word.charAt(1));
					str.append(word.charAt(0));
					String result = str.toString() + word.substring(2);
					System.out.println(result);
				} else if (len >= 4) {
					StringBuffer str = new StringBuffer();
					str.append(word.charAt(1));
					str.append(word.charAt(0));
					str.append(word.charAt(3));
					str.append(word.charAt(2));
					String result = str.toString() + word.substring(4);
					System.out.println(result);
				}
			}
		}
		if (wordList.isEmpty()) {
			System.out.println("None");
		}
		scan.close();
	}

}
