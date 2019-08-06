package com.java.review5;

public class PrintStars {

	public static void main(String[] args) {
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 20; i++) {
			System.out.print("*");
			if ((i % 5) == 0)
				System.out.println();

		}
		
		//smart solution
//		for(int i=0; i<4;i++)
//			System.out.println("*****");

	}

}
