package edu.wmich.cs.JonahKubath.BinarySearch;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		// Given array
		int[] array = { -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// Get number from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to search for.");
		int search = scan.nextInt();
		scan.nextLine();

		// Print message
		int found = binarySearch(0, array.length - 1, search, array);
		if (array[found] == search) {
			System.out.println(search + " was found at position " + (found + 1) + ".");
		} else
			System.out.println(search + " was not found.");

		scan.close();
	}

	/**
	 * Binary Search of array for a given value
	 * 
	 * @param first
	 *            Starting point of search
	 * @param last
	 *            Ending point of search
	 * @param find
	 *            The given number to look for
	 * @param array
	 *            Database of numbers
	 * @return found The position in the array at which the number is found
	 */
	public static int binarySearch(int first, int last, int find, int[] array) {
		int middle = (first + last) / 2;
		// If you find the number
		if (array[middle] == find) {
			return middle;
		}
		// Fell off the end
		else if (first > last) {
			return middle;
		}
		// Fell of the beginning
		else if (last < first) {
			return middle;
		}
		// Number is in first half
		else if (array[middle] < find) {
			middle = binarySearch(middle + 1, last, find, array);
		}
		// Number is in second half
		else if (array[middle] > find)
			middle = binarySearch(first, middle - 1, find, array);

		// Return the boolean
		return middle;
	}

}
