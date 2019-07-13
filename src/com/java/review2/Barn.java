package com.java.review2;

public class Barn {
	public static void main(String[] args) {
		Animal dog = new Dog();	
		dog.sleep();
		dog.eat();
		dog.talk();
		
		System.out.println();
		Animal cat = new Cat();		
		cat.sleep();
		cat.eat();
		cat.talk();
		cat.move();
		
		System.out.println();

		Animal snake = new Snake();
		snake.sleep();
		snake.talk();
		snake.move();

	}
	

}
