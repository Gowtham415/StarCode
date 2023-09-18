package interviewprep;

public class Q22_RegExChallenge {

//22. Given a string with Aplhanumerics (sghjdfd1234th45syd) as input. Write a JAVA program out put should be String{sghjdfdthsyd} and Int{123445}?
	public static void main(String[] args) {
		String str= "sghjdfd1234th45syd";
		String str1= str.replaceAll("\\D", "");
		String str2= str.replaceAll("\\d", "");
		System.out.println("Given String:"+str);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(withOutSpecialChar("812yw*!98!*!E!#J@D!90s02D"));
	}
	
	
// Print a string Special Characters
	private static String withOutSpecialChar(String str) {
		String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		return newStr;
	}

}
