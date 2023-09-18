package interviewprep;

public class Q58_LeftRotatingAnArray {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int rotations = 2;

            System.out.println("Original Array: ");
            printArray(array);

            rotateLeft(array, rotations);

            System.out.println("Array after " + rotations + " left rotations: ");
            printArray(array);
        }

        public static void rotateLeft(int[] arr, int rotations) {
            int length = arr.length;
            rotations = rotations % length; // Ensure rotations are within array length

            reverseArray(arr, 0, rotations - 1);
            reverseArray(arr, rotations, length - 1);
            reverseArray(arr, 0, length - 1);
        }

        public static void reverseArray(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


}
