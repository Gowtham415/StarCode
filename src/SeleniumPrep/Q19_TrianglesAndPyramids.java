package SeleniumPrep;

public class Q19_TrianglesAndPyramids {

	public static void main(String[] args) {
		
		triangleOfNumbers(5);
		pyramid(5);
		diamond(5);
	}
	
	// Trainagle opf numbers
	static void triangleOfNumbers(int height) {
		int val =1;
		int n =height;
		for (int i=0;i<n; i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++) {
				System.out.print(val);
				
			}
			System.out.println();
			val++;
		}
	}
	
	
	//Pyramid
	
	static void pyramid(int height) {

		int n =height;
		for (int i=0;i<n; i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	//Diamond
	
	
	static void diamond(int height) {

		int n =height;
		for (int i=0;i<n; i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		for (int i=0;i<n; i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*n-(2*(i+1)+1));j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
