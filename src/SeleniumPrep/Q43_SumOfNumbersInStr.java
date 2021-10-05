package SeleniumPrep;

import java.util.Arrays;

public class Q43_SumOfNumbersInStr {
//43. WAP to add the numbers in a String? (Example Str=hsbjqd72dkj2f32jenf31nfnenfefnefn77djnj38cndncnd)
	public static void main(String[] args) {
			String str= "testcasepassed100testcasefailed85testcaseskipped43";
			addNumbersInString(str);
	}
	
	
	static void addNumbersInString(String str) {
		String words[] = str.split("[a-zA-Z]");
		int res = Arrays.asList(words).stream().filter(s->!s.equals("")).mapToInt(s->Integer.parseInt(s)).reduce(0,(x, y)->x+y);
		System.out.println(res);
	}
}
