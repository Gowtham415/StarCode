package CompetitiveProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Find the segment of numbers with largest width from lower bound to upper bound  which does not include in the list given.
 * *Input:*
	List<Integers> = [20,13,7,29,35]
	
	Lower bound = 3
	
	Upper bound = 30
	
	*Output:*
	
	Segments - [4-6],[8-12], [14-19],[21-28]
	
	O/p: 7 because [21-28] is the one having longest width
 */
public class Program_1_SegmentOfNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(13);
		list.add(7);
		list.add(29);
		list.add(35);
		list.add(45);
		System.out.println(largestWidthOfSegments(list, 3, 48));
	}

	private static int largestWidthOfSegments(List<Integer> list, int lower, int upper) {
		List<Integer> sortedList = list;
		int lowerBound = lower;
		int upperBound = upper;
		Collections.sort(sortedList); // [7,13,20,29,35,45]
		List<Integer> segmentLengths = new ArrayList<Integer>();
		for (int num : sortedList) {
//			System.out.println("Lowerbound:" + lowerBound);
			for (int i = (lowerBound); i < upperBound; i++) {
				if (i == num) {
//					System.out.println(i);
					int lengthOfSegment = num - lowerBound;
					segmentLengths.add(lengthOfSegment);
					lowerBound = num;
					break;
				}
			}
		}
		System.out.println(segmentLengths);
		return Collections.max(segmentLengths);

	}
}
