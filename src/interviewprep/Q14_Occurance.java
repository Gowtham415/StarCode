package interviewprep;

import java.util.HashMap;
import java.util.Map;

public class Q14_Occurance {
//	14. In a String print the occurrence of each character.
	public static void main(String[] args) {

		occOfEachChar("hjekjejbr");
	}

	public static void occOfEachChar(String str) {
		char charArray[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char ch : charArray) {
			charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
		}
		charMap.forEach((k, v) -> System.out.println("Key:" + k + " | Value:" + v));
	}
}