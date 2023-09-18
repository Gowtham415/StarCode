package interviewprep;

import java.util.HashMap;
import java.util.Map;

public class Q15_Q16_DuplicateStrings {
//	In a Statement check how any duplicate words are there and remove them.
	public static void main(String[] args) {
		String s = "This is a new addiction and this is a new world of addiction";
		duplicateStrings(s);
	}
	
	public static void duplicateStrings(String str) {
		String words[] = str.split("\\s");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word:words){
			map.put(word,map.getOrDefault(word,0)+1);
		}
		map.forEach(
				(k,v) ->{
					if(v>1)
						System.out.println(k+" repeated "+v+" times");
				}
		);
	}
}
