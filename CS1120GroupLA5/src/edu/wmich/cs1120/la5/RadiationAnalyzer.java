package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	// This class is responsible for providing the “total radiation” of
	// the path.

	private ArrayList<IArea> path; // holds place for an area array list to be
	// referenced

	private String analysis; // holds place for a string representing the path
								// analysis.

	/**
	 * This method analyzes the path by calculating the total radiation
	 * encountered in it. The method also stores the analysis with the analysis
	 * setter.
	 */
	@Override
	public void analyzePath() {

		double totalRad = 0; // accumulator for the total path radiation,
								// initialized to 0.
		String radAnalysis = ""; // radiation analysis local variable
									// initialized with empty space.

		// for loop accumulates each area radiation value in the path to get the
		// total.
		for (int index = 0; index < path.size(); index++) {
			totalRad += path.get(index).getRadiation();
		}

		radAnalysis += totalRad; // converts and stores the total radiation as a
									// String.

		// sets the analysis with the total path radiation and name of the
		// analyzer.
		this.setAnalysis(this.toString() + radAnalysis.trim());

	}

	/**
	 * This method gets the String representative of the analysis of this
	 * analyzer.
	 * 
	 * @return the String of the analysis.
	 */
	@Override
	public String getAnalysis() {
		return this.analysis;
	}

	/**
	 * This method sets the String representation of the analysis obtained by
	 * this analyzer.
	 * 
	 * @param analysis
	 *            String representation of the total radiation of the path
	 */
	@Override
	public void setAnalysis(String analysis) {

		this.analysis = analysis;

	}

	/**
	 * This method retrieves the pointer to the stored path.
	 * 
	 * @return the pointer to the path object.
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
	 * This method returns the String of the name of the current analyzer.
	 * 
	 * @return The string of the name of the current analyzer.
	 */
	@Override
	public String toString() {

		return "Radiation Analyzer: ";

	}

}
