package com.java.review5;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		// promt user to enter a number, and then print the square of the number
		// until 0 (zero) is enter.

		Scanner scanner = new Scanner(System.in);

//		System.out.println("Enter a number. Use 0 (zero) to finish: ");
//		int a = scanner.nextInt();
//
//		while (a != 0) {
//
//			System.out.println("The square of your number is: " + a * a);
//
//			System.out.println("Enter a number. Use 0 (zero) to finish: ");
//			a = scanner.nextInt();
//
//		}

		int a = 0;

		do {
			System.out.println("Enter a number. Use 0 (zero) to finish: ");
			a = scanner.nextInt();

			System.out.println("The square of your number is: " + a * a);
		} while (a != 0);

	}

}
