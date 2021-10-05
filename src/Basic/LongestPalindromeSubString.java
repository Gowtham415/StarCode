package Basic;

public class LongestPalindromeSubString {
    public static void main(String[] args) {
        String str = "ghguidhjkrkj";
        System.out.println(getLargestPalindromeSubString(str));
    }

    private static int getLargestPalindromeSubString(String str) {
        int maxLength =1;
        int start=0;

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                int flag = 1;
                for(int k=0;k<(j-i+1)/2;k++){
                    if(str.charAt(k+i)!=str.charAt(j-k)){
                        flag=0;
                    }
                }

                if(flag!=0 && (j-i+1)>maxLength){
                    start=i;
                    maxLength=j-i+1;
                }
            }
        }

        System.out.print("Longest palindrome subString is: ");
        printSubStr(str, start, start + maxLength - 1);
        return maxLength;
    }

    private static void printSubStr(String str, int start, int end) {
        for(int i=start;i<=end;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
