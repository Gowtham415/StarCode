package Basic;

public class CharArrayReverse {

	public static void main(String[] args) {
		char chArry[] = { 'M', 'y', ' ', 'N', 'a', 'm', 'e', ' ', 'i', 's', ' ', 'G', 'o', 'w', 't', 'h', 'a', 'm' };
		reverseCharArray(chArry);
	}

	public static void reverseCharArray(char[] chArry) {
		int len = chArry.length;
		int cutVal = 0;
		for (int i = len - 1; i >= 0; i--) {
			if(chArry[i]==' ' && cutVal!=i) {
				break;
			}
		}	
	}
}
