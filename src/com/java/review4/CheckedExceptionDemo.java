package com.java.review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("BufferedReader waiting for your input!");
			br.readLine();
		} catch (IOException e) {
			System.out.println("I caught you!");
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Scanner waiting for your input!");
		int a = scanner.nextInt();
	}

}
