package edu.wmich.cs1120.JonahKubath.LA7;

import java.io.IOException;
import java.util.ArrayList;

public interface IDecoder {
	// Implemented by class Decoder
	// Setter for the postfix (arithmetic) expression array list
	void setPostfixExpressions(ArrayList<IPostFixExpression> expressions);

	// This method reads the expression from the input file and stores
	// it in a String, creates a Postfix object and sets the
	// expression attribute for the Postfix object, and add the expression
	// to the ArrayList.
	void processExpressions(String fileName) throws IOException;

	// Iterate the ArrayList and and prints out the result of expressions,
	// which is returned by the calculateResult method.
	void printResults();
}
