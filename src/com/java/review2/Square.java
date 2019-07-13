package com.java.review2;

public class Square extends Shape2D {
	int side;

	public Square(int a) {
		side = a;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
}
