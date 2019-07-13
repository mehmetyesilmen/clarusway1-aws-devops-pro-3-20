package com.java.review2;

public abstract class Animal {
	
	public void sleep() {
		System.out.println("---sleeping---");
	}
	
	public void eat() {
		System.out.println("---eating---");
	}
	
	public abstract void talk();//unimplemented
	
	public abstract void move();//unimplemented
}
