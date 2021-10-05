package SeleniumPrep;
/*
    Find the sum of numbers that are not in between 6 and 9 in the array
 */
public class Q49_SumOfSeriesExcludingMiniSeries {

    public static void main(String[] args) {
        int array[] = {2,3,1,6,3,4,9,8,0};
        int sum =0;
        int sixthIndx=0;
        int ninthIndex =0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            if(array[i]==6){
                sixthIndx=i;
            }
            if(array[i]==9){
                ninthIndex=i;
            }
        }
        int tempSum =0;
        for(int i=sixthIndx;i<=ninthIndex;i++){
            tempSum+=array[i];
        }
        System.out.println("Leftover sum:"+(sum-tempSum));
    }
}
