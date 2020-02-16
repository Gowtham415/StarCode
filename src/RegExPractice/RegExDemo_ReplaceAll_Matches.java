package RegExPractice;

public class RegExDemo_ReplaceAll_Matches {

	public static void main(String[] args) {
		String email = "gowthampage@gmail.com";
		String email2 = "gowtham.epparla@oracle.com";
		
		String regEx ="^[A-Za-z0-9+_.-]+@(.+)$";
		boolean m = email2.matches(regEx);
		System.out.println(m);
		
		String regEx2 ="^(.+)+@(.+)$";
		System.out.println(email.matches(regEx2));
		System.out.println(email2.matches(regEx2));
		
		String email3 = "gowtham_22@gmail.com";
		
		String regEx3 = "^[a-zA-Z0-9_]+@[a-zA-Z+.]+";
		System.out.println(email3.matches(regEx3));
		
		String str = "jcwjed2309d32uoj32r-[p[d-3fd]";// Replace Special Characters
		System.out.println(str.replaceAll("[-\\[\\]]", ""));
		
		// Complex Regex ||## but ## may not be present everytime
		String line = "3::Daniel::Louis||##2::Leon: the Professional::1994||6::Jean::Reno||7::Gary::Oldman||8::Natalie::Portman||##3::Scarface::1983||9::Al::Pacino||10::Michelle::Pfeiffer";
		String[] namesComplete= line.split("\\|\\|(##)*");
		for(int i=0;i<namesComplete.length;i++) {
			System.out.println(namesComplete[i]);
		}
		
	}
}
