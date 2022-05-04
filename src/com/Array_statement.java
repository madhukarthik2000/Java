package com;

public class Array_statement {
	public static void main(String[] args) {
		int car[] = new int[8];
		car[0] = 10;
		car[1] = 11;
		car[2] = 21;
		car[3] = 31;
		car[4] = 41;
		car[5] = 51;
		car[1] = 11;
		car[1] = 11;
		car[1] = 81;
		car[2] = 111;
		car[3] = 331;
		car[6] = 61;
		car[7] = 71;

		int length = car.length;
		System.out.println(length);
		for (int i =0; i < car.length; i++) {

			System.out.println(car[i]);
		}
	}

}
