package com;

public class Basic_Strings {
	public static void main(String[] args) {
		String M = "My Name Is Karthik";
		String M1 = "Thank You";

		// 1.length--> returns string length
		int l = M.length();
		System.out.println(l);

		// 2.equals-->check the condition is true or false
		boolean E = M.equals("my name is karthik");
		System.out.println(E);
		
		// 3.equalsIgnoreCase-->ignore case(true or false)
		boolean EI = M.equalsIgnoreCase("my name is karthik");
		System.out.println(EI);

		// 4.toUpperCase-->to return uppercase(captiol letter)
		String u = M.toUpperCase();
		System.out.println(u);

		// 5.toLowerCase-->to return lowercase(sumal letter)
		String lc = M.toLowerCase();
		System.out.println(lc);

		// 6.startsWith-->start with prefix
		boolean s = M.startsWith("My");
		System.out.println(s);

		// 7.endsWith-->end with suffix
		boolean e = M.endsWith("surya");
		System.out.println(e);

		// 8.contains-->search the value(t,f)
		boolean c = M.contains("Name");
		System.out.println(c);

		// 9.indexOf-->start the value
		int i = M.indexOf("a");
		System.out.println(i);

		// 10.lastIndexOf-->end of the value
		int lo = M.lastIndexOf("h");
		System.out.println(lo);

		// 11.charAt-->index-->return the value the given index number
		char ca = M.charAt(13);
		System.out.println(ca);

		// 12.replace-->(old value,new value)
		String r = M.replace("Karthik", "Surya");
		System.out.println(r);

		// 13.substring-->inset pantra number munade remove panum
		String ss = M.substring(5);
		System.out.println(ss);

		// 14.isEmpty("")-t,("karthik")-f
		boolean em = M.isEmpty();
		System.out.println(em);

		// 15.split-->value one by one spilt panum
		String[] split = M.split(" ");
		  for (String string : split) {
			System.out.println(string);
		}
			// 16.trim-->start la spece irutha remove panum
			String t = M.trim();
			System.out.println(t);

			// 17.compareTo-->
	       String S1 = "s";
			String S2 = "l";
			int co = S1.compareTo(S2);
			System.out.println(co);

			// 18.concat-->add to value
			String cc = M.concat(M1);
			System.out.println(cc);

			// 19.valueOf-->one to another value insert panum
			float a=678.98f;
			String va = M.valueOf(a);
			System.out.println(va);

			// 20.toCharArray-->
			char[] ch = M1.toCharArray();
			for (int j = 0; j < ch.length; j++) {

				System.out.print(ch[j]);

		}

	}}
