package com.lang;

import java.util.Set;
import java.util.TreeSet;

public class Function1 {
	public static void main(String[] args) {
		Set<Object> a = new TreeSet<Object>();

		a.add(12);
		a.add(45);
		a.add(56);
		// add
		System.out.println(a);

		// size
		int size = a.size();
		System.out.println(size);

		// remove
		a.remove(56);
		System.out.println(a);

		// contains
		boolean contains = a.contains(345678);
		System.out.println(contains);

		Set<Object> a1 = new TreeSet<Object>();

		a1.add(8765);
		a1.add(98);

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
