package SeleniumPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 40. WAP to print the maximum occuring integer in an Array with number of Occurances.
 */
public class Q40_MaxOccuringIntInArray {

	public static void main(String[] args) {
		int[] intArray = { 2, 4, 5, 8, 4, 3, 10, 7, 5 };

		maxOccuringInt(intArray);

	}

	private static void maxOccuringInt(int[] intArray) {

		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		int len = intArray.length;

		for (int i = 0; i < len; i++) {
			if (data.containsKey(intArray[i])) {
				int val = data.get(intArray[i]);
				data.put(intArray[i], ++val);
			} else {
				data.put(intArray[i], 1);
			}
		}

		int maxCount = 0;
		int maxVal = -1;

		for (Entry<Integer, Integer> e : data.entrySet()) {
			if (maxCount < e.getValue()) {
				maxCount = e.getValue();
				maxVal = e.getKey();
			}
		}

		System.out.println("Max value:" + maxVal + " | Max count:" + maxCount);

	}

}
