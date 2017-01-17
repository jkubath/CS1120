/*
 * Name: Personal Data Class
 * Author: Jonah Kubath
 * Date: January 12, 2017
 */
package edu.wmich.cs.JonahKubath.Exercise1;

public class Exercise1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Personal Data Program\n");
		
		//Create object
		PersonalData person1 = new PersonalData();
		person1.setName("Jonah Kubath");
		person1.setAddress("4595 Lincoln Avenue");
		person1.setAge(20);
		person1.setPhoneNumber(1234567);
		
		PersonalData person2 = new PersonalData();
		person2.setName("John");
		person2.setAddress("1234 Western Street");
		person2.setAge(40);
		person2.setPhoneNumber(2223333);
		
		PersonalData person3 = new PersonalData();
		person3.setName("Troy");
		person3.setAddress("4444 Computer Science Lane");
		person3.setAge(22);
		person3.setPhoneNumber(5553456);
		
		//Print info
		person1.toString();
		//Add a line
		System.out.println();
		person2.toString();
		//Add a line
		System.out.println();
		//Add a line
		person3.toString();
		System.out.println();
		
	}

}
