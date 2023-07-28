package com.nit.oops;

public class InheritanceTest {

	public static void main(String[] args) {
		InheritanceDemoPERSON person=new Student();  
		//common properties of person
		System.out.println(person.ear);
		System.out.println(person.eyes);
		System.out.println(person.hand);
		
		Student std=new Student();
		//std properties
		System.out.println(std.stdID);
		//person properties
		System.out.println(std.ear);
		
		Employee emp=new Employee();
      //emp properties
		System.out.println(emp.empId);
		//person properties
		System.out.println(emp.ear);
	}

}
