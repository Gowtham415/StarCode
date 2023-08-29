package SeleniumPrep;

import java.util.Arrays;
// If String S2 is contained in S1, then S2 is called anagram of anagram of S1
public class Q12_anagramOrNot {

	public static void main(String[] args) {
		System.out.println(anagramTest("tester","ertest"));
		System.out.println(anagramTest2("tester","ertest"));
	}
	
	// Method 1 
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
	
	//Method2
	
	public static boolean anagramTest2(String str1,String str2) {
		int strlen1=str1.length();
		int strlen2=str2.length();
		if(strlen1!=strlen2) {
			return false;
		}
		
		StringBuffer sb = new StringBuffer(str1);
		for(int i=0;i<str2.length();i++) {
			int index=0;
			index= sb.toString().indexOf(str2.charAt(i));
			if(index!=-1){
				sb.deleteCharAt(index);
			}
		}
		
		return sb.toString().isEmpty();
	}
}
