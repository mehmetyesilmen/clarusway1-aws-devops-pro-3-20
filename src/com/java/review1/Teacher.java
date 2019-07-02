package com.java.review1;

public class Teacher extends Person {
	int salary;

//	public Teacher() {
//		
//	}

	public Teacher(String name, int age, int weight, int salary) {
//		super();
		super(name, age, weight);
		this.salary = salary;
	}
	
	public void teach() {
		System.out.println("---teaching---");
	}
	
	public void displayInfo() {
//		super.displayInfo();
		System.out.println("I am teacher. My name is " + super.name + " my salary is " + this.salary);	
	}

}
