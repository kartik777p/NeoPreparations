package com.nit.staticc;
/*
 A SV
A SB
B SV
B SB
B main
B main a :- 10
B main b :- 20
 */
public class B1_A1_Main extends A1 {

	static int b = m2();

	static int m2() {
		System.out.println("B SV");
		return 20;
	}

	static {
		System.out.println("B SB");
	}

	public static void main(String[] args) {
    System.out.println("B main");
    System.out.println("B main a :- "+a);
    System.out.println("B main b :- "+b);
	}

}
