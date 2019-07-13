package com.java.review2;

public class Apple extends Fruit implements Washable, Peelable, Cutable {

	@Override
	public void eat() {
		wash();
		System.out.println("Eat the apple.");
	}

	@Override
	public void cut() {
		System.out.println("Cut the apple in pieces.");
	}

	@Override
	public void peel() {
		System.out.println("Peel the apple.");
	}

	@Override
	public void wash() {
		System.out.println("Wash the apple.");
	}

}
