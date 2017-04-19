package edu.wmich.cs1120.la6;

public class EmptyStringException extends Exception {
	/**
	 * Default constructor
	 */
	public EmptyStringException() {

	}

	/**
	 * Displays that their entered sentence was empty
	 */
	public void emptyString() {
		System.out.println("No sentence entered.");
	}

}
