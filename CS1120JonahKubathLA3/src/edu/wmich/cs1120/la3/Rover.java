/**
 * Name: Rover Exploration
 * Author: Jonah Kubath
 * Date: February 8, 2017
 */
package edu.wmich.cs1120.la3;

//import java.awt.geom.Area;
import java.util.ArrayList;

public class Rover implements IRover {
	ArrayList<Area> area;
	MapCreator map;

	/**
	 * Returns the MapCreator Object
	 * 
	 * @return MapCreator Returns the stored MapCreator object
	 */
	@Override
	public MapCreator getMapCreator() {
		return this.map;
	}

	/**
	 * Sets the MapCreator
	 * 
	 * @param MapCreator
	 *            The MapCreator object
	 */
	@Override
	public void setMapCreator(MapCreator mc) {
		this.map = mc;
	}

	/**
	 * Returns the ArrayList of the Area type
	 * 
	 * @return ArrayList<Area> The found Path
	 */
	@Override
	public ArrayList<Area> getPath() {
		return this.area;
	}

	/**
	 * Takes the TerrainScanner and copies the pointer to the returned ArrayList
	 * 
	 * @param startRow
	 *            Starting Row given by the user
	 * @param startCol
	 *            Starting Col given by the user
	 */
	@Override
	public void setPath(int startRow, int startCol) {
		TerrainScanner ts = map.getScanner();
		area = ts.getPath(startRow, startCol);
	}

	/**
	 * Returns total energy of the path
	 * 
	 * @return calculateEnergy Total energy of the Path
	 */
	@Override
	public double calculateEnergy() {
		double energy = 0;
		for (int i = 0; i < area.size(); i++) {
			energy += area.get(i).getBasicEnergyCost();
		}
		return energy;
	}

}
