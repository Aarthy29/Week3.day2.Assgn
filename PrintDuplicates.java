package Week3Assignment;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// Expected o/p: 14,18,17

		// get the length of the array
		// declare an int variable named count

		// iterate from 0 to the array length-1 (outer loop starts here)

		// assign 0 to count

		// iterate from i to the length of the array by adding 1 to it (inner loop
		// starts here)

		// compare both the loop variables & check they're equal

		// increase the count if both the arrays are equal

		// Out of the inner loop, check and print the first array variable if count is
		// more than 0
        //creating a object for set
		Set<Integer> val = new TreeSet<Integer>();
		//Iterating the loop values 
		for (Integer integer : arr) {

			//condition to get the value if it is False
			if (val.add(integer) == false) {
				System.out.println("Dupliacte value is" + integer);

			}

		}

	}

}
