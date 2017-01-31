/**
 * Name: Employee Classes
 * Author: Jonah Kubath
 * Date: January 31, 2017
 */
package edu.wmich.cs.JonahKubath.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductionWorker work1 = new ProductionWorker();

		work1.setEmployeeName("Bob");
		work1.setEmployeeNumb("1111-L");
		work1.setHireDate("01-02-2000");
		work1.setShift(1);
		work1.setHourlyPay(20);

		System.out.println(work1.toString());
	}

}
