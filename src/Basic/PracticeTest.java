package Basic;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeTest {
    public static void main(String[] args) {

    String s= "hkwje83wdkl27dsej  }}{{kfed88:}";

    String[] strArray = s.split("[^0-9]");
//        Arrays.stream(strArray).forEach(System.out::println);
     int result = Arrays.stream(strArray)
             .filter(str->!str.isEmpty()).map(str->Integer.parseInt(str)).reduce((x, y) -> x + y).get();
        System.out.println(result);

        String url = "https://www.tradingview.com/chart/tSAfsxCf/?symbol=NSE";
        String[] specialCharacters= url.split("[a-zA-Z0-9\\s]");
        Arrays.stream(specialCharacters).forEach(System.out::print);

        System.out.println();

        String[] nonSpecialCharacters= url.split("[^a-zA-Z0-9\\s]");
        Arrays.stream(nonSpecialCharacters).forEach(System.out::print);

        System.out.println();

        String mostRepeatingCharacter = "httpswwwtradingviewcomcharttSAfsxCfsymbolNSE";
        char[] chars = mostRepeatingCharacter.toCharArray();
        HashMap<Character,Integer> charMapData = new HashMap<>();

        for(char c:chars){
                charMapData.put(c,charMapData.getOrDefault(c,0)+1);
        }

        Set<Map.Entry<Character, Integer>> entries = charMapData.entrySet();

        entries.forEach(entry->System.out.println(entry.getKey()+" is repeated "+entry.getValue()+" times "));

        Map.Entry resultChar = entries.stream().max(Comparator.comparing(entry->entry.getValue())).get();

        System.out.println(resultChar.getKey()+" is most repeated, it is repeated "+resultChar.getValue()+" times");



    }

    private static void printOddSum(List<Integer> intList) {
        List<Integer> resList = new ArrayList<>();
        for(Integer i:intList){
            int sum =0;
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    sum+=j;
                }
            }
            resList.add(sum);
            sum=0;
        }

        System.out.println(resList);
    }

    private static void withOutSpecialChar(String str) {
        String s = str.replaceAll("[^0-9a-zA-Z]","");
        System.out.println(s);
    }

    private static void readAfile(String filePath){
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)))){

            String line = null;
            while(!((line=reader.readLine()) !=null)){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printDiamond() {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<(2*(n-1)-((2*i)+1));k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printATraingle() {
        int n = 5;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<(2*i+1);k++){
                System.out.print(++count);
            }
            System.out.println();
        }
    }

    private static String removeDups(String str) {
        StringBuffer strBuffer = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int idx = strBuffer.indexOf(c+"");
            if(idx==-1){
                strBuffer.append(c+"");
            }
        }
        return strBuffer.toString();
    }

    private static void occOfEachChar(String str) {
        char[] chArray =  str.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(char c:chArray){
            charMap.put(c,charMap.getOrDefault(c,0)+1);
        }
        charMap.forEach((k,v) -> System.out.println(k+ " : "+v));
    }

    private static boolean anagramOrnot(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        StringBuffer sb = new StringBuffer(str2);
        for(int i=0;i<len1;i++){
            char ch = str1.charAt(i);
           int idx = sb.indexOf(ch+"");
           if(idx!=-1){
               sb.deleteCharAt(idx);
           }
        }
        return sb.toString().isEmpty();
    }

    private static void doBubbleSort(int[] array) {
        int n = array.length;
        for(int i=0;i< n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }

    private static void printRandomNumber(int min,int max){
        double d = (Math.random() * (max-min))  + min;
        System.out.println(Math.round(d));
    }

    private static boolean isPerfectNumber(int number){
        int result = IntStream.rangeClosed(1,number/2).filter(i->number%i==0).reduce(0,(x,y)->x+y);
        return result == number ? true:false;
    }

    private static void printFibonocciSeries(int limit){
        int a = 0;
        int b =1;
        int c = 0;
        System.out.print(a + " "+b+" ");
        for(int i=2;i<=limit;i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    private static int factorialOfNUm(int num){
        if(num<=0)
            return 1;
        return num * factorialOfNUm(num-1);
    }
}
