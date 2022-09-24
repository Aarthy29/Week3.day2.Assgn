package Week3Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElementArray {

	public static void main(String[] args) {
		// Here is the input
		int[] ar = { 1, 2, 3, 4, 7, 6, 8 };

		// Sort the array

		// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively

		// print the number

		// once printed break the iteration
		int i = 1;
		List<Integer> Missing = new ArrayList<Integer>();

		for (Integer Values : ar) {

			Missing.add(Values);

		}
		Collections.sort(Missing);
		System.out.println(Missing);

		for (Integer inputvalues : Missing) {
			if (inputvalues != i) {
				System.out.println("Missing element is" + " " + i);
				break;
			}

			i++;
		}

	}

}
