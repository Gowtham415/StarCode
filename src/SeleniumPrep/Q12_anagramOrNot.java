package SeleniumPrep;

import java.util.Arrays;

public class Q12_anagramOrNot {

	public static void main(String[] args) {
		System.out.println(anagramTest("tester","resetrt"));
	}
	
	
	public static boolean anagramTest(String str1,String str2) {
		char[] chStr1=str1.toCharArray();
		char[] chStr2=str2.toCharArray();
		int strlen1=chStr1.length;
		int strlen2=chStr2.length;
		
		if(strlen1!=strlen2) {
			return false;
		}
		
		Arrays.sort(chStr1);
		Arrays.sort(chStr2);
		for(int i=0;i<chStr1.length && i<chStr2.length;i++) {
			if(chStr1[i]!=chStr2[i])
				return false;
		}
		return true;	
	}

}
