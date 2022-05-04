package com.abstracts;

public class Interface_Method1 implements Interface_Method {

	@Override
	public void studentsname() {
		System.out.println("Karthik");

	}

	@Override
	public void rollno() {
		System.out.println(12);

	}

	@Override
	public void dept() {
		System.out.println("CSE");

	}

	@Override
	public void mark() {
		System.out.println(421);

	}

	@Override
	public void grade() {
		System.out.println('A');

	}

	public static void main(String[] args) {
		Interface_Method1 a = new Interface_Method1();
		a.studentsname();
		a.rollno();
		a.dept();
		a.mark();
		a.grade();
	}

}
