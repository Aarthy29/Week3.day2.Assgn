package Week3Assignment;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	// private static final Collection<? extends String> String = null;

	public static void main(String[] args) {
		/*
		 * Pseudo code
		 * 
		 * a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1"; b) Initialize
		 * an integer variable as count c) Split the String into array and iterate over
		 * it d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. f) if the count > 1 then
		 * replace the word as ""
		 * 
		 * g) Displaying the String without duplicate words
		 */

		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;

		// Converting string to String Array
		String[] splitText = text.split(" ");
		// Creating object for LinkedHashSet
		Set<String> value = new LinkedHashSet<String>();
		// iterating the loop
		for (String string : splitText) {
			if (string != " ") {
				value.add(string);

			}
		}

		System.out.println(value);

		for (String dupvalue : value) {
			System.out.print(" " + dupvalue + " ");

		}

	}
}
