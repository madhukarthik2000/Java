package com.lang;

import java.util.Set;
import java.util.TreeSet;

public class Function {
	public static void main(String[] args) {
		Set<Object> a = new TreeSet<Object>();
		
		a.add("karthik");
		a.add("surya");
		a.add("prem");
		// add
		System.out.println(a);

		// size
		int size = a.size();
		System.out.println(size);

		// remove
		a.remove("surya");
		System.out.println(a);

		// contains
		boolean contains = a.contains("partiban");
		System.out.println(contains);

		Set<Object> a1 = new TreeSet<Object>();

	    a1.add("prabu");
		a1.add("sivamani");

		// addall
		a.addAll(a1);
		System.out.println(a);

		// retainall
		a.retainAll(a1);
		System.out.println(a);

		// removeall
		a.removeAll(a1);
		a.add(987);
		System.out.println(a);

		// clear
		a.clear();
		System.out.println(a);
	}

}
