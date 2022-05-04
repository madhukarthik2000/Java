package com.abstracts;

public class Methodbasic_Class1 extends Methodbasic_Class {
	@Override
	public void personalloan() {
		System.out.println("laon numberis 97642124565");
		super.personalloan();
	}

	@Override
	public void homeloan() {
		System.out.println("Home loan is 34%");
		super.homeloan();
	}

	@Override
	public void carloan() {
		System.out.println("car loan is 2%");
		super.carloan();
	}

	public static void main(String[] args) {
		Methodbasic_Class1 a = new Methodbasic_Class1();
		a.personalloan();
		a.homeloan();
		a.carloan();
	}

}
