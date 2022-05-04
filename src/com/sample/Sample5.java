package com.sample;

public class Sample5 {
	public static void main(String[] args) {
		int num = 9871789;
		int temp = num; 
		int rev = 0;
		while (num > 0) {
			int n = num % 10;
			rev = (rev * 10) + n;
			num /= 10;

		}
		if (rev == temp) {
			System.out.println("polindrome");
		} else {

			System.out.println("not polindrome");

		}

	}
}
