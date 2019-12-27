package Basic;

import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RegExTest1 {

	public static void main(String[] args) {
//	        Scanner scan = new Scanner(System.in);
//	        String s = scan.nextLine();
//	        String[] str= s.split("^[a-zA-Z]");
//	        String[] tokens = s.split("[^a-zA-Z]");
//	        System.out.println(str.length);
//	        System.out.println(tokens.length);
//	        scan.close();
		
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a = new int[n];
	        scan.nextLine();
	        if(n>0){
	            for(int i=0;i<a.length;i++){
	            int val = scan.nextInt();
	                a[i]=val;
	            scan.nextLine();
	            }
	        }
	        scan.close();

	        // Prints each sequential element in array a
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
		}

}
