package SeleniumPrep;

public class Q43_SumOfNumbersInStr {
//43. WAP to add the numbers in a String? (Example Str=hsbjqd72dkj2f32jenf31nfnenfefnefn77djnj38cndncnd)
	public static void main(String[] args) {
			String str= "testcasepassed100testcasefailed85testcaseskipped43";
			addNumbersInString(str);
	}
	
	
	static void addNumbersInString(String str) {
		String strArry[] = str.split("\\D");
		int sum =0;
		for(String s:strArry) {
			if(s.equals("")) {
				continue;
			}else {
				System.out.print(s+" ");
				sum+=Integer.parseInt(s);
			}
		}
		System.out.println();
		System.out.println("Sum of the numbers:"+sum);
	}
}
