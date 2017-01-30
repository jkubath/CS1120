/**
 * Name: Maze Recursion
 * Author: Jonah Kubath
 * Date: January 25, 2017
 * Reference: N/A
 */
package edu.wmich.cs.JonahKubath.Maze;

public class LA2Main {

	public static void main(String[] args) {
		// Create a MazeSolver object
		MazeSolver first = new MazeSolver();
		// Create a MazeInput object
		MazeInput mazeInput = new MazeInput();
		// Get information from user and save in MazeSolver object
		mazeInput.initializeMazeSolver(first);
		// Close the scanner used in MazeInput
		mazeInput.closeScanner();
	}

}
