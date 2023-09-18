package interviewprep;

import java.util.Arrays;

public class Q57_FindThrisHighestNumberInArray {

    public static void main(String[] args) {
        int[] nums = {2,7,43,3,77,34,23};
        System.out.println(findNthHighestNum(nums,5));;
    }

    private static int findNthHighestNum(int[] nums,int n){
        Arrays.sort(nums);
        return nums[n-1];
    }
}
