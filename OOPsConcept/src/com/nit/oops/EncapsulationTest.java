package com.nit.oops;

public class EncapsulationTest {

	public static void main(String[] args) {
		
	EncapsulationDemo emp=new EncapsulationDemo();
	//emp.x    //not accessible directly we have to access using setter and getter method 
	emp.setX(10);
	emp.setY(20);
	
	System.out.println("x : "+emp.getX());
	System.out.println("y:"+emp.getY());
	
	}

}
