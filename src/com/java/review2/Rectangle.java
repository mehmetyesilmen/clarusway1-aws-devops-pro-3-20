package com.java.review2;

public class Rectangle extends Shape2D {

	int height, width;

	public Rectangle(int a, int b) {
		height = a;
		width = b;
	}

	@Override
	public double getPerimeter() {
		return 2 * (height + width);
	}

	@Override
	public double getArea() {
		return height * width;
	}

}
