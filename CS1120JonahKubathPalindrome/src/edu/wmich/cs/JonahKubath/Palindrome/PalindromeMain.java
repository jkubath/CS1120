/**
 * Name: Palindrome
 * Author: Jonah Kubath
 * Date: January 18, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.Palindrome;

import java.util.Scanner;

public class PalindromeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Message to user
		System.out.println("Enter a string to check if it is a palindrome.");

		// Get input from user
		String input = scan.nextLine();

		// Copy to character array
		char[] charArray = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			charArray[i] = input.charAt(i);
		}

		// Call recursive method
		if (checkPalindrome(charArray, 0)) {
			System.out.println("Yes, " + input + " is a palindrome.");
		} else {
			System.out.println("No, " + input + " is not a palindrome.");
		}

		scan.close();
	}

	/**
	 * Takes in character array and checks to see if opposite character is
	 * equal.
	 * 
	 * @param input
	 *            Char array that is checked
	 * @param check
	 *            Number to start with in the array
	 * @return Boolean True if the all the opposite characters are equal False
	 *         if the opposite character is not equal
	 */
	public static boolean checkPalindrome(char[] input, int check) {
		// If all characters are checked and are equal - return true;
		if (check == input.length / 2) {
			return true;
			// If the checked numbers are not equal return false
		} else if (input[check] != input[input.length - check - 1]) {
			return false;
		} else
			return checkPalindrome(input, check + 1);

	}

}
