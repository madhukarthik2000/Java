package com.karthik;

public class Upcasting_M2 extends Upcasting_M {
	public void Fathername() {
		System.out.println("Madhu");

	}

	public void Mothername() {
		System.out.println("Selvi");
	}

	@Override
	public void Name() {

		super.Name();
	}

	public static void main(String[] args) {
		Upcasting_M a = new Upcasting_M2();
		a.Name();
		a.BrotherName();

	}

}
