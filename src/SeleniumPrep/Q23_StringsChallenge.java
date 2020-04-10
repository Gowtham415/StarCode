package SeleniumPrep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q23_StringsChallenge {
//23. Print the count of each character repeated in string?
	public static void main(String[] args) {
		getCharCount("test");
	}
	
	public static void getCharCount(String str) {

		StringBuffer sb = new StringBuffer();
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>(str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (sb.toString().indexOf(ch) == -1) {
				sb.append(ch);
				charMap.put(ch, 1);
			} else if (sb.toString().indexOf(ch) != -1) {
				int count = charMap.get(ch);
				count = count + 1;
				charMap.put(ch, count);
			}
		}

		for (Map.Entry<Character, Integer> s : charMap.entrySet()) {
			System.out.println(s.getKey() + " :  " + s.getValue());
		}
	}
	
	public static void getCharCount2(String str) {
		char[] charArry = str.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		int count=0;
		for(char c:charArry) {
			if(charMap.containsKey(c)) {
				count = charMap.get(c)+1;
				charMap.put(c, count);
			}else {
				charMap.put(c, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> s : charMap.entrySet()) {
			System.out.println(s.getKey() + " :  " + s.getValue());
		}
	}

}
