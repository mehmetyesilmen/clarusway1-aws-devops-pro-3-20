package com.java.review5;

public class LoopQuestion1 {

	public static void main(String[] args) {
//		do {
//			System.out.print("1");
//			do {
//				System.out.print("2");
//			} while (false);
//
//		} while (false);

		boolean a = false;
		do {
			System.out.print("1");

			a = true;
			while (a) {
				a = false;
				System.out.print("2");
			}

		} while (false);
	}

}
