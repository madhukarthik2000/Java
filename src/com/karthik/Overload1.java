package com.karthik;

public class Overload1 extends Overload {
	public void collegename() {
		System.out.println("JIT");

	}

	public void Deptname() {
		System.out.println("CSE");
		System.out.println("A");

	}

	public static void main(String[] args) {
		Overload1 a = new Overload1();

		a.collegename();
		a.Deptname();
		a.name();
	}

}
