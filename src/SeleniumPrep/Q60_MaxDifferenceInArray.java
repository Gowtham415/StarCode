package SeleniumPrep;

//Write a program to find the maximum difference between any two elements in an array.

public class Q60_MaxDifferenceInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 10, 6, 4, 8, 1};
        int maxDifference = findMaxDifference(array);

        System.out.println("Maximum difference between elements: " + maxDifference);
    }

    private static int findMaxDifference(int[] arr) {

        int minVal = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
           minVal = Math.min(minVal,arr[i]);
        }

        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff,arr[i]-minVal);
        }

        return maxDiff;
    }
}
