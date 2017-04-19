/**
 * Name: Post Fix Expression Decoder
 * Author: Jonah Kubath
 * Date: April 19, 2017
 */
package edu.wmich.cs1120.JonahKubath.LA7;

public class PostFixExpression implements IPostFixExpression {
	private String expression = "";
	private IStack<Integer> stack = new Stack<Integer>();

	/**
	 * Uses the saved expression and returns the result
	 * 
	 * @return Result The final result of the expression
	 */
	@Override
	public int calculateResult() {
		// Run through the expression and push every char to the stack
		// temp array
		String temp[] = new String[expression.length()];
		temp = expression.split(",");
		String tempString = "";

		for (int i = 0; i < temp.length; i++) {
			// Push onto stack
			// Trim spaces
			tempString = temp[i];
			int right = 0;
			int left = 0;
			switch (tempString) {
			case "+":
				right = stack.pop();
				left = stack.pop();
				// System.out.println(left + " + " + right);
				stack.push(left + right);
				break;
			case "-":
				right = stack.pop();
				left = stack.pop();
				// System.out.println(left + " - " + right);
				stack.push(left - right);
				break;
			case "*":
				right = stack.pop();
				left = stack.pop();
				// System.out.println(left + " * " + right);
				stack.push(left * right);
				break;
			case "/":
				right = stack.pop();
				left = stack.pop();
				// System.out.println(left + " / " + right);
				stack.push(left / right);
				break;
			default:
				stack.push(Integer.parseInt(tempString));
				break;
			}

		}
		// Return the total
		return stack.pop();
	}

	/**
	 * Returns the held expression
	 * 
	 * @return expression The string that holds the expression
	 */
	@Override
	public String getPostfixExpression() {
		return expression;
	}

	/**
	 * Takes in the expression and saves it
	 * 
	 * @param expression
	 *            The string to save as the expression
	 */
	@Override
	public void setPostfixExpression(String expression) {
		this.expression = expression;

	}

	/**
	 * Takes in a stack object and saves it locally
	 * 
	 * @param stack
	 *            Stack object to be saved
	 */
	// Setter for the stack (attribute)
	public void setStack(IStack<Integer> stack) {
		this.stack = stack;
	}

	/**
	 * Returns the saved expression
	 * 
	 * @return expression The string that holds the expression
	 */
	public String getExpression() {
		return expression;
	}

}
