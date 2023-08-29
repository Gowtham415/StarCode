package SeleniumPrep;

import java.util.HashMap;

public class Q56_LongestSubstring {
	
	public static void main(String[] args) {
		System.out.println("MaxLength : "+longestSubString("abcabcd"));
		
	}
	
	
	private static int longestSubString(final String inputString) {
		
		int maxLength = 0;
		
		HashMap<Character,Integer> visitedChars = new HashMap<>();
	
		for(int right =0, left =0; right<inputString.length() ; right++) {
			char currentCharacter = inputString.charAt(right);
			if(visitedChars.containsKey(currentCharacter) && visitedChars.get(currentCharacter)>=left) {
				left = visitedChars.get(currentCharacter)+1;
			}
			maxLength = Math.max(maxLength, right - left +1);
			visitedChars.put(currentCharacter, right);		
		}	
		return maxLength;		
	}
}
