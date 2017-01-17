/*
 * Name: Fibonacci Sequence
 * Author: Jonah Kubath
 * Date: January 17, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.Fibonacci;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		// Message
		System.out.println("Enter the number in the series to find.");
		System.out.println("0 is the first number");

		// Get the number to look for from the user
		Scanner scan = new Scanner(System.in);
		int series = scan.nextInt();

		// Take out next Line
		scan.nextLine();

		// Print result
		System.out.println("Fibonnaci : " + fibonnaci(series - 1));

		scan.close();

	}

	/**
	 * Recursive method to calculate numbers in the Fibonacci Sequence
	 * 
	 * @param find
	 *            The number in the sequence to find. 0 is the first number in
	 *            the sequence.
	 * @return int The number in the requested spot of the series
	 */
	public static int fibonnaci(int find) {
		int total = 0;
		if (find < 0) {
			find = 0;
		} else if (find == 0) {
			return 0;
		} else if (find == 1) {
			return 1;
		} else {
			total += fibonnaci(find - 1) + fibonnaci(find - 2);
		}
		return total;
	}

}
