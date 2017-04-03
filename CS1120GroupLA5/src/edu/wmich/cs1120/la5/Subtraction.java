package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	/**
	 * Performs the subtraction of the two values given by the number
	 * representations.
	 * 
	 * @param left
	 *            The representation of the number on the left of the
	 *            expression.
	 * @param right
	 *            The representation of the number on the right of the
	 *            expression.
	 * @return the integer value of the subtraction between the numbers stored
	 *         in the number representations.
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {

		return (left.getValue() - right.getValue());
	}

}
