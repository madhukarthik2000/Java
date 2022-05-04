package com.sample;

public class Sample3 {
	public static void main(String[] args) {
		int count=0;
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				count++;
				sum +=i;
				System.out.println(i);

			}

		}
		System.out.println(count);
		System.out.println(sum);
	}

}
