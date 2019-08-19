package com.java.review7;

import java.util.*;

public class InitializeArrayList {
	public static void main(String[] args) {
		// 1. Intialize using Add method
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		printListElement(list1);

		// 2. Intialize using shorthand version of Add method
		List<String> list2 = new ArrayList<String>() {
			{
				add("d");
				add("e");
				add("f");
			}
		};
		printListElement(list2);

//		// 3. Intialize using Arrays.asList method
//		// Creates a immutable list, so you cannot add elements
//		List<String> list3 = Arrays.asList("g", "h", "i");
////		list3.add("x");
//		list3.set(1, "z");
//		printListElement(list3);

		String[] arr = { "g", "h", "i" };
//		List<String> list4 = Arrays.asList(arr);
//		System.out.println("The list before changing the array");
//		printListElement(list4);
//		arr[0] = "z";
//		System.out.println("The list after changing the array");
//		printListElement(list4);

		// If you want mutable list we have to create a new ArrayList object
		List<String> list5 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("The list before changing the array");
		printListElement(list5);
//		list5.add("z");
		arr[0] = "z";
		System.out.println("The list after changing the array");
		printListElement(list5);

		// 4. Works only in Java 9
//		List<String> list6 = new ArrayList<String>(List.of("g", "h", "i"));

		// 5. Intialize using another collection
		List<String> list7 = new ArrayList<>(list1);
		list1.add("z");
		printListElement(list1);

		printListElement(list7);

	}

	public static void printListElement(List<String> list) {
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + ", ");
		}
		System.out.println();
	}
}
