package edu.wmich.cs1120.JonahKubath.RandomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	public static void main(String[] args) throws IOException {
		readBAT("Expression1.dat");
	}

	/**
	 * Read the bat file and output the characters
	 * 
	 * @param fileName
	 *            The name of the bat file
	 * @throws IOException
	 *             File is not in the directory
	 */
	public static void readBAT(String fileName) throws IOException {
		RandomAccessFile read = new RandomAccessFile(fileName, "r");
		boolean stop = false;
		char num1;
		int goTo;

		while (!stop) {
			// Read the character at position 0
			num1 = read.readChar();
			// Output the character
			System.out.print(num1);
			// Go to the next position
			goTo = read.readInt();
			// -1000 is the stopping point
			if (goTo == -1000) {
				stop = true;
			} else
				// Go to the spot if the end is not found
				read.seek(goTo);

		}

		// Close the file
		read.close();
	}
}
