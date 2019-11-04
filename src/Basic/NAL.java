package Basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class NAL {

	public static void main(String[] args) {
		String str ="udaykumar";
		removeDup("udaykumar");
//		String sb = new String();
//		
//		for(int i=0;i<str.length();i++) {
//			char c = str.charAt(i);
//			if(sb.indexOf(c)<0) {
//				sb=sb+c;
//			}
//		}		
//		System.out.println(sb.toString());
	}
	
	
	static void removeDup(String str) {
		Set<Character> s = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			s.add(str.charAt(i));
		}
		
		s.forEach(ch->{
			System.out.print(ch);
		});
	}

}
