package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Class_Collection {
	public static void main(String[] args) {
		List<Object> a = new ArrayList<Object>();

		a.add(12);
		a.add(123.45);
		a.add('h');
		a.add("karthik");
		a.add("Badboy");
		// add
		System.out.println(a);

		// size
		int size = a.size();
		System.out.println(size);

		// get
		Object object = a.get(3);
		System.out.println(object);

		// set
		a.set(4, "surya");
		System.out.println(a);

		// remove
		a.remove("surya");
		System.out.println(a);

		// indexof
		int indexOf = a.indexOf("karthik");
		System.out.println(indexOf);

		// contains
		boolean contains = a.contains(12);
		System.out.println(contains);

		List<Object> a1 = new ArrayList<Object>();

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
