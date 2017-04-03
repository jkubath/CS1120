package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	// This class is responsible for providing the “total energy cost”
	// of the path.

	private ArrayList<IArea> path; // holds place for an area array list to be
	// referenced

	private String analysis; // holds place for a string representing the path
								// analysis.

	/**
	 * This method analyzes the path by calculating the total energy expended
	 * during its crossing. The method also stores the analysis with the
	 * analysis setter.
	 */
	@Override
	public void analyzePath() {

		double totEnergy = 0; // accumulator for the total of energy spent in
								// the path initialized to 0.
		String energyAnalysis = ""; // initializes the local analysis variable
									// with empty space.

		// for loop used to add the energy spent over each area in the path.
		for (int index = 0; index < path.size(); index++) {
			totEnergy += path.get(index).calcConsumedEnergy();
		}

		energyAnalysis += totEnergy; // Stores the calculated energy consumption
										// total to the analysis.

		// sets the analysis with the consumed path energy and analyzer name.
		this.setAnalysis(this.toString() + energyAnalysis.trim());

	}

	/**
	 * This method gets the String of the analysis stored by the analyzer.
	 * 
	 * @return the String representation of the analysis.
	 */
	@Override
	public String getAnalysis() {

		return analysis;
	}

	/**
	 * This method sets the String representation of the analysis obtained by
	 * this analyzer.
	 * 
	 * @param analysis
	 *            the String representation of the total energy consumed in the
	 *            path.
	 */
	@Override
	public void setAnalysis(String analysis) {

		this.analysis = analysis;

	}

	/**
	 * This method retrieves the pointer to the stored path.
	 * 
	 * @return the location of the path object referenced.
	 */
	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}

	/**
	 * This method sets the path field by passing the pointer passed into the
	 * parameter during the method call, into the path variable.
	 * 
	 * @param path
	 *            the variable holding the path pointer passed to it.
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {

		this.path = path;

	}

	/**
	 * This method returns the name of this analyzer.
	 * 
	 * @return the String object of the name of the analyzer.
	 */
	@Override
	public String toString() {

		return "Energy Analyzer: ";

	}

}
