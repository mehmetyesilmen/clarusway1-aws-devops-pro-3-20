package com.java.review5;

public class Tree {

	public static void main(String[] args) {
		/**
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 */
		
//		for (int m = 1; m <= 6; m++) {
//			for (int n = 1; n <= m; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/**
		 * *
		 * ***
		 * *****
		 * *******
		 * *********
		 * ***********
		 */
		for (int m = 1; m <= 6; m++) {
			for (int n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
