package com.java.review1;

public class Person {
	protected String name;
	protected int age;
	protected int weight;

	public Person() {

	}

	public Person(String name) {
		System.out.println("Constructor with 1 parameters.");
		this.name = name;
	}

	public Person(String name, int age) {
		this(name);
		System.out.println("Constructor with 2 parameters.");
		this.age = age;
	}

	public Person(String name, int age, int w) {
		this(name, age);
		System.out.println("Constructor with 3 parameters.");
		weight = w;
	}

	public void sleep() {
		System.out.println("---sleeping---");
	}

	public void displayInfo() {
		System.out.println(
				"I am a person. My name is " + this.name + " and my age is " + age + "" + " my weight is " + weight);

//		return ;

	}

	protected void eat() {
		System.out.println("---eating---");
	}

}
