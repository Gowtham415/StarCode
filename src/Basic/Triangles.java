package Basic;

import java.util.stream.IntStream;

public class Triangles {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0;i<n;i++){
            IntStream.range(1,n-i).forEach(s-> System.out.print(" "));
            IntStream.rangeClosed(1,(2*i+1)).forEach(s-> System.out.print("*"));
            System.out.println();
        }

        for(int i=0;i<n;i++){
            IntStream.rangeClosed(1,i+1).forEach(s-> System.out.print(" "));
            IntStream.rangeClosed(1,2*(n-1)-(2*i+1)).forEach(s-> System.out.print("*"));
            System.out.println();
        }
    }
}
