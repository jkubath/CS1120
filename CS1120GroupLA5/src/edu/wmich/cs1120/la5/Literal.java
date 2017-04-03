package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	// Holds one of the numbers of the dat file expression
	private Integer value;

	/**
	 * This method is used to create an object representing an integer literal
	 * of an expression and sets the local integer literal value.
	 * 
	 * @param value
	 *            One of the numbers in the expression.
	 */
	public Literal(Integer value) {
		this.value = value;
	}

	/**
	 * Returns the stored integer literal value.
	 * 
	 * @return value A number from the expression.
	 */
	@Override
	public Integer getValue() {

		return value;
	}

}
