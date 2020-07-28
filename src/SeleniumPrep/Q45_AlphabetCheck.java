package SeleniumPrep;

public class Q45_AlphabetCheck {

	public static void main(String[] args) {
		f6();
	}

	// 6. Alphabet Check
	public static void f6() {
		char ch = 'H';
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
			System.out.println(ch+" is an Alphabet");
		}else {
			System.out.println(ch+" is not an Alphabet");
		}
	}
}
