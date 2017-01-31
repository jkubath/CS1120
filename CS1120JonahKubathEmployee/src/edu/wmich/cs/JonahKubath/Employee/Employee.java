/**
 * Name: Employee Classes
 * Author: Jonah Kubath
 * Date: January 31, 2017
 */
package edu.wmich.cs.JonahKubath.Employee;

public class Employee {
	private String employeeName;
	private String employeeNumb;
	private String hireDate;

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeNumb() {
		return employeeNumb;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeNumb(String employeeNumb) {
		this.employeeNumb = employeeNumb;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String toString() {
		String print = String.format("%s%s\n%s%s\n%s%s", "Employee Name: ", getEmployeeName(), "Employee Number: ",
				getEmployeeNumb(), "Hire date: ", getHireDate());

		return print;

	}
}
