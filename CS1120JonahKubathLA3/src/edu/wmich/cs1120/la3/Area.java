/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

public class Area implements IArea {
	double basicEnergyCost;
	double elevation;
	double radiation;

	/**
	 * Returns the basicEnergyCost
	 * 
	 * @return basicEnergyCost Returns the stored basicEnergyCost taken from the
	 *         file
	 */
	@Override
	public double getBasicEnergyCost() {
		return basicEnergyCost;
	}

	/**
	 * Sets the basicEnergyCost
	 * 
	 * @param basicEnergyCost
	 *            takes in a double from the file
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
	}

	/**
	 * Returns the elevation
	 * 
	 * @return elevation Returns the stored elevation taken from the file
	 */
	@Override
	public double getElevation() {
		return this.elevation;
	}

	/**
	 * Sets the elevation
	 * 
	 * @param elevation
	 *            Takes in a double from the file
	 */
	@Override
	public void setElevation(double elevation) {
		this.elevation = elevation;

	}

	/**
	 * Returns the radiation level
	 * 
	 * @return radiation Returns the radiation level taken from the file
	 */
	@Override
	public double getRadiation() {
		return this.radiation;
	}

	/**
	 * Sets the radiation level
	 * 
	 * @param radiation
	 *            Takes in a double from the file
	 */
	@Override
	public void setRadiation(double radiation) {
		this.radiation = radiation;

	}

	/**
	 * Calculates the consumed Energy
	 * 
	 * @return total The total energy in that area
	 */
	@Override
	public double calcConsumedEnergy() {
		return 99999999;
	}

}
