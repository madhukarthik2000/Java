package com.Greens;

import java.util.Iterator;

public class For {
	public static void main(String[] args) {
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				System.out.print(col);

			}
			System.out.println();
		}

		System.out.println();
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 3; col++) {
				System.out.print(col);

			}
			System.out.print(row);
		}
		System.out.println();
		System.out.println();
		for (int row = 1; row <= 3; row++) {
			for (int col = 3; col >= 1; col--) {
				System.out.print(row);

			}
			System.out.println();
		}

		System.out.println();
		for (int row = 1; row <= 3; row++) {
			for (int col = 3; col >= 1; col--) {
				System.out.print(col);

			}
			System.out.println();
		}
		System.out.println();
		for (int i = 3; i >= 1; i--) {
			for (int j = 3; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	System.out.println();
	for(int i=1;i<=3;i++) {
		for(int j=1; j<=i;j++) {
			System.out.print(j);
		}
	System.out.println();
	}
	System.out.println();
	for (int i = 1; i <=3; i++) {
		for(int j=1;j<=i;j++) {
			
			System.out.print(i);
		}
	System.out.println();
	}
	
	
	
	
	
	}
}
