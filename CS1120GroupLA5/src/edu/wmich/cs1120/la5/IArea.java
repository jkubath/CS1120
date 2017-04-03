package edu.wmich.cs1120.la5;

public interface IArea {

	/**
	 * This method returns the double type value of an area's basic energy cost.
	 * 
	 * @return the value of the basic energy cost of the area.
	 */
	double getBasicEnergyCost();

	/**
	 * This method sets the basic energy cost of an area with the value passed
	 * to the parameter.
	 * 
	 * @param basicEnergyCost
	 *            a value of an area's basic energy cost.
	 */
	void setBasicEnergyCost(double basicEnergyCost);

	/**
	 * This method accesses the elevation value stored into this area instance.
	 * 
	 * @return the elevation value stored in this area instance.
	 */
	double getElevation();

	/**
	 * This method sets the elevation of an area with the value passed to the
	 * parameter.
	 * 
	 * @param elevation
	 *            a value of an area's elevation.
	 */
	void setElevation(double elevation);

	/**
	 * This method accesses the radiation value stored into this area instance.
	 * 
	 * @return the radiation value stored in this area instance.
	 */
	double getRadiation();

	/**
	 * This method sets the radiation of an area with the value passed to the
	 * parameter.
	 * 
	 * @param radiation
	 *            a value of an area's radiation.
	 */
	void setRadiation(double radiation);

	/**
	 * This method will calculate and return the energy consumed in an area
	 * accordingly.
	 * 
	 * @return the calculated energy consumed by an area.
	 */
	double calcConsumedEnergy();
}
