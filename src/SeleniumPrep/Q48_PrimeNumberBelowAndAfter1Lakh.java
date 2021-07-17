package SeleniumPrep;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q48_PrimeNumberBelowAndAfter1Lakh {
    public static void main(String[] args) {
        int lessThanOneLakh = Stream.iterate(100000,x->x-1).filter(x->isPrime(x)).findFirst().get();
        int moreThanOneLakh = Stream.iterate(100000,x->x+1).filter(x->isPrime(x)).findFirst().get();

        System.out.println(lessThanOneLakh+" "+moreThanOneLakh);
    }

    private static boolean isPrime(int num){
        return Stream.iterate(2,s->s+1).limit(num/2).filter(s->num%s==0).findAny().isPresent()?false:true;
    }


}


