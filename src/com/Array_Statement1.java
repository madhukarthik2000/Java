package com;

public class Array_Statement1 {
	public static void main(String[] args) {
		int bus[] = new int[5];
		bus[0] = 10;
		bus[1] = 20;
		bus[2] = 30;
		bus[3] = 40;
		bus[4] = 50;

		for (int i = 0; i < bus.length; i++) {

			for (int j = i + 1; j < bus.length; j++) {
				if (bus[i] > bus[j]) {
				int temp = bus[i];
				bus[i] = bus[j];
				bus[j] = temp;
			}

		}
		}
		for (int i = 0; i < bus.length; i++) {
			System.out.println(bus[i]);
		}

	}
}