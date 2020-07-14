package SeleniumPrep;

public class Q32_LexographicallySamllestAndLargest {

	public static void main(String[] args) {

		System.out.println(getSmallestAndLargest("geeksforgeeks", 3));

	}

	public static String getSmallestAndLargest(String s, int k) {

		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		String baseStr = s.substring(0, k);
		String smallest = baseStr;
		String largest = baseStr;

		for (int i = k; i < s.length(); i++) {
			baseStr = baseStr.substring(1, k) + s.charAt(i);// Forming a new string of length k
			if (smallest.compareTo(baseStr) > 0) {
				smallest = baseStr;
			}
			if (largest.compareTo(baseStr) < 0) {
				largest = baseStr;
			}
		}
		return smallest + "\n" + largest;
	}

}
