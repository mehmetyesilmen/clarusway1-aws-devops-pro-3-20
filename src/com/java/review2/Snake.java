package com.java.review2;

public class Snake extends Animal {

	@Override
	public void sleep() {
		System.out.println("Snakes sleep for 3 months.");
	}

	@Override
	public void talk() {
		System.out.println("Snake says hisss.");
	}

	@Override
	public void move() {
		System.out.println("Snakes don't run, they rattle.");
	}

}
