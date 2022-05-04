package com;

public class Switch_Statement {
	public static void main(String[] args) {
		int Friends = 2;

		switch (Friends) {
		case 1:
			int age = 20;
			if (age <= 18) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			break;
		case 2:
			int mark = 1200;
			if (mark > 500) {
				System.out.println("Eligibale of next class");
			} else {
				System.out.println("Not eligibale of next class");

			}
			int a = 100, b = 74, c = 350;
			if (a > 75) {
				System.out.println("pass\t" + a);
			} else {
				System.out.println("fail\t" + a);
			}
			if (b > 75) {
				System.out.println("pass\t" + b);
			} else {
				System.out.println("fail\t" + b);
			}
			if (c > 75) {
				System.out.println("pass\t" + c);
			} else {
				System.out.println("fail\t" + c);
			}
			break;
		case 3:
			System.out.println("Prem");
			break;
		case 4:
			System.out.println("1679");
			break;

		default:
			System.out.println("not value");
			break;
		}
	}

}
