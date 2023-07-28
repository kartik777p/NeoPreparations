package com.nit.cons;
/*
 Example1 0- param
Sample1 0-param
Example1 int  param
Sample1 int param

 */
public class Sample1 extends Example1 {
	public Sample1() {
		System.out.println("Sample1 0-param");
	}

	public Sample1(int a) {
		super(50);
		System.out.println("Sample1 int param");
	}
	
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1(10);
	}
}
