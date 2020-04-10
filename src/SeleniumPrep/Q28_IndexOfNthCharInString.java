 package SeleniumPrep;

public class Q28_IndexOfNthCharInString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println(indexOfNthChar(str, 'e', 4));

	}

//	28. How to find the index of nth occurring character in a string?
	static int indexOfNthChar(String str, char ch, int n) {
		int count=1;	
		int currentIndex = str.indexOf(ch);
		if(n<=0 || currentIndex==-1) {
			return -1;
		}else if(n==1){
			return currentIndex;
		}else {	
			while (count!=n) {
				count++;
				currentIndex = str.indexOf(ch,currentIndex+1);
				if(currentIndex==-1) {
					System.out.println("Character '"+ch +"' is not occured "+n+" times");
					return -1;
				}
			}		
			return currentIndex;
		}

	}
}
