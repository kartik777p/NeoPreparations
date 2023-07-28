package com.nit.variblehiding;
/*
10----- 50
20----- 60
A class m1
B class m1
A class m2
B class m2
A class m2
 */
public class B5_1 extends A5 {

	static int a = 50;
	int x = 60;

	static void m1() {
		// super.m1(); //can't use in static contaxt
		System.out.println("B class m1");
	}

	void m2() {
		System.out.println("B class m2");
		super.m2();
	}

	void m4() {
		System.out.println(super.a + "----- " + a);
		System.out.println(super.x + "----- " + x);
		super.m1();
		m1();
		super.m2();
		m2();
	}

	public static void main(String[] args) {
		B5_1 b5_1 = new B5_1();
		b5_1.m4();
	}

}
