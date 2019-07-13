package com.java.review2;

public class Sphere extends Shape3D {
	int radius;

	public Sphere(int r) {
		radius = r;
	}

	@Override
	public double getVolume() {
		return (4 / 3) * pi * radius * radius * radius;
	}

	@Override
	public double getArea() {
		return 4 * pi * radius * radius;
	}

}
