package SeleniumPrep;

public class Q37_DupsInArry_WO_Collections {

	public static void main(String[] args) {
		int[] arry = { 2, 23, 2, 4, 56, 13, 24, 11, 1, 4 };
		findDups(arry);
	}

	// Find the duplicate numbers in an Array without using Collections
	static void findDups(int[] arry) {
		int len = arry.length;

		for (int i = 0; i < len; i++) {
			int dup = -1;
			for (int j = i + 1; j < len; j++) {
				if (arry[i] == arry[j]) {
					dup = arry[i];
				}
			}
			if (dup != -1) {
				System.out.println(dup);
			}
		}
	}
	
}
