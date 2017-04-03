package edu.wmich.cs1120.la5;

public class LowArea extends Area {

	/**
	 * This method gets the value of the basic energy cost in the area and
	 * multiplies it by two to yield the calculation of the energy consumed in a
	 * low area.
	 * 
	 * @return the value of the energy consumed by a rover traveling in a low
	 *         area.
	 */
	@Override
	public double calcConsumedEnergy() {
		return getBasicEnergyCost() * 2;
	}

}
