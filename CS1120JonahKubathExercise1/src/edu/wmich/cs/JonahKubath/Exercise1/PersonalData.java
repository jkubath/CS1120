/**
 * Name: Personal Data Object
 * Author: Jonah Kubath
 * Date: January 12, 2017
 */
package edu.wmich.cs.JonahKubath.Exercise1;

public class PersonalData {
	private String name;
	private String address;
	private int age;
	private long phoneNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	/**
	 * Prints out all the information stored for the object
	 * Formats the phone number to standard numbers
	 */
	public String toString(){
		System.out.printf("%-15s%s\n", "Name :",  getName());
		System.out.printf("%-15s%s\n", "Address :",  getAddress());
		System.out.printf("%-15s%d\n", "Age :", getAge());
		System.out.printf("%-15s%s\n", "Phone Number :", convertPhone(getPhoneNumber()));
		
		
		return null;
	}
	
	/**
	 * Formats the long phone number into a nice string
	 * @param number stored information in a long
	 * @return A string of a formatted phone number
	 */
	public String convertPhone(long number){
		int first =(int) number / 10000;
		int second =(int) number % 10000;
		String numberString = String.format("(%d)-%d", first, second);
		
		return numberString;
	}
	
}
