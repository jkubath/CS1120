package edu.wmich.cs1120.la6;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInterface implements IUserInterface {
	private int choice = 0;
	// Holds the number of languages available to translate
	private int translateOption = 2;
	private String fileName = "";
	private String[] sentence;
	private boolean done = false;
	private Scanner scan = new Scanner(System.in);

	/**
	 * Main method for the User Interface
	 */
	@Override
	public void runProgram() throws FileNotFoundException {
		boolean runAgain = false;
		do {
			// Welcome the user
			greeting();
			// Get the choice from the user
			getCorpusFileName();
			// Get the sentence from the user
			getSourceText();
			// Translate
			translate();
			// Continue?
			runAgain = runAgain();
		} while (runAgain);

		// Close the scanner
		scan.close();
	}

	/**
	 * Welcomes the user to the translator
	 */
	@Override
	public void greeting() {
		// Message
		System.out.println("Welcome to the translator");
		System.out.println("Enter the following choice");

	}

	/**
	 * Gets the user's choice of translation
	 */
	@Override
	public void getCorpusFileName() {
		done = false;

		System.out.println("1 >> Translate English to French");
		System.out.println("2 >> Translate French to English");

		while (done == false) {
			try {
				// Get input
				String temp = scan.nextLine();
				choice = Integer.parseInt(temp);
				// invalid input
				if (choice > translateOption || choice < 1) {
					throw new InvalidInputException(choice);
				}
				// No exception thrown, exit the loop
				done = true;
			} catch (InvalidInputException e) {
				e.invalidInput();
			} catch (NumberFormatException e) {
				System.out.println("Enter only numbers");
			}
		}

		if (choice == 1) {
			fileName = "EnglishToFrench.txt";

		} else if (choice == 2) {
			fileName = "FrenchToEnglish.txt";
		}

	}

	/**
	 * Reads in the sentence to translate
	 */
	@Override
	public void getSourceText() {
		String input = "";
		done = false;
		System.out.println("Enter the sentence to translate.");
		while (!done) {
			try {
				input = scan.nextLine();
				// Empty String
				if (input.length() == 0) {
					throw new EmptyStringException();
				}
				done = true;
				sentence = input.split(" ");

			}
			// Catch the exception
			catch (EmptyStringException e) {
				e.emptyString();
			}
		}

	}

	/**
	 * Calls the translator and outputs the translated sentence
	 */
	@Override
	public void translate() throws FileNotFoundException {
		// Create object and store the filename to use
		Translator t = new Translator(fileName, sentence);
		t.readCorpus();
		System.out.println(t.translate());

	}

	/**
	 * Asks the user if they want to translate more
	 * 
	 * @return boolean Whether or not user wants to run again
	 */
	public boolean runAgain() {
		String choice = "";
		boolean illegal = false;
		boolean cont = false;
		System.out.println("Would you like to translate another sentence? (y/n)");
		while (!illegal) {
			try {
				choice = scan.nextLine();
				choice = "" + choice.toLowerCase().charAt(0);
				if (choice.compareTo("y") == 0 || choice.compareTo("n") == 0) {
					illegal = true;
				} else
					throw new InvalidInputException();
			} catch (InvalidInputException e) {
				e.invalidChoice();
			}
		}
		if (choice.compareTo("y") == 0) {
			cont = true;
		}
		// Return the user choice
		return cont;
	}
}
