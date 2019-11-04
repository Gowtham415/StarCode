package SeleniumPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q14_Occurance {
//	14. In a String print the occurrence of each character.
	public static void main(String[] args) {

		occOfEachChar("hjekjejbr");
	}

	public static void occOfEachChar(String str) {
		char[] chArry = str.toCharArray();
		Map<Character, Integer> chMap = new HashMap<Character, Integer>(chArry.length);
		for (int i = 0; i < chArry.length; i++) {
			if (chMap.containsKey(chArry[i])) {
				int value = chMap.get(chArry[i]) + 1;
				chMap.put(chArry[i], value);
			} else {
				chMap.put(chArry[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:chMap.entrySet()) {
			String s1 = entry.getKey()+"->"+entry.getValue();
			System.out.println(s1);
		}
	}
}