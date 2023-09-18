package interviewprep;

import java.util.Arrays;

public class Q51_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight","fl","flw"};
        System.out.println(getCommonPrefix(strs));
    }


    private static String getCommonPrefix(String[] strs){
        int size = strs.length;
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        int end = Math.min(strs[0].length(),strs[size-1].length());

        int i=0;
        while(i<end && strs[0].charAt(i)==strs[size-1].charAt(i)){
            i++;
        }

        String prefix = strs[0].substring(0,i);
        return prefix;
    }
}
