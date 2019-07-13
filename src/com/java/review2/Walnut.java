package com.java.review2;

public class Walnut extends Fruit implements Crackable{

	@Override
	public void crack() {
		System.out.println("Crack the Walnut.");
	}

	@Override
	public void eat() {
		crack();
		System.out.println("Eat the Walnut.");
	}

}
