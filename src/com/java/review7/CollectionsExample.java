package com.java.review7;

import java.util.*;

public class CollectionsExample {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("France");
		list.add("England");
		list.add("Italy");
		System.out.println("Inital list: " + list);

		Collections.addAll(list, "Spain", "Germany");

		String[] strArr = { "US", "Albania", "Pakistan" };
		Collections.addAll(list, strArr);
		System.out.println("After adding elements: " + list);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(46);
		list2.add(67);
		list2.add(8);
		list2.add(12);
		System.out.println("Maximum is: " + Collections.max(list2));
		System.out.println("Minimum is: " + Collections.min(list2));

		Collections.sort(list2);
		System.out.println("After sorting: " + list2);

		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("John", "Alex", "Tim", "Ray"));
		Collections.sort(list3, Collections.reverseOrder());
		System.out.println("Reverse order: " + list3);
	}
}
