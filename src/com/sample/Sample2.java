package com.sample;

public class Sample2 {
	public static void main(String[] args) {
		//count numbers
		int count=0;
		for (int i = 1; i <= 50; i++) {
			if (i%2==0) {
				count++;
				System.out.println(i+" even number");
				
			}
			else {
				System.out.println(i+" add number");
			}
			
		}
		System.out.println(count);
	}

}
