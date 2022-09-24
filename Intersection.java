package Week3Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		 * 
		 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
		 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
		 * a nested for another array from 0 to array length e) Compare Both the arrays
		 * using a condition statement
		 * 
		 * f) Print the first array (should match item in both arrays)
		 */
		// Array declaration
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };

		// Set object creation
		List<Integer> seta = new ArrayList<Integer>();

		List<Integer> setb = new ArrayList<Integer>();

		// Set<Integer> Setb=new HashSet<Integer>();

		// Loop iterator

		for (Integer i : a) {

			seta.add(i);
			// System.out.print(i+",");
		}

		for (Integer j : b) {

			setb.add(j);
			// System.out.print(j+",");

		}

		for (Integer intersec : seta) {

			if (setb.contains(intersec)) {
				System.out.println("Intersected value " + intersec + ",");
			}

		}

	}
}
