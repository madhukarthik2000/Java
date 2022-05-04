package com.Greens;

public class Valueof_String {
	public static void main(String[] args) {
		String M = "Welcomr To My Page";
		int a = 10;
		float b = 12.44f;
		double c = 1296;
		char d = 'A';
		long e = 987655433;

		String v1 = M.valueOf(a);
		System.out.println(v1);

		String v2 = M.valueOf(b);
		System.out.println(v2);

		String v3 = M.valueOf(c);
		System.out.println(v3);

		String v4 = M.valueOf(d);
		System.out.println(v4);

		String v5 = M.valueOf(e);
		System.out.println(v5);

	}

}
