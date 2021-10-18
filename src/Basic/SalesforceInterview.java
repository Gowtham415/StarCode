package Basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesforceInterview {
    public static void main(String[] args) {

        String str=  "Test Automation";
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

        System.out.println(result);
    }
}
