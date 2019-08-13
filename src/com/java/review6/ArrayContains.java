package com.java.review6;

public class ArrayContains {
	public static void main(String[] args) {
		// if array contains a specific value, and print the index of the element

		int arr[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 11 };
		int k = 14;
		boolean found = false;

//		for (int i : arr) {
//			if (i == k) {
//				found = true;
//				break;
//			}
//		}

		int i = 0;
		for (; i < arr.length; i++) {
			if (arr[i] == k) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println("The array contains the number " + k + " at index " + i);
		else
			System.out.println("The array doesn't contain the number " + k);

	}
}
