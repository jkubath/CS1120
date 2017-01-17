/*
 * Name: Search Array - Recursion
 * Author: Jonah Kubath
 * Date: January 17, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.Search;

public class SearchMain {

	public static void main(String[] args) {

		// Initialize Array
		int[] array = { 0, 1, 2, 3, 4 };

		// Print out result
		System.out.println("Search Result: " + isMember(array, 4, 0));

	}

	/**
	 * Takes in an array and searches for the given number.
	 * 
	 * @param array
	 *            Array of numbers to search in
	 * @param value
	 *            Number to find
	 * @param search
	 *            Where to start looking in the array, normally 0.
	 * @return boolean True if the number is found, false if not.
	 */
	public static boolean isMember(int[] array, int value, int search) {
		boolean found = false;
		if (search == array.length) {
			return false;
		} else if (search < 0) {
			search = 0;
		} else if (array[search] == value) {
			found = true;
		} else {
			found = isMember(array, value, search + 1);
		}

		return found;
	}

}
