package com.java.review5;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a number 1-10: ");
//		int i = scanner.nextInt();
//		for (int j = 1; j <= 10; j++) {
//			System.out.println(i + " * " + j + " = " + i * j);
//		}
//		scanner.close();

		int max = 10;
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
	}
}