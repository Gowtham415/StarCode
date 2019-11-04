package SeleniumPrep;

public class Q22_Challenge {

//22. Given a string with Aplhanumerics (sghjdfd1234th45syd) as input. Write a JAVA program out put should be String{sghjdfdthsyd} and Int{123445}?
	public static void main(String[] args) {
		String str= "sghjdfd1234th45syd";
		String str1= str.replaceAll("\\D", "");
		String str2= str.replaceAll("\\d", "");
		System.out.println("Gievn String:"+str);
		System.out.println(str1);
		System.out.println(str2);
	}

}
