package SeleniumPrep;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q15_Q16_DuplicateStrings {
//	In a Statement check how any duplicate words are there and remove them.
	public static void main(String[] args) {
		String s = "This is a new addiction and this is a new world of addiction";
		duplicateStrings(s);
	}
	
	public static void duplicateStrings(String str) {
		String[] strArry = str.split("\\s");
		int count=0;
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(String s:strArry) {
			if(map.containsKey(s)) {
				count = map.get(s)+1;
				map.put(s,count);
			}else {
				map.put(s, 1);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<String, Integer> s: map.entrySet()) {
			System.out.println("'"+s.getKey()+"'"+" is appeared "+s.getValue()+" time/s");
			sb.append(s.getKey()+" ");
		}
		System.out.println("New Statement is:");
		System.out.println(sb.toString());	
	}
}
