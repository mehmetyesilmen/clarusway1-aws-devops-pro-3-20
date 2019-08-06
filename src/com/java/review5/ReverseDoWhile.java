package com.java.review5;

public class ReverseDoWhile {
	// Use do-while loop to generate the reverse of a string
	// Java is boring -> gnirob si avaJ

	public static void main(String[] args) {
		String str = "Java is boring";
		String newString = "";

		int i = str.length() - 1;
		do {
			newString = newString + str.charAt(i);
			i--;
		} while (i >= 0);
		System.out.println(newString);
	}
}
