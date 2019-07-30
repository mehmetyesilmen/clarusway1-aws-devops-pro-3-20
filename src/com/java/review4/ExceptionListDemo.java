package com.java.review4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionListDemo {
	
	public static void main(String[] args) {
		List<Exception> eList = getExceptionList();
		System.out.println("Exception List size = " + eList.size());

		for (Exception ex : eList) {
			System.out.println("Exception message -> " + ex.getMessage());
			System.out.println("Exception object -> " + ex);
			System.out.println("-------------------");
		}
	}

	public static List<Exception> getExceptionList() {
		List<Exception> exceptions = new ArrayList<Exception>();

		Exception ex = new Exception("Hi there!");
		exceptions.add(ex);

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please enter a number: ");
			int a = scanner.nextInt();
		} catch (InputMismatchException exception) {
			exceptions.add(exception);
		}

		Scanner scanner2 = new Scanner(System.in);
		try {
			System.out.println("Please enter a number: ");
			int a = scanner2.nextInt();
			int b = 10 / a;
		} catch (ArithmeticException ae) {
			exceptions.add(ae);
		}

		try {
			String array[] = { "a", "b", "c" };
			System.out.println(array[5]);
		} catch (Exception e) {
			exceptions.add(e);
		}

		try {
			String p = null;
			p.length();
		} catch (NullPointerException e) {
			exceptions.add(e);
		}

		return exceptions;
	}
}
