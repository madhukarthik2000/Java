package com.single;

public class Single1 extends Single {

	public void myname() {
		System.out.println("Karthik");
	}

	public void brothername() {
		System.out.println("Surya");

	}

	public static void main(String[] args) {
		Single1 A = new Single1();
		A.fathername();
		A.mothername();
		A.brothername();
		A.myname();
	}

}
