package interviewprep;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 40. WAP to print the maximum occuring integer in an Array with number of Occurances.
 */
public class Q40_MaxOccuringIntInArray {

	public static void main(String[] args) {
		int[] intArray = { 2, 4, 5, 8, 4, 3, 10, 7, 5 };

		maxOccInt(intArray);

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

		int maxCount = Integer.MIN_VALUE;
		int maxVal = -1;

		for (Entry<Integer, Integer> e : data.entrySet()) {
			if (maxCount < e.getValue()) {
				maxCount = e.getValue();
				maxVal = e.getKey();
			}
		}

		System.out.println("Max value:" + maxVal + " | Max count:" + maxCount);

	}


	private static void maxOccInt(int[] nums){
		Map<Integer,Integer> mapOfNums = new HashMap<>();

		for(int i=0;i<nums.length;i++){
			mapOfNums.put(nums[i],mapOfNums.getOrDefault(nums[i],0)+1);
		}

		int max = Integer.MIN_VALUE;
		int maxKey = Integer.MIN_VALUE;
		for(Entry<Integer,Integer> entry:mapOfNums.entrySet()){
			if(max<entry.getValue()){
				max=entry.getValue();
				maxKey=entry.getKey();
			}
		}

		System.out.println("Max Occuring value :: "+maxKey + " Appeared ::"+max+" times");
	}

}
