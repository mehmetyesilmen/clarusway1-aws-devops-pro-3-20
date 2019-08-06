package com.java.review5;

public class ReplaceX {
	// while loop
	// replace vowel with x

	// a,e,i,o,u
	// Java is boring -> Jxvx xs bxrxng
	// String str; str.charAt()

	public static void main(String[] args) {
		String str = "Java is boring";
		String newString = "";

		int i = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				newString += "x";
			} else {
				newString += c;
			}
			i++;
		}
		System.out.println(newString);
	}

}
