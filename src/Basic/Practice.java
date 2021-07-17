package Basic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
public class Practice {
    public static void main(String[] args) {
        String str = "ABC";
        getPerm(str).stream().forEach(System.out::println);

    }

    private static Set<String> getPerm(String str) {
        Set<String> result = new HashSet<>();
        if(str.length()==0 ||str==null)
            return null;
        if(str.length()==1){
            result.add(str);
            return result;
        }

        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = getPerm(rem);
        for(String word:words){
            for (int i = 0;i<=word.length();i++){
                result.add(charInsert(word, initial, i));
            }
        }
        return result;
    }

    private static String charInsert(String word, char initial, int j) {
        String begin = word.substring(0, j);
        String end = word.substring(j);
        return begin + initial + end;
    }

}
