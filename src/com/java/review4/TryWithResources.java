package com.java.review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		try {
//			System.out.println("BufferedReader waiting for your input!");
//			br.readLine();
//		} catch (IOException e) {
//			System.out.println("I caught you!");
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {
//			}
//		}

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("BufferedReader waiting for your input!");
			br.readLine();
		} catch (IOException e) {
			System.out.println("I caught you!");
		}
	}
}
