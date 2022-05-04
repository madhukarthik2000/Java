package com;

import java.util.Scanner;

public class Elseif_Statement {
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		if (mark > 1200) {
			System.out.println("  Fail ");
		} else if (mark>= 150) {
			System.out.println("All subject pass");
		} else if (mark>= 1200) {

			System.out.println("All subject pass");
		} else if (mark < 150) {
			System.out.println(" All  subject fail");

		} else {
			System.out.println("not value");
		}

	}
}
