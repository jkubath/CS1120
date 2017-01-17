/*
 * Name: LA1 Lucky Number
 * Author: Jonah Kubath
 * Date: January 11, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.LA1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LA1Main {

	// Make scanner for all methods
	public static Scanner scan;

	public static void main(String[] args) {

		// Print Welcome Message
		printWelcomeMessage();

		// Get number of items
		int numberPrizes = numberOfPrizes();

		// Get the names of the items
		String[] itemNames;
		itemNames = Arrays.copyOf(addItems(numberPrizes), numberPrizes);

		// Get array of random numbers
		int[] randomArray;
		randomArray = Arrays.copyOf(generateLuckyNumbers(numberPrizes), numberPrizes);

		// Main Game
		ArrayList<String> bingoList = new ArrayList<String>();
		bingoList.addAll(guessForPrizes(itemNames, randomArray));

		// Print Random Numbers
		// Print correct and wrong count with the items names
		printResult(itemNames, randomArray, bingoList);

	}// End of Main

	/**
	 * Prints out a brief welcome message, the rules, and how the user is to
	 * play
	 */
	public static void printWelcomeMessage() {
		System.out.println("---------------------------------------------------");
		System.out.println("Welcome to the game of Lucky Number.");
		System.out.println("Rule: You have 6 chances to guess the lucky number.");
		System.out.println("May luck be with you.");
		System.out.println("---------------------------------------------------\n");

	}

	/**
	 * Prints out the information of each item including the name and lucky
	 * number. It also prints out the result of the game
	 * 
	 * @param itemName
	 *            Array that holds the prize names
	 * @param randomNumber
	 *            Array that holds the lucky numbers
	 * @param bingoList
	 *            ArrayList that holds the correctly guessed items
	 */
	public static void printResult(String[] itemName, int[] randomNumber, ArrayList<String> bingoList) {
		// Display names and random numbers
		System.out.println("-----------------------------------------");
		System.out.printf("%-12s%-10s\n", "Item Name", "Random Number");
		for (int i = 0; i < itemName.length; i++) {
			System.out.printf("%-12s%-4d\n", itemName[i], randomNumber[i]);
		}
		System.out.println("-----------------------------------------");

		int correct = bingoList.size();
		int wrong = itemName.length - correct;

		// Display correct and wrong
		System.out.printf("Bingo: %d\n", correct);
		System.out.printf("Miss: %d\n\n", wrong);

		// If more items correct than wrong the user wins
		if (correct > wrong) {
			System.out.println("Congratulations! You Win!");
			System.out.println("Here are your prizes:");
			for (int i = 0; i < correct; i++) {
				System.out.printf("%s\n", bingoList.get(i));
			}
		} else {
			System.out.println("So close, try again.");
		}
	}

	/**
	 * Gets the number of prizes the user wants to try to win.
	 * 
	 * @return numberPrizes The number of prizes the user wants to try to win.
	 */
	public static int numberOfPrizes() {
		// Get number of items from user
		scan = new Scanner(System.in);

		System.out.println("How many items would you like to try to win.");
		System.out.println("Enter only odd numbers from 3 to 9.");
		int numberPrizes = Integer.parseInt(scan.nextLine());

		// Input Validation
		boolean wrongNumber = false;
		if (numberPrizes > 2 && numberPrizes < 10) {
			if (numberPrizes % 2 != 0)
				wrongNumber = true;
		}
		while (wrongNumber == false) {
			System.out.println("Invalid Entry");
			System.out.println("Enter only odd numbers from 3 to 9.");
			numberPrizes = Integer.parseInt(scan.nextLine());
			if (numberPrizes > 2 && numberPrizes < 10) {
				if (numberPrizes % 2 != 0)
					wrongNumber = true;
			}
		}

		// Return number of prizes
		return numberPrizes;
	}

	/**
	 * Prompts the user to enter the names of items he/she wants to win. Stores
	 * them in an array.
	 * 
	 * @param num
	 *            The number of items the user wants to play for
	 * @return itemName Array that holds the item's names
	 */
	public static String[] addItems(int num) {
		String[] itemName = new String[num];

		String nameInput;

		// Get the names of the items
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the name of item " + (i + 1));
			nameInput = scan.nextLine();
			itemName[i] = nameInput;
		}

		// Return the array
		return itemName;
	}

	/**
	 * Method creates and stores random numbers for an array
	 * 
	 * @return randomArray Array filled with randomly generated numbers from
	 *         1-100
	 * @param num
	 *            The number of random numbers needed
	 */
	public static int[] generateLuckyNumbers(int num) {
		// Create array to hold random numbers
		int[] randomArray = new int[num];
		Random rand = new Random();

		// Generate numbers
		for (int i = 0; i < num; i++) {
			randomArray[i] = rand.nextInt(100) + 1;
		}

		// Return Array
		return randomArray;
	}

	/**
	 * Receives the guess from the user and displays message accordingly to
	 * random number. The item of correct guess is added to an array list.
	 * 
	 * @param items
	 *            Array that holds the names of the items the user is playing
	 *            for
	 * @param luckyNumbers
	 *            Array that holds the randomly generated numbers
	 * @return bingoList ArrayList that holds the correctly guessed item's names
	 */
	public static ArrayList<String> guessForPrizes(String[] items, int[] luckyNumbers) {

		int inputGuess;
		ArrayList<String> bingoList = new ArrayList<String>();
		int counter = 0;

		// Run through all the items
		for (int i = 0; i < items.length; i++) {
			// Give user 6 guesses with an exit if correct
			for (int j = 0; j < 6; j++) {
				System.out.println("Guess #" + (j + 1) + " for item " + (i + 1));
				inputGuess = Integer.parseInt(scan.nextLine());
				// Output message whether low or high or correct
				if (inputGuess < luckyNumbers[i]) {
					System.out.println("Your guess is too low.");
				}
				if (inputGuess > luckyNumbers[i]) {
					System.out.println("Your guess is too high.");
				}
				if (inputGuess == luckyNumbers[i]) {
					System.out.println("Bingo");
					// Add correct guess to ArrayList
					bingoList.add(counter, items[i]);
					counter++;
					break;
				}
			}
			System.out.printf("Next Item ----------------------------- %s\n", items[i]);
		}

		// Return ArrayList
		return bingoList;
	}

}
