package com.abstracts;

public class Abstract_Method1 extends Abstract_Method {

	@Override
	void currentaccount() {
		System.out.println("current account number is: 6237909875");

	}

	@Override
	void saving() {
		System.out.println("savings balance is: 500");

	}

	@Override
	public void branchname() {
		System.out.println("Dharmapuri");
		super.branchname();
	}

	public static void main(String[] args) {
		Abstract_Method1 a = new Abstract_Method1();
		a.currentaccount();
		a.saving();
		a.branchname();
	}

}
