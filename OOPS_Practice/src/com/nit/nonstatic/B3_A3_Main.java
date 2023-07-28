package com.nit.nonstatic;
/*
 B main
A NSV
A NSB
A Cons
B NSV
B NSB
B Cons
B main x:- 10
B main y:- 20
 */

public class B3_A3_Main  extends A3{
	int y = m2();

	int m2() {
		System.out.println("B NSV");
		return 20;
	}

	{
		System.out.println("B NSB");
	}

	public B3_A3_Main() {
	System.out.println("B Cons");
	}
	
	public static void main(String[] args) {
		System.out.println("B main");
		B3_A3_Main main=new B3_A3_Main();
		System.out.println("B main x:- "+main.x);
		System.out.println("B main y:- "+main.y);
	}
}
