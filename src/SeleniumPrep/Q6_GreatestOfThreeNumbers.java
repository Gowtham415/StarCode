package SeleniumPrep;

public class Q6_GreatestOfThreeNumbers {

	public static void main(String[] args) {
		System.out.println(grestestOfThreeNum(-997,3676,666));
	}
	
	public static int grestestOfThreeNum(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else if(c>a && c>b) {
			return c;
		}else {
			return 0;
		}
	}
}
