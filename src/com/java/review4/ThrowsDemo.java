package com.java.review4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {

		try {
			enterAge();
			System.out.println("Access Granted");
		} catch (AccessDeniedException e) {
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("Bye");
	}

	public static void enterAge() throws AccessDeniedException, InputMismatchException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();

		if (age < 18) {
			AccessDeniedException ex = new AccessDeniedException("Access Denied!");
			throw ex;
		}
	}
}

class AccessDeniedException extends Exception {
	public AccessDeniedException() {

	}

	public AccessDeniedException(String msg) {
		super(msg);
	}
}
