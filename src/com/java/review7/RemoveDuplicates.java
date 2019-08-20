package com.java.review7;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 10, 1, 2, 2, 6, 3, 3, 10, 3, 4, 5, 5));
		// Implement a static method that removes the duplicates from the list

//		ArrayList<Integer> noDupList = removeDuplicates(list);
		ArrayList<Integer> noDupList = removeDuplicatesUsingLinkedHashSet(list);

		System.out.println(noDupList);
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> oldList) {
		ArrayList<Integer> newList = new ArrayList<>();

		for (Integer n : oldList) {
			if (!newList.contains(n))
				newList.add(n);
		}
		return newList;
	}

	public static ArrayList<Integer> removeDuplicatesUsingLinkedHashSet(ArrayList<Integer> oldList) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(oldList);
		
		oldList.clear();
		oldList.addAll(set);
		
		return oldList;
	}
}
