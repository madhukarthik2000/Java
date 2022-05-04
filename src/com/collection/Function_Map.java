package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Function_Map {
	public static void main(String[] args) {
		Map<Object, Object> a = new HashMap<Object, Object>();
		// put
		a.put(1, "karthik");
		a.put(null, "kumar");
		a.put(2, "prem");
		a.put(null, 0);
		a.put(3, "karthik");
		a.put(4, null);
		a.put(5, null);
		System.out.println(a);

		// size
		int size = a.size();
		System.out.println(size);

		// get
		Object object = a.get(3);
		System.out.println(object);

		// keyset
		Set<Object> keySet = a.keySet();
		System.out.println(keySet);

		// values
		Collection<Object> values = a.values();
		System.out.println(values);

		// containskey
		boolean containsKey = a.containsKey(null);
		System.out.println(containsKey);

		// containsvalues
		boolean containsValue = a.containsValue("karthik");
		System.out.println(containsValue);

		// entryset
		Set<Entry<Object, Object>> entrySet = a.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);

		}
	}

}
