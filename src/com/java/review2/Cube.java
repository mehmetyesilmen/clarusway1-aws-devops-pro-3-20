package com.java.review2;

public class Cube extends Shape3D {
	int size;

	public Cube(int a) {
		this.size = a;
	}

	@Override
	public double getVolume() {
		return size * size * size;
	}

	@Override
	public double getArea() {
		return 6 * size * size;
	}

}
