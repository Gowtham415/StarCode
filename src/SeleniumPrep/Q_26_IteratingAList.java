package SeleniumPrep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q_26_IteratingAList {

	public static void main(String[] args) {
		ArrayList<Integer> intArrList= new ArrayList<>();
		for(int i=0;i<10;i++) {
			intArrList.add(i);
		}	
		method1(intArrList);	
		System.out.println();
		method2(intArrList);
		System.out.println();
		method3(intArrList);
		System.out.println();
		method4(intArrList);
	}
	
	// For loop
	static void method1(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
	
	// For each loop
		static void method2(List<Integer> list) {		
			for(Integer i:list) {
				System.out.print(list.get(i));
			}
		}
		
	// lambda Expression
		
		static void method3(List<Integer> list) {		
			list.forEach(i->System.out.print(i));
		}
		
	// Using Iterator 
		static void method4(List<Integer> list) {
			Iterator<Integer> itr = list.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next());
			}
			
		}

}
