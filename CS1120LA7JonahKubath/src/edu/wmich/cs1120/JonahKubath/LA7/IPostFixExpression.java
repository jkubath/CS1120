package edu.wmich.cs1120.JonahKubath.LA7;

public interface IPostFixExpression {
	// Implemented by class
	// PostfixExpression
	// Calculate the result of the expression using a stack and return
	// the result
	int calculateResult();

	// Getter for the arithmetic expression in string format
	String getPostfixExpression();

	// Setter for the arithmetic expression in string format
	void setPostfixExpression(String expression);

	// Setter for the stack (attribute)
	void setStack(IStack<Integer> stack);
}
