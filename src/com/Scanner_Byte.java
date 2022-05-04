package com;

import java.util.Scanner;

public class Scanner_Byte {
	public static void main(String[] args) {
		Scanner bus = new Scanner(System.in);

		System.out.println("Enter boolean value");
		boolean h = bus.nextBoolean();
		System.out.println("h");

		int age = 20;
		if (age <= 18) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
	}
}
