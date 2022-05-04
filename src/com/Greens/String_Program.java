package com.Greens;

public class String_Program {
	public static void main(String[] args) {
		String M = "Welcome To My Page";
		String M2 = "Thank You";

		// 13.substring
		String ss = M.substring(5);
		System.out.println(ss);

		// 14.isEmpty
		boolean em = M.isEmpty();
		System.out.println(em);

		// 15.split
		String[] split = M.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		// 16.trim-->
		String t = M.trim();
		System.out.println(t);

		// 17.compareTo-->

		String m1 = "s";
		String m2 = "l";
		int co = m1.compareTo(m2);
		System.out.println(co);

		// 18.concat

		String cc = M.concat(M2);
		System.out.println(cc);

		// 19.valueOf
		float a=123.456f;
		String va = M.valueOf(a);
		System.out.println(va);

		// 20.toCharArray-->
		char[] ch = M2.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i]);

		}
	}

}
