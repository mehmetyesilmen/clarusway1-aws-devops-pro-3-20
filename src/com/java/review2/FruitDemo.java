package com.java.review2;

import java.util.ArrayList;
import java.util.List;

public class FruitDemo {
	public static void main(String[] args) {
		Fruit f1 = new Apple();

//		f1.eat();
//		Apple apple = (Apple) f1;
////		Peelable p = apple;
////		Peelable p2 = (Peelable) f1;
//		apple.peel();
//		apple.cut();

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(f1);
		fruits.add(new Orange());
		fruits.add(new Walnut());
		fruits.add(new Orange());
		fruits.add(new Apple());
		
		for (Fruit fruit:fruits) {
			fruit.eat();
			System.out.println("----Done with the fruit----");
		}

	}
}
