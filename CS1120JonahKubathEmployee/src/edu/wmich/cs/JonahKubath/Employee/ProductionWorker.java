package edu.wmich.cs.JonahKubath.Employee;

public class ProductionWorker extends Employee {

	/**
	 * Name: Employee Classes Author: Jonah Kubath Date: January 31, 2017
	 */
	private String shift;
	private double hourlyPay;

	public String getShift() {
		return shift;
	}

	public void setShift(int shift) {
		if (shift == 1) {
			this.shift = "Morning";
		} else
			this.shift = "Night";
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	/**
	 * @override override the super to String
	 */
	public String toString() {
		String print = String.format("%s\n%s%s\n%s%.2f", super.toString(), "Shift: ", getShift(), "Hourly Pay: ",
				getHourlyPay());
		return print;
	}
}
