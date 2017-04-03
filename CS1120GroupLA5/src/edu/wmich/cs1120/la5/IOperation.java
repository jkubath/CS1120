package edu.wmich.cs1120.la5;

public interface IOperation {
	/**
	 * perform the operation accordingly and return the value
	 * 
	 * @param left
	 *            reference to the representation of the left-hand integer
	 *            literal.
	 * @param right
	 *            reference to the representation of the right-hand integer
	 *            literal.
	 * @return the reference of an integer result of the performed expression.
	 */
	Integer perform(IExpression left, IExpression right);
}
