package interviewprep;

import java.util.Arrays;

public class Q59_RightRotatingAnArray {
    public static void main(String[] args) {
        int[] array = {14,23,45,78,52,11,5,60,12};
        int rotations = 5;

        System.out.println("Original Array: ");
        printArray(array);

        rotateRightPtr(array, rotations);

        System.out.println("Array after " + rotations + " left rotations: ");
        printArray(array);
    }

    private static void rotateRight(int[] array, int rotations) {

        if(rotations>array.length)
            throw new IllegalArgumentException();

        int len = array.length;
        reverse(array,len-rotations,len-1);
        reverse(array,0,len-rotations-1);
        reverse(array,0,len-1);
    }

    private static void reverse(int[] array, int start, int end) {
        while(start<end){
            int temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

    private static void rotateRightPtr(int[] nums,int rotations){
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(i>=nums.length-rotations){
                int temp = nums[i];
                nums[i]=nums[pointer];
                nums[pointer]=temp;
                pointer++;
            }
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
