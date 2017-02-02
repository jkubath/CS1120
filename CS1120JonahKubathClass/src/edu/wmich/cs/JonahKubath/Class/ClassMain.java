package edu.wmich.cs.JonahKubath.Class;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer person1 = new Customer();
		person1.setAddress("1234 Hello Lane");
		person1.setName("John Adam");
		person1.setPhoneNum(1234567890);

		person1.setMail(true);
		person1.setCustomerNum(11111);

		System.out.println(person1.toString());
	}

}
