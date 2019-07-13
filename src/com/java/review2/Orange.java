package com.java.review2;

public class Orange extends Fruit implements Peelable, Cutable {

	@Override
	public void cut() {
		System.out.println("Cut the orange.");
	}

	@Override
	public void peel() {
		System.out.println("Peel the orange.");
	}

	@Override
	public void eat() {
		peel();
		System.out.println("Eat the Orange.");
	}

}
