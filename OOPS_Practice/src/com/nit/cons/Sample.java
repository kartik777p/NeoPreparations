package com.nit.cons;
/*
 Example 0- param
Sample 0-param
Example 0- param
Sample int param
 */
public class Sample extends Example {
	public Sample() {
		System.out.println("Sample 0-param");
	}

	public Sample(int a) {
		System.out.println("Sample int param");
	}
	
	public static void main(String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample(10);
	}
}
