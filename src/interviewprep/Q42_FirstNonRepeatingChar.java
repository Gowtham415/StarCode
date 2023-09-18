package interviewprep;

import java.util.LinkedHashMap;
import java.util.Map;


public class Q42_FirstNonRepeatingChar {

	public static void main(String[] args) {
		int[] arry = { 1, 2, 3, 2, 1, 3, 4, 3, 3, 1, 3 };
		System.out.println("First non repeating integer is :"+firstNonrepeatingInt(arry));
		
		char[] arryChar = { 'a','f', 'v', 'a', 'd', 'c', 'a', 'f', 'e', 'g' };
		System.out.println("First non repeating character is :"+firstNonrepeatingChar(arryChar));
		
	}
	//42. WAP to find first non repeating Integer of an Array?
	private static int firstNonrepeatingInt(int[] arryInt) {
		
		int len = arryInt.length;
		// Using LinkedHashMap to preserve the Insertion order
		Map<Integer,Integer> mapOfInt= new LinkedHashMap<Integer,Integer>(len);
		for(int i=0;i<len;i++) {
			if(mapOfInt.containsKey(arryInt[i])) {
				int val = mapOfInt.get(arryInt[i]);
				val++;
				mapOfInt.put(arryInt[i], val);
			}else {
				mapOfInt.put(arryInt[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : mapOfInt.entrySet()) {
				if(entry.getValue()==1) {
					return entry.getKey();
				}
		}
		
		return -1;
			
	}
	
	//42. WAP to find first non repeating Character of an Array?
private static char firstNonrepeatingChar(char[] arryInt) {
		
		int len = arryInt.length;
		Map<Character,Integer> mapOfInt= new LinkedHashMap<Character,Integer>(len);
		for(int i=0;i<len;i++) {
			mapOfInt.put(arryInt[i],mapOfInt.getOrDefault(arryInt[i],0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : mapOfInt.entrySet()) {
				if(entry.getValue()==1) {
					return entry.getKey();
				}
		}
		
		return ' ';	
	}
}
