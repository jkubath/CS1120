package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	/**
	 * This method will create and return a proper object representing an
	 * expression, according to the arguments received by the parameters.
	 * 
	 * @param operator
	 *            The operator character parameter of an expression.
	 * @param val1
	 *            The left hand integer literal of an expression.
	 * @param val2
	 *            The right hand integer literal of an expression.
	 * @return A Binary object that holds the data for the expression
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {

		IExpression left = new Literal(val1); // creates a literal object that
												// stores the left integer
												// literal.
		IExpression right = new Literal(val2); // creates a literal object that
												// stores the right integer
												// literal.

		/*
		 * Must initialize op with a placeholder at the beginning, but op will
		 * reference the proper object when the read character is evaluated by
		 * the switch.
		 */
		IOperation op = new Addition();

		// switch statement determines which object to create and assign by the
		// read operator character.
		switch (operator) {
		case '+': {
			op = new Addition();
			break;
		}
		case '-': {
			op = new Subtraction();
			break;
		}
		default:
			// returns a literal in case if there is no operator for a future
			// .dat file.
			return new Literal(val1);
		}

		return new BinaryExpression(left, right, op);
	}

}
