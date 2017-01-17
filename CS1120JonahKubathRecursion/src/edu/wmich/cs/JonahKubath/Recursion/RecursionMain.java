/*
 * Name: Multiplication - Recursion
 * Author: Jonah Kubath
 * Date: January 17, 2017
 * Reference: N/A
 */package edu.wmich.cs.JonahKubath.Recursion;

import java.util.Scanner;

public class RecursionMain {

	public static void main(String[] args) {

		// Get the numbers to multiply
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number to multiply");
		int first = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the second number to multiply");
		int second = scan.nextInt();
		scan.nextLine();

		// Print out the total
		System.out.println("Total : " + recMal(first, second));

		scan.close();
	}

	/**
	 * Multiplies two given numbers
	 * 
	 * @param x
	 *            First number to multiply
	 * @param y
	 *            Second number to multiply
	 * @return total Total of the multiplication
	 */
	public static int recMal(int x, int y) {
		if (x == 1) {
			return y;
		}
		if (x == 0 || y == 0) {
			return 0;
		}
		if (y == 1) {
			return x;
		}
		return y + recMal(x - 1, y);

	}
}
