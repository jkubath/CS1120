package edu.wmich.cs1120.la6;

public class InvalidInputException extends Exception {
	private int number = 0;

	/**
	 * Default constructor
	 */
	public InvalidInputException() {

	}

	/**
	 * Called constructor
	 * 
	 * @param number
	 *            The choice entered by the user
	 */
	public InvalidInputException(int number) {
		this.number = number;
	}

	/**
	 * Displays why the number choice was invalid
	 */
	public void invalidInput() {
		System.out.println(number + " is not a valid input.");
		System.out.println("Enter 1 or 2");
	}

	/**
	 * Displays why their continue argument was invalid
	 */
	public void invalidChoice() {
		System.out.println("To continue enter: y");
		System.out.println("To stop enter: n");
	}
}
