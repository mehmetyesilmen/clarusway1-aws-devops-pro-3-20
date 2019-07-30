package com.java.review4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroDemo {
	public static void main(String[] args) {
		int a, b, e, c = 0;

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Please enter a number: ");
			a = scanner.nextInt();

			System.out.println("Please enter another number: ");
			b = scanner.nextInt();

			System.out.println("Please enter another number: ");
			e = scanner.nextInt();

			int arr[] = new int[2];

			arr[0] = a;
			arr[1] = b;
			arr[2] = e;

			c = a / b;
			System.out.println("The result is: " + c);
		} catch (ArithmeticException ex) {
			System.out.println("Division by zero happened.");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index Out Of Bounds Exception happened.");
		} catch (Exception ex) {
			System.out.println("Something happened.");
		}
	}
}
