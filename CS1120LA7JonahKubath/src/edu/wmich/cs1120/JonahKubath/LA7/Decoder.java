/**
 * Name: Post Fix Expression Decoder
 * Author: Jonah Kubath
 * Date: April 19, 2017
 */
package edu.wmich.cs1120.JonahKubath.LA7;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Decoder implements IDecoder {
	private ArrayList<IPostFixExpression> array = new ArrayList<IPostFixExpression>();

	/**
	 * Default constructor
	 */
	public Decoder() {

	}

	// This method reads the expression from the input file and stores
	// it in a String, creates a Postfix object and sets the
	// expression attribute for the Postfix object, and add the expression
	// to the ArrayList.
	/**
	 * Takes in the designated file and reads the data Adds the read data to the
	 * IPostFixExpression array
	 * 
	 * @param fileName
	 *            The name of the file to be read from
	 */
	@Override
	public void processExpressions(String fileName) throws IOException {
		RandomAccessFile file = new RandomAccessFile(fileName, "r");
		// Exit file at -1000
		// Expression divider
		int position = 0;
		boolean contExp = true;
		boolean contFile = true;
		int count = 0;
		// Character being read
		char temp = ' ';
		String expression;
		file.seek(0);
		while (contFile) {
			// Create a new expression object
			array.add(new PostFixExpression());
			// Reset expression
			expression = "";
			// Reset continue boolean
			contExp = true;
			while (contExp) {
				// file.readChar();
				temp = file.readChar();
				// Add the character to the expression
				expression += temp;
				// Seek to the integer right after the character
				position = file.readInt();
				// Should we continue?
				if (position == -1) {
					// Exit expression loop
					contExp = false;
				} else if (position < -1) {
					// Exit both loops
					contExp = false;
					contFile = false;
				} else
					file.seek(position);

			}
			// Save the string to the PostFixObject
			array.get(count).setPostfixExpression(expression);
			// Iterate my counter for number of Expressions
			count++;
		}
		// Close file
		file.close();
	}

	/**
	 * Prints out the result of the expression
	 */
	@Override
	public void printResults() {
		System.out.println("Number of Expression: " + array.size());
		System.out.println("-----------------------");
		for (int i = 0; i < array.size(); i++) {
			System.out.println("Expression " + (i + 1) + ": " + array.get(i).getPostfixExpression());
			System.out.println("Result : " + array.get(i).calculateResult());
		}

	}

	/**
	 * Sets the expression array
	 */
	@Override
	public void setPostfixExpressions(ArrayList<IPostFixExpression> expressions) {
		array = expressions;

	}

}
