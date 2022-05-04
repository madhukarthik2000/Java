package com.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class All_Exception {
	public static void main(String[] args) {

		// Arithmetic exception
//		int a=50;
//		System.out.println(a/0);

		// null pointer exception
//		String s=null;
//		System.out.println(s.length());

		// ArrayindexoutofBoundsExceotion
//		int a[]=new int[2];
//		System.out.println(a[3]);

		// stringindexoutofBoundsException
//		String s="karthik";
//		System.out.println(s.charAt(9));

		// IndexOutOfBoundsException
//		List<Object> l=new ArrayList<Object>();
//		l.add(59);
//		System.out.println(l.get(1));

		// NumberFormatException
//		String s="KARTHIK1223";
//		int parseInt = Integer.parseInt(s);
//		System.out.println(parseInt);
		
		//InputMismatchException
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the strings");
		int nextInt = Sc.nextInt();
		System.out.println(nextInt);

	}

}
