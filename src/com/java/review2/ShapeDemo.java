package com.java.review2;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {

	public static void main(String[] args) {
//		Shape2D s1 = new Rectangle(6, 4);
//		System.out.println("Rectangle Area = " +  s1.getArea());
//		System.out.println("Rectangle Perimeter = " + s1.getPerimeter());

//		Shape2D s2 = new Circle(2);
//		System.out.println("Circle Area = " +  s2.getArea());
//		System.out.println("Circle Perimeter = " + s2.getPerimeter());

		List<Shape2D> shapes = new ArrayList<>();
		shapes.add(new Rectangle(6, 4));
		shapes.add(new Circle(2));
		shapes.add(new Square(5));
		shapes.add(new Rectangle(5, 3));
		shapes.add(new Circle(3));

		double totalArea = 0;
		double totalPerimeter = 0;
		for (Shape2D shape : shapes) {
//			if (shape instanceof Circle) {
//				Circle c = (Circle) shape;
//				c.getRadius();
//				((Circle) shape).getRadius();
//			}
			totalArea += shape.getArea();
			totalPerimeter += shape.getPerimeter();
		}
		System.out.println("Total Area is: " + totalArea);
		System.out.println("Total Perimeter is : " + totalPerimeter);

		Shape3D s3 = new Sphere(3);
		System.out.println("Sphere Area = " + s3.getArea());
		System.out.println("Sphere Volume = " + s3.getVolume());

		Shape3D s4 = new Cube(6);
		System.out.println("Cube Area = " + s4.getArea());
		System.out.println("Cube Volume = " + s4.getVolume());

		// Do the same list example for 3D Shapes
	}
}
