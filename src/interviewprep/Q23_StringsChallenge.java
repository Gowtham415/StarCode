package interviewprep;

import java.util.HashMap;
import java.util.Map;

public class Q23_StringsChallenge {
//23. Print the count of each character repeated in string?
	public static void main(String[] args) {
		getCharCount("test");
	}
	
	public static void getCharCount(String str) {
			char chArray[] = str.toCharArray();
			Map<Character,Integer> map = new HashMap<>();
			for(char c:chArray){
				map.put(c,map.getOrDefault(c,0)+1);
			}

			map.forEach((k,v)-> System.out.println(k+" repeated "+v+" time/s"));
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
