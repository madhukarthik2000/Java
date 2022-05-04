package com.Greens;

public class Four_Datatypes {
	int a = 543;
	int b = 987;

	public void add() {
		int c = a + b;
		System.out.println("Addition value of c;" + c);
	}

	public void sub() {
		int q = b - a;
		System.out.println("Suberation value of q;" + q);

	}

	public void multi() {
		int w = a * b;
		System.out.println("Multiple value of w;" + w);

	}

	public void Div() {
		int e = a % b;
		System.out.println("Divetion value of e;" + e);
	}

	public static void main(String[] args) {
		Four_Datatypes S = new Four_Datatypes();
		S.add();
		S.sub();
		S.multi();
		S.Div();

	}

}
