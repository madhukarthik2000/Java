package com.exceptions;

public class Example_Program55 {
	private void add() throws ArithmeticException {
		int marks = 30;
		if (marks >= 35) {
			System.out.println("pass");

		} else {
			System.out.println("fail");
			throw new ArithmeticException("Completed");

		}
	}

	public static void main(String[] args) throws ArithmeticException {
		Example_Program55 a = new Example_Program55();
		a.add();

	}

}
