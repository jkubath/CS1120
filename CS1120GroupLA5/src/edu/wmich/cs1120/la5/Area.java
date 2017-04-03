package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {

	private double basicEnergyCost; // the basic energy cost for a rover to
									// travel in an area on the map.
	private double elevation; // the elevation of an area on the map.
	private double radiation; // the radiation level in an area on the map.

	/**
	 * This method accesses the basic energy cost value stored into this area
	 * instance through the MapCreator scanTerrain method.
	 * 
	 * @return the basic energy cost value stored in this area instance.
	 */
	public double getBasicEnergyCost() {

		return this.basicEnergyCost;
	}

	/**
	 * This method sets the basic energy cost value read and parsed from a line
	 * in the input data file, to this area instance.
	 * 
	 * @param basicEnergyCost
	 *            the parsed basic energy cost value read from the input data
	 *            file and passed into the parameter.
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {

		this.basicEnergyCost = basicEnergyCost;

	}

	/**
	 * This method accesses the elevation value stored into this area instance
	 * through the MapCreator scanTerrain method.
	 * 
	 * @return the elevation value stored in this area instance.
	 */
	public double getElevation() {

		return this.elevation;
	}

	/**
	 * This method sets the elevation value read and parsed from a line in the
	 * input data file, to this area instance.
	 * 
	 * @param elevation
	 *            the parsed elevation value read from the input data file and
	 *            passed into the parameter.
	 */
	public void setElevation(double elevation) {

		this.elevation = elevation;

	}

	/**
	 * This method accesses the radiation value stored into this area instance
	 * through the MapCreator scanTerrain method.
	 * 
	 * @return the radiation value stored in this area instance.
	 */
	public double getRadiation() {

		return this.radiation;
	}

	/**
	 * This method sets the radiation value read and parsed from a line in the
	 * input data file, to this area instance.
	 * 
	 * @param radiation
	 *            the parsed radiation value read from the input data file and
	 *            passed into the parameter.
	 */
	public void setRadiation(double radiation) {

		this.radiation = radiation;

	}

	/**
	 * This method will calculate and return the energy consumed in an area
	 * accordingly.
	 * 
	 * @return the calculated energy consumed by an area.
	 */
	@Override
	public abstract double calcConsumedEnergy();

}
