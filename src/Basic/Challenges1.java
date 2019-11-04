package Basic;

import java.util.Arrays;

public class Challenges1 {

	public static void main(String[] args) {

	}

	public static String getFormatted(String str) {
		String s = new String();
		for (int i = 0; i < (str.length()); i++) {
			if (s.indexOf(str.charAt(i)) < 0) {
				s = s + str.charAt(i);
				if (Character.isLowerCase(str.charAt(i))) {
					char newCh = Character.toUpperCase(str.charAt(i));
					if (!(str.indexOf(newCh) < 0)) {
						s = s + newCh;
					}
				} else {
					char newCH = Character.toLowerCase(str.charAt(i));
					if (!(str.indexOf(newCH) < 0)) {
						s = s + newCH;
					}
				}
			}
		}
		return s;
	}
	// Java  program to find triplets in a given 
	// array whose sum is zero 	
	static void cominationoOfNumWithSumAsZero(int[] arry) {
		int len = arry.length;
		Arrays.sort(arry);
		for(int i=0;i<len-1;i++) {
			int second = i+1;
			int third = len-1;
			int first = arry[i];
			while(second<third) {
				if((first+arry[second]+arry[third])==0) {
					System.out.print(first+" "+arry[second]+" "+arry[third]+"\n");
					second++;
					third--;
				}else if((first+arry[second]+arry[third])>0) {
					third--;
				}else if((first+arry[second]+arry[third])<0){
					second++;
				}
				
			}
		}
	}
	//column with maximum zeros
	static int columnWithMaxZero(int a[][],int n){
        int arr[] = new int[n];
        for(int i=0;i<n;i++){//Columns
            for(int j=0;j<n;j++){//rows
                if(a[j][i]==0){
                    arr[i]++;
                }
            }
        }
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max=arr[i];
            }
        }
        
        int i=0;
         while (i < n) { 
  
            // if the i-th element is t 
            // then return the index 
            if (arr[i] == max) { 
                return i; 
            } 
            else { 
                i = i + 1; 
            } 
        } 
        return -1; 
    }
}
