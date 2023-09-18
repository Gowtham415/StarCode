package interviewprep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Q26_IteratingAList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		// 1. For loop
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

		// 2. For each loop
		for (int i : list) {
			System.out.print(list.get(i));
		}

		// 3.Lambda Expression
		list.forEach(i -> System.out.print(i));

		// 4. Using Iterator
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}

		// 5. Method References
		list.forEach(System.out::print);

		// 6. Consumer - Anonymous Class
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t);
			}
		});

	}
}