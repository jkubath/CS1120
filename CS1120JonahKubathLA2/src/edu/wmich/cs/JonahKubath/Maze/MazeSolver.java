/**
 * Name: Maze Recursion
 * Author: Jonah Kubath
 * Date: January 25, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.Maze;

import java.util.Random;

public class MazeSolver {
	private int numRows;
	private int numCols;
	private String[][] maze;
	private Boolean[][] visited;

	/**
	 * Sets local number of rows with param
	 * 
	 * @param numRows
	 *            Number of rows entered by the user
	 */
	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}

	/**
	 * Sets local number of columns with param
	 * 
	 * @param numCols
	 *            Number of columns entered by the user
	 */
	public void setNumCols(int numCols) {
		this.numCols = numCols;
	}

	/**
	 * Returns the local value of the number of rows
	 * 
	 * @return Returns the number of rows
	 */
	public int getNumRows() {
		return numRows;
	}

	/**
	 * Returns the local value of the number of columns
	 * 
	 * @return Returns the number of columns
	 */
	public int getNumCols() {
		return numCols;
	}

	/**
	 * Generates a random number of walls that is less than 1/3 the amount of
	 * the available spaces Randomly places the walls and then generates numbers
	 * 1-100 for the remaining spaces
	 */
	public void drawMaze() {
		maze = new String[getNumRows()][getNumCols()];
		// Get no more random than 1/3 of the number of spots
		Random numbOfHash = new Random();
		int random = numbOfHash.nextInt((getNumCols() * getNumCols()) / 3);

		// Set array to random numbers of 1 - 100
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				maze[i][j] = "" + (numbOfHash.nextInt(100) + 1);
			}
		}

		// Set # to random spot in the 2d array
		for (int i = 0; i < random; i++) {
			int randomRow = numbOfHash.nextInt(getNumRows());
			int randomCol = numbOfHash.nextInt(getNumCols());
			maze[randomRow][randomCol] = "#";
		}

		// Set start and destination
		maze[0][0] = "S";
		maze[getNumRows() - 1][getNumCols() - 1] = "D";

		// Make the visited array
		visited = new Boolean[getNumRows()][getNumCols()];
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				visited[i][j] = false;
			}
		}

		// Print the maze
		printMaze();
	}

	/**
	 * Prints out the stored maze with the walls and coins available
	 */
	public void printMaze() {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				System.out.printf("%-4s", maze[i][j]);
			}
			System.out.println("");

		}

		// Empty Line
		System.out.println();
		// Call isSolvable
		isSolvable();
	}

	/**
	 * Calls the recursive solution, prints out the result, and number of coins
	 * picked up on the path
	 * 
	 * @return solved Whether or not a path was found
	 */
	public boolean isSolvable() {
		// Try to find a path
		boolean solved = solveMazeRecursively(0, 0);
		// Print solution if there is one
		if (solved) {
			printResult();
		} else
			System.out.println("There is not a path to the destination.");
		return solved;
	}

	/**
	 * Recursively solves the maze. Checks for all four directions of movement
	 * Changes the visited array if a position is valid for the path to the
	 * destination
	 * 
	 * @param row
	 *            Number of rows in the maze
	 * @param col
	 *            Number of columns in the maze
	 * @return True or False depending on if a path is found
	 */
	private boolean solveMazeRecursively(int row, int col) {
		// Fell off the array
		if (row < 0 || col < 0 || row > getNumRows() - 1 || col > getNumCols() - 1) {
			return false;
		}
		// At destination
		else if (maze[row][col].compareTo("D") == 0) {
			visited[row][col] = true;
			return true;
		}
		// You are trying to go back to an old path
		else if (visited[row][col]) {
			visited[row][col] = false;
			return false;
		}
		// You are at a Wall
		else if (maze[row][col].compareTo("#") == 0) {
			visited[row][col] = false;
			return false;
		}
		// General Recursion
		else {
			visited[row][col] = true;
			// Go right
			if (solveMazeRecursively(row, col + 1)) {
				visited[row][col] = true;
				return true;
			}
			// Go Down
			if (solveMazeRecursively(row + 1, col)) {
				visited[row][col] = true;
				return true;
			}
			// Go Left
			if (solveMazeRecursively(row, col - 1)) {
				visited[row][col] = true;
				return true;
			}
			// Go Up
			if (solveMazeRecursively(row - 1, col)) {
				visited[row][col] = true;
				return true;
			}
		}
		return false;
	}

	/**
	 * Prints the path that is found with walls and coins if the space is not in
	 * the path. + is printed for the path.
	 */
	public void printResult() {
		int coins = 0;
		// Rows
		for (int i = 0; i < visited.length; i++) {
			// Columns
			for (int j = 0; j < visited[i].length; j++) {
				// Print S
				if (i == 0 && j == 0)
					System.out.printf("%-4s", "S");
				// Print D
				else if (i == (getNumRows() - 1) && j == (getNumCols() - 1))
					System.out.printf("%-4s", "D");
				// Print + for the path
				else if (visited[i][j]) {
					coins += Integer.parseInt(maze[i][j]);
					System.out.printf("%-4s", "+");
				}
				// Print points
				else
					System.out.printf("%-4s", maze[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		// Print out the coins
		System.out.println("Total Coins: " + coins);
	}

}
