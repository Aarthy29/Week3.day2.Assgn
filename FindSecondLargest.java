package Week3Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };
		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */
		// Array list
		List<Integer> values = new ArrayList<Integer>();

		// adding value to list
		for (Integer input : data) {

			values.add(input);

		}
		// Sorting the values
		Collections.sort(values);

		System.out.println(values);

		// Getting the second largest value with size()-2
		System.out.println(values.get(values.size() - 2));

		// values.get(values.size()-2);
		// System.out.println(values.size()-1);

	}

}
