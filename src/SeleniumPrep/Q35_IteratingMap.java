package SeleniumPrep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Q35_IteratingMap {

	public static void main(String[] args) {
		Map<String,Integer> testMap = new HashMap<String,Integer>();
		testMap.put("Selenium", 1);
		testMap.put("JAVA",2);
		testMap.put("Python", 3);
		testMap.put("PyCharm", 4);
		testMap.put("Eclipse", 5);
		testMap.put("TestNg", 6);	
		iterateMap(testMap);
	}

	private static void iterateMap(Map<String, Integer> testMap) {
		
		//Method1 	
		for(Entry<String,Integer> map:testMap.entrySet()) {
			System.out.println(map.getKey()+" : "+map.getValue());
		}
		System.out.println("************************************************");
		
		//Method 2 Using Iterator	
		Iterator<Map.Entry<String, Integer>> itr = testMap.entrySet().iterator();	
		while(itr.hasNext()) {
			 Entry<String, Integer> entry = itr.next(); 
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		System.out.println("************************************************");
		
		//Method 3 - Using FOr Each:	
		testMap.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println("************************************************");
		
		//Method 4- Retrieving value from keySet
		for(String key: testMap.keySet()) {
			int val = testMap.get(key);
				System.out.println(key+" : "+val);
		}
		System.out.println("************************************************");
	}

}
