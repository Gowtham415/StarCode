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
//				System.out.println(sb.toString());
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

//	public static void getrepetitiveCharCount(String str) {
//		int count=1;
//		char[] chArray = str.toCharArray();
//		for(int i=0;i< chArray.length;i++) {			
//			for(int j=i+1;j<chArray.length;j++) {	
//				if(chArray[i]==chArray[j]) {
//					count++;
//				}
//			}
//			System.out.println(chArray[i]+": "+count);
//			count=1;
//		}

}
