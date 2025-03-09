package Basic;

public class TransposeOfMatrix {

    public static void main(String[] args) {


        int[][] matrix1 = new int[3][4];

        int dummy=0;

        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                matrix1[i][j]=dummy;
                dummy++;
            }
        }

        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                System.out.print(" "+matrix1[i][j]);
            }
            System.out.println();
        }


        int[][] transposeArray= new int[matrix1[0].length][matrix1.length];
        for(int i=0;i<transposeArray.length;i++){
            for(int j=0;j<transposeArray[0].length;j++){
                transposeArray[i][j]=matrix1[j][i];
            }
        }

        System.out.println("Transposed Matrix!!!!!!!");
        for(int i=0;i<transposeArray.length;i++){
            for(int j=0;j<transposeArray[0].length;j++){
                System.out.print(" "+transposeArray[i][j]);
            }
            System.out.println();
        }


    }
}
