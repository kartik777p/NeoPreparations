package com.nit.nonstatic;

public class A3 {

	int x = m1();

	int m1() {
		System.out.println("A NSV");
		return 10;
	}
	
	public A3() {
		System.out.println("A Cons");
		}
	
	{
		System.out.println("A NSB");
	}
	
}
