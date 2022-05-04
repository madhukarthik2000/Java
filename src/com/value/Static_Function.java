package com.value;

public class Static_Function {
	static String game = "5";
	static int a;

	static private void add() {
		int a = 50;
		System.out.println(a);
	}

	static private void sub() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		add();
		sub();
		System.out.println(game);
	}

}
