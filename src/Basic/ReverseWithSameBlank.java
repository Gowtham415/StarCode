package Basic;

import java.util.Arrays;

public class ReverseWithSameBlank {
    public static void main(String[] args) {
        String s = "Test Automation";
        int indx = s.indexOf(" ");
        System.out.println(indx);
        for(int i=s.length()-1;i>=0;i--){
            if(i==s.length()-1-indx){
                System.out.print(" ");
            }else{
                if (s.charAt(i) == ' ') {
                    continue;
                }
                System.out.print(s.charAt(i));
            }
        }
    }
}
