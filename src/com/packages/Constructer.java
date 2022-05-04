package com.packages;

public class Constructer {

	public Constructer() {
		System.out.println("Enter the constructer");
	}

	public Constructer(String name) {
		this();
		System.out.println(name);

	}

	public Constructer(int age) {
		this("karthik");
		System.out.println(age);

	}
	public Constructer(double salary) {
        this(21);
        System.out.println(salary);
	
		
	}
	
	public static void main(String[] args) throws Throwable {
//		Constructer a= new Constructer();
//		Constructer b= new Constructer("prem");
//		Constructer c= new Constructer(25);
//		Constructer d=new Constructer(98765d);
		
		
//	a.finalize();
//	b.finalize();
//	c.finalize();
//	d.finalize();
	
	
    Constructer a=new Constructer(908765d);
	}
}


