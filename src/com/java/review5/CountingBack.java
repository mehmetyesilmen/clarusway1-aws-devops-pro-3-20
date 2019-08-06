package com.java.review5;

public class CountingBack {
	// The output should be: 100,95,90,85,80...10,5,0

	public static void main(String[] args) {
//		for (int i = 100; i >= 0; i -= 5) {
//			System.out.print(i + ",");
//		}
//
//		System.out.println();
//
//		int i = 100;
//		while (i >= 0) {
//			System.out.print(i + ",");
//			i -= 5;
//		}

		int i = 100;
		while (true) {
			System.out.print(i + ",");
			i -= 5;
			if (i < 0)
				break;
		}

//		for (int i = 0; i <= 100; i += 5) {
//			System.out.print(100 - i + ",");
//		}
//		System.out.println();
//		for (int i = 20; i >= 0; i--) {
//			System.out.print(i * 5 + ",");
//		}
//
//		System.out.println();
//
//		int i = 20;
//		while (i >= 0) {
//			System.out.print(i * 5 + ",");
//			i--;
//		}

	}
}
