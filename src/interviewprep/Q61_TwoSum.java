package interviewprep;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class Q61_TwoSum {
    public static void main(String[] args) {
        int[] array={2,11,7,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(array,target)));
    }

    private static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            intMap.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int k = target - array[i];
            if (intMap.containsKey(k) && intMap.get(k) != i) {
                return new int[]{i, intMap.get(k)};
            }
        }

        return new int[]{};

    }
}
