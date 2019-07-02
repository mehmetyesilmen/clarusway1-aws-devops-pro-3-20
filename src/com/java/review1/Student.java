package com.java.review1;

public class Student extends Person{
	String studentNr;
	
//	public Student() {
//		
//	}
	
	public Student(String name, int age, int weight) {
//		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void sleep() {
		System.out.println("Students sleeps in class.");
	}
	
	@Override
	public void displayInfo() {
		System.out.println("I am a student. My name is " + name + ". My number is " + studentNr);
		eat();
	}

}
