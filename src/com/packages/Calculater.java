package com.packages;

public class Calculater {
	
	public Calculater() {
		System.out.println("All the data");
	}
	public Calculater(String name) {
         this();
         System.out.println(name);
}
	public Calculater(int age) {
		this("kumar");
		System.out.println(age);
	}
	public Calculater(double salary) {
		this(32);
		System.out.println(salary);
	}
	public static void main(String[] args) throws Throwable {
//		Calculater a=new Calculater();
//		Calculater b=new Calculater("parthiban");
//		Calculater c=new Calculater(54);
//		Calculater d=new Calculater(87654d);
//		
//		a.finalize();
//		b.finalize();
//		c.finalize();
//		d.finalize();
		
		
		Calculater a= new Calculater(765434d);
	}
	
}