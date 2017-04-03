package edu.wmich.cs1120.la5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	private TerrainScanner scanner = new TerrainScanner(); // created
															// TerrainScanner to
															// access terrain
															// setter.
	private IArea[][] area = new IArea[10][10]; // predetermined 10x10 size
												// array for simulating map
												// conditions

	/**
	 * This method reads from the data file named by the user in the GUI and
	 * parses the data in each line to be stored in area objects that will make
	 * up the map areas stored in the 2-d array.
	 * 
	 * @param fileName
	 *            the String reference of the file name entered in the GUI
	 * @param threshold
	 *            the threshold value entered by the user in the GUI
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {

		String[] fileLine; // String array to be used as for temporarily storing
							// file line data.
		double basicEnergyCost, elevation, radiation; // area data read from the
														// file.
		int row = 0, col = 0; // the row and column indices of the 2-d area
								// array.
		IArea square; // unassigned area reference variable to accept area
						// object
						// locations later.

		File theFile = new File(fileName); // creates a file object that
											// connects to the input file.
		Scanner inFile = new Scanner(theFile); // Scanner object created to read
												// from the input file.

		// while loop determines if there is another line to read in the file
		// and seeds array with data.
		while (inFile.hasNext()) {

			fileLine = inFile.nextLine().split(" "); // line data is split into
														// separate elements

			// order of the data read was predetermined by the project
			// instructions.
			basicEnergyCost = Double.parseDouble(fileLine[0]); // stores the
																// basicEnergy
																// String as a
																// double
			elevation = Double.parseDouble(fileLine[1]); // stores the elevation
															// String as a
															// double
			radiation = Double.parseDouble(fileLine[2]); // stores the radiation
															// String as a
															// double

			// condition for determining high or low areas to be referenced
			if (radiation > 0.5 || (radiation < 0.5 && elevation > (0.5 * threshold))) {
				square = new HighArea(); // assigns location of high area
											// object.
			} else {
				square = new LowArea(); // assigns location of low area object.
			}

			square.setBasicEnergyCost(basicEnergyCost); // stores the energy
														// data in the
														// referenced area
														// object
			square.setElevation(elevation); // stores the elevation data in the
											// referenced area object
			square.setRadiation(radiation); // stores the radiation data in the
											// referenced area object

			area[row][col] = square; // sets the area object reference to the
										// current element of the loop

			/*
			 * Increments the column counter to cause the next area object
			 * referenced to have its location stored in the next element in
			 * left-right linear order of the associated row.
			 */
			col++;

			/*
			 * Checks condition if the column count has gone past the row size,
			 * manually incrementing the row counter to the next row and
			 * resetting the column counter to the first column index
			 */
			if (col == area.length) {
				row++;
				col = 0;
			}

		}

		scanner.setTerrain(area); // sets the terrain with the area data.

		inFile.close(); // closes the scanner used to read the file
	}

	/**
	 * This method accesses the reference to a TerrainScanner object.
	 * 
	 * @return the reference to the TerrainScanner object.
	 */
	@Override
	public TerrainScanner getScanner() {

		return this.scanner;
	}

	/**
	 * This method sets the location of a TerrainScanner object by passing the
	 * address fed into the parameter from its associated argument from the
	 * method call.
	 * 
	 * @param scanner
	 *            a reference variable to a TerrainScanner object
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;

	}

}
