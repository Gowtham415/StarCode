package RegExPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
		
		String input = "Some words <firstMatch> some words <secondMatch> some more words <ThirdMatch>";
		Pattern pattern1 = Pattern.compile( "<[^>]*>" );
		Matcher m = pattern1.matcher( input );
		while ( m.find() ) {
		   System.out.println( m.group(0) ); // = m.group(), the whole match value
		}
	}

}
