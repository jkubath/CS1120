package edu.wmich.cs.JonahKubath.Class;

public class Person {
	private String name;
	private String address;
	private long phoneNum;

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String toString() {
		String info = String.format("%s%s\n%s%s\n%s%d", "Name :", getName(), "Address :", getAddress(),
				"Phone Number :", getPhoneNum());

		return info;
	}

}
