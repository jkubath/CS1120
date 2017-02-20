/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MapCreator implements IMapCreator {
	TerrainScanner scanner = new TerrainScanner();
	Area[][] areaMap = new Area[10][10];

	/**
	 * Takes in the fileName and threshold and declares the Level objects based
	 * on the information in the file. The object is then saved to a 2-dim array
	 * 
	 * @param fileName
	 *            The Name of the file to scan for the information
	 * @param threshold
	 *            The radiation level that user specifies
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		File read = new File(fileName);
		Scanner inFile = new Scanner(read);
		String tempLine;
		double numb1, numb2, numb3;
		int row = 0;
		int col = 0;
		String[] tempArray = new String[3];
		// Scan entire file
		while (inFile.hasNextLine()) {
			if (col == 10) {
				col = 0;
				row++;
			}
			// Read and split a line from the document
			tempLine = inFile.nextLine();
			tempArray = tempLine.split(" ");
			numb1 = Double.parseDouble(tempArray[0]);
			numb2 = Double.parseDouble(tempArray[1]);
			numb3 = Double.parseDouble(tempArray[2]);
			// Impossible
			if (numb3 >= threshold) {
				Area area1 = new HighArea();
				area1.setBasicEnergyCost(numb1);
				area1.setBasicEnergyCost(numb1);
				area1.setElevation(numb2);
				area1.setRadiation(numb3);
				areaMap[row][col] = area1;
			} else {
				// Possible
				if (numb3 > .5) {
					// HighArea * 4
					Area area1 = new HighArea();
					area1.setBasicEnergyCost(numb1);
					area1.setBasicEnergyCost(numb1);
					area1.setElevation(numb2);
					area1.setRadiation(numb3);
					areaMap[row][col] = area1;
				} else if (numb1 > threshold * .5) {
					// HighArea * 4
					Area area1 = new HighArea();
					area1.setBasicEnergyCost(numb1);
					area1.setBasicEnergyCost(numb1);
					area1.setElevation(numb2);
					area1.setRadiation(numb3);
					areaMap[row][col] = area1;
				} else {
					// LowArea * 2
					Area area1 = new LowArea();
					area1.setBasicEnergyCost(numb1);
					area1.setElevation(numb2);
					area1.setRadiation(numb3);
					area1.setBasicEnergyCost(numb1);
					areaMap[row][col] = area1;
				}

			}
			col++;
		}

		scanner.setTerrain(areaMap);
		// Print out the energyCost stored in the Area objects
		// for (int i = 0; i < areaMap.length; i++) {
		// for (int j = 0; j < areaMap[i].length; j++) {
		// System.out.print(areaMap[i][j].getBasicEnergyCost() + " ");
		// }
		// System.out.println();
		// }

		// Close file
		inFile.close();
	}

	/**
	 * Returns the TerrainScanner object
	 * 
	 * @return TerrainScanner
	 */
	@Override
	public TerrainScanner getScanner() {
		return this.scanner;
	}

	/**
	 * Sets the TerrainScanner obect
	 * 
	 * @param TerrainScanner
	 *            scanner
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}

}
