package com.abstracts;

import java.util.Scanner;

public class Scanner_Class {
	public static void main(String[] args) {

		Scanner car = new Scanner(System.in);

		System.out.println("Enter the Name");
		String nextLine = car.nextLine();
		System.out.println(nextLine);

		System.out.println("Enter the number");
		int nextInt = car.nextInt();
		System.out.println(nextInt);

		System.out.println("Float value");
		float nextFloat = car.nextFloat();
		System.out.println(nextFloat);

		System.out.println("Byte value");
		byte nextByte = car.nextByte();
		System.out.println(nextByte);

		System.out.println("Next value");
		String next = car.next();
		System.out.println(next);

	}

}
