package edu.wmich.cs.JonahKubath.Class;

public class Customer extends Person {
	private int customerNum;
	private boolean mail;

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public void setMail(boolean mail) {
		this.mail = mail;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	public boolean getMail() {
		return mail;
	}

	/**
	 * @override
	 */
	public String toString() {
		String customerInfo = String.format("%s\n%s%s\n%s%b", super.toString(), "Customer Number :", getCustomerNum(),
				"Mailing List :", getMail());

		return customerInfo;
	}
}
