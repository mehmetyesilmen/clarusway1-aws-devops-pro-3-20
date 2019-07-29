package com.java.review3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	public static void main(String[] args) {

//		Map<String, String> phoneBook = new HashMap<>();
//		phoneBook.put("Elion", "123-456-7890");
//		phoneBook.put("John", "123-456-6789");
//		phoneBook.put("Tim", "123-456-5678");
//		phoneBook.put("Tom", "123-456-4567");
//		phoneBook.put("Bob", "123-456-3456");
//
//		String person = "Elion";
//		if (phoneBook.containsKey(person))
//			System.out.println(phoneBook.get(person));
//		else
//			System.out.println(person + " Doesn't exist");

		Map<String, String> phoneBook = new HashMap<>();
		phoneBook.put("123-456-7890", "Elion");
		phoneBook.put("123-456-6789", "John");
		phoneBook.put("123-456-5678", "Tim");
		phoneBook.put("123-456-4567", "Tom");
		phoneBook.put("123-456-3456", "Bob");

		String phoneNumber = "123-456-3546";
		if (phoneBook.containsKey(phoneNumber))
			System.out.println(phoneBook.get(phoneNumber));
		else
			System.out.println(phoneNumber + " Doesn't exist");

	}
}
