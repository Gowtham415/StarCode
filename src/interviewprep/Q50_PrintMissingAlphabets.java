package interviewprep;

import java.util.ArrayList;
import java.util.List;

public class Q50_PrintMissingAlphabets {
    public static void main(String[] args) {
        String str = "Test Automation";
        System.out.println(getMissingAlphabets(str));
        System.out.println(getMissingAlphabets(str).size());
    }


    private static List<Character> getMissingAlphabets(String str){
        List<Character> result = new ArrayList<>();

        for(int i='a';i<='z';i++){
            if(!str.contains((char)i +"")){
                result.add((char)i);
            }
        }

        for(int i='A';i<='Z';i++){
            if(!str.contains((char)i +"")){
                result.add((char)i);
            }
        }

        return result;
    }
}
