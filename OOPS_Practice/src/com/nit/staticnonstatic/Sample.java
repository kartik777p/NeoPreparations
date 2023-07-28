package com.nit.staticnonstatic;
/*
 Example SV is created
Example SB
Sample SV is created
Sample SB
Sample main
Example  NSV is created
Example NSB
Example cons
Sample NSV is created
Sample NSB
Sample Cons
Sample abc
Example bbc 

 */

public class Sample extends Example {
	static int b = m3();
	static {
		System.out.println("Sample SB");
	}
	int y = m4();
	{
		System.out.println("Sample NSB");
	}

	public Sample() {
		System.out.println("Sample Cons");
	}

	static int m3() {
		System.out.println("Sample SV is created");
		return 30;
	}

	int m4() {
		System.out.println("Sample NSV is created");
		return 40;
	}

	void abc() {
		System.out.println("Sample abc");
	}

	public static void main(String[] args) {
		System.out.println("Sample main");
		Sample s = new Sample();
		s.abc();
		s.bbc();

	}

}
