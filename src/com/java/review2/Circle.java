package com.java.review2;

public class Circle extends Shape2D {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * pi * radius;
	}

	@Override
	public double getArea() {
		return pi * radius * radius;
	}

}
