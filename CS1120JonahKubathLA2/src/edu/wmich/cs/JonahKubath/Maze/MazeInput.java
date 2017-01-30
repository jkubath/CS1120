/**
 * Name: Maze Recursion
 * Author: Jonah Kubath
 * Date: January 25, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.Maze;

import java.util.Scanner;

public class MazeInput {
	private Scanner scan = new Scanner(System.in);

	/**
	 * Gets the number of rows and columns from the user and sends it to the
	 * MazeSolver object to be stored
	 * 
	 * @param solver
	 *            Object that holds the maze, solves it, and prints the result
	 */
	public void initializeMazeSolver(MazeSolver solver) {
		// Get rows
		int rows = getNumRows();
		// Set rows
		solver.setNumRows(rows);
		// Get and set columns
		solver.setNumCols(getNumCols(rows));

		// Make the maze
		System.out.println("\n*****First Maze*****");
		solver.drawMaze();
		System.out.println("\n*****Second Maze*****");
		solver.drawMaze();
		System.out.println("\n*****Third Maze*****");
		solver.drawMaze();

	}

	/**
	 * Asks the user for the amount of rows
	 * 
	 * @return rows Returns the number of rows entered by the user
	 */
	private int getNumRows() {
		int rows;
		do {
			// Get number of rows
			System.out.println("Enter the number of rows.\nOnly 5 - 10");
			String input = scan.nextLine();
			String inputCheck = input.replaceAll("[^0-9]", "");
			// Input validation
			while (inputCheck.compareTo(input) != 0) {
				System.out.println("Invalid row entry.\nEnter numbers 5 - 10");
				input = scan.nextLine();
				inputCheck = input.replaceAll("[^0-9]", "");
			}

			// Save number
			rows = Integer.parseInt(input);
			if (rows < 5 || rows > 10) {
				System.out.println("Row entry out of range.");
			}
		} while (rows < 5 || rows > 10);

		return rows;
	}

	/**
	 * Gets the number of columns from the user and checks it against the number
	 * of rows
	 * 
	 * @param numRows
	 *            The number of rows given by the user
	 * @return cols The number of columns given by the user
	 */
	private int getNumCols(int numRows) {
		int cols;
		do {
			// Get number of cols
			System.out.println("Enter the number of columns.\nOnly 5 - 10 and different than rows");
			String input = scan.nextLine();
			String inputCheck = input.replaceAll("[^0-9]", "");
			// Input validation
			while (inputCheck.compareTo(input) != 0) {
				System.out.println("Invalid column entry.\nEnter numbers 5 - 10");
				input = scan.nextLine();
				inputCheck = input.replaceAll("[^0-9]", "");
			}

			// Save number
			cols = Integer.parseInt(input);
			if (cols < 5 || cols > 10) {
				System.out.println("Column entry out of range.");
			}
			if (cols == numRows) {
				System.out.println("Number of rows cannot equal number of columns");
			}
		} while (cols < 5 || cols > 10 || cols == numRows);

		return cols;
	}

	/**
	 * Close the scanner used in the object
	 */
	public void closeScanner() {
		scan.close();
	}

}