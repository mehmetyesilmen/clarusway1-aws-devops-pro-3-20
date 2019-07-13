package com.java.review2;

public class Dog extends Animal {

	@Override
	public void talk() {
		System.out.println("Dog says woof.");
	}

	@Override
	public void move() {
		System.out.println("Dog runs.");
	}

}
