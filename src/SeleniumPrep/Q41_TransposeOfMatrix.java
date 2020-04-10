package SeleniumPrep;

public class Q41_TransposeOfMatrix {

	public static void main(String[] args) {
		
		int count=0;
		int[][] matrix = new int[3][4];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				count++;
				matrix[i][j]=count;
			}
			
		}
		
		System.out.println("Before transpose:");
		printMatrix(matrix);
		System.out.println("After transpose:");
		printMatrix(transposedMatrix(matrix));
	}
	
	
	private static int[][] transposedMatrix(int[][] matrix){
		int[][] temp = new int[matrix[0].length][matrix.length];
		
		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp[0].length;j++) {
				temp[i][j]=matrix[j][i];
			}
		}
		
		return temp;
	}
	
	private static void printMatrix(int[][] m) {
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

}
