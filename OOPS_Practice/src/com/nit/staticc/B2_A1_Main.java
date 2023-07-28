package com.nit.staticc;
/*
 In A SB
a :- 10
b :- 0
 b:- 0
In B SB
a :- 10
b :- 20
b :- 20
In B main
a :- 10
b :- 20

 */
public class B2_A1_Main extends A2 {
	static int b = 20;
	static {
		System.out.println("In B SB");
		System.out.println("a :- " + a);
		System.out.println("b :- " + b);
		System.out.println("b :- " + getB());
	}

	static int getB() {
		return b;
	}
	public static void main(String[] args) {
		System.out.println("In B main");
		System.out.println("a :- "+a);
		System.out.println("b :- "+b);
		
	}
}
