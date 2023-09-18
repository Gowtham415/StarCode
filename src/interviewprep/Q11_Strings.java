package interviewprep;

import java.util.Arrays;

public class Q11_Strings {
	/*
       Print reverse of each word in the sentence given
     */
	public static void main(String[] args) {
		String s = "I am the only owner of all my deeds and I am solely responsible person for all the chances that I encounter";
		Q11_StringsChallenge(s);
	}

	public static void Q11_StringsChallenge(String str) {
		Arrays.asList(str.split("\\s"))
				.stream()
				.map(s->(new StringBuffer(s)).reverse().toString()+ " ").forEach(System.out::print);
	}

}
