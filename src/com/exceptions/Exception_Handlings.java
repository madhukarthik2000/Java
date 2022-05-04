package com.exceptions;

public class Exception_Handlings {
	public static void main(String[] args) {

		// Arithmetic exception
		int a = 10;
		String s=null;
		try {
			try {

			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
			}
			System.out.println(a / 0);
			System.out.println(s.length());
		} catch (java.lang.ArithmeticException e) {

			e.printStackTrace();
		} catch (Throwable e) {

		} finally {
			System.out.println("process complete");
		}
	}
}
