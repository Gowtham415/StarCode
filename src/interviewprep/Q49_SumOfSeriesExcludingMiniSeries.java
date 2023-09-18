package interviewprep;
/*
    Find the sum of numbers that are not in between 6 and 9 in the array
 */
public class Q49_SumOfSeriesExcludingMiniSeries {

    public static void main(String[] args) {
        int array[] = {2,3,1,6,3,4,9,8,0};
        System.out.println(findSumExcludingRange(array,6,9));
    }

    public static int findSumExcludingRange(int[] arr, int startRange, int endRange) {
        int sum = 0;
        boolean withinRange = false;

        for (int num : arr) {
            if (num == startRange) {
                withinRange = true;
            } else if (num == endRange) {
                withinRange = false;
            } else if (!withinRange) {
                sum += num;
            }

        }

        return sum;
    }
}
