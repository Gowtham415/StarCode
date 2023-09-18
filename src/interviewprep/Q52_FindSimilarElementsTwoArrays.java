package interviewprep;

import java.util.HashSet;
import java.util.Set;

public class Q52_FindSimilarElementsTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {2,3,4,5,6,7};
        int[] array2 = {5,8,9,12,13};
        findCommonElementsInTwoArrays(array1,array2);
    }

    private static void findCommonElementsInTwoArrays(int[] array1,int[] array2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<array1.length;i++)
            set1.add(array1[i]);
        for(int i=0;i<array2.length;i++)
            set2.add(array2[i]);

        set1.retainAll(set2);
        System.out.println("Common Elements"+set1);
    }
}
