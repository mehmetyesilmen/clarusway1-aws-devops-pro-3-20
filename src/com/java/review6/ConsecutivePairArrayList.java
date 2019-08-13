package com.java.review6;

import java.util.ArrayList;
import java.util.List;

public class ConsecutivePairArrayList {
	public static void main(String[] args) {
		int[] arr = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4, 5, 6, 7 };
//		int[] arr = { 1, 2, 3, 4, 5, 8, 10, 2, 4, 5, 6, 7, 8, 9, 10, 3, 9, 10, 11, 12 };

		List<Integer> currentList = new ArrayList<>();
		currentList.add(arr[0]);

		List<Integer> longestList = new ArrayList<>();
//		longestList = new ArrayList<>(currentList);
//		longestList = currentList;
//		System.out.println(longestList);
//		currentList.add(arr[1]);
//		System.out.println(longestList);
		longestList.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - currentList.get(currentList.size() - 1) == 1) {
				currentList.add(arr[i]);
				if (currentList.size()> longestList.size()) {
					longestList = new ArrayList<>(currentList);
				}
			}else {
				currentList = new ArrayList<Integer>();
				currentList.add(arr[i]);
			}
		}
		
		System.out.println(longestList);
	}
}
