package SeleniumPrep;

import java.util.ArrayList;
import java.util.List;

public class Q24_OddSum {

	public static void main(String[] args) {
		List<Integer> ol = new ArrayList<Integer>();
		ol.add(3);
		ol.add(1);
		ol.add(1);
		ol.add(3);
		
		getoddSum(ol).forEach(x->System.out.println(x));
	}
	
	public static List<Integer> getoddSum(List<Integer> arry){
		int OddSum =0;
		List<Integer> oddList = new ArrayList<Integer>(arry.size());
		for(Integer i : arry) {
			for(int j=1;j<=i;j++) {
				if(j%2==1) {
					OddSum = OddSum + j;
				}
			}
			oddList.add(OddSum);
			OddSum=0;
		}
		return oddList;	
	}

}
