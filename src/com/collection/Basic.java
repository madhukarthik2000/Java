package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Basic {
	public static void main(String[] args) {
		Set<Object> a= new LinkedHashSet<>();
		a.add(12);
		a.add(123);
		a.add('h');
		a.add("karthik");
		a.add("surya");
		// add
		System.out.println(a);

		// size
		int size = a.size();
		System.out.println(size);

		// remove
		a.remove("surya");
		System.out.println(a);

		// contains
		boolean contains = a.contains(12);
		System.out.println(contains);

		Set<Object> a1 = new LinkedHashSet<Object>();

		a1.add(14);
		a1.add(123);
		a1.add("kumar");
		a1.add("kumar");

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
