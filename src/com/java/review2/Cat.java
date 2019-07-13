package com.java.review2;

public class Cat extends Animal{

	@Override
	public void talk() {
		System.out.println("Cat says meow.");
	}

	@Override
	public void move() {
		System.out.println("Cat runs.");
	}

}
