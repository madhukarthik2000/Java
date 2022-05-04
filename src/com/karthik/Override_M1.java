package com.karthik;

public class Override_M1 extends Override_M {

	@Override
	public void name(int a) {

		System.out.println(a);
		super.name(a);
	}

	@Override
	public void name(float f) {
		System.out.println("Bonus");
		System.out.println(f);
		super.name(f);
	}

	@Override
	public void name() {
		System.out.println("Enter the name");
		super.name();
	}

	public static void main(String[] args) {
		Override_M1 a = new Override_M1();
		a.name(50000);
		a.name(56464.567f);
		a.name();
	}

}
