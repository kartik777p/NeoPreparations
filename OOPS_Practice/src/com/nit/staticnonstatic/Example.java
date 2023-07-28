package com.nit.staticnonstatic;

public class Example {

	static int a = m1();

	static {
		System.out.println("Example SB");
	}

	int x = m2();
	{
		System.out.println("Example NSB");
	}

	public Example() {
		System.out.println("Example cons");
	}

	static int m1() {
		System.out.println("Example SV is created");
		return 10;
	}

	int m2() {
		System.out.println("Example  NSV is created");
		return 20;
	}

	void abc() {
		System.out.println("Example abc ");
	}

	void bbc() {
		System.out.println("Example bbc ");
	}
}
