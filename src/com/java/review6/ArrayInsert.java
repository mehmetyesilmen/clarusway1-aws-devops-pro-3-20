package com.java.review6;

public class ArrayInsert {
	// Write a Java program to insert an element (specific position) into an array.
	// int 56 to be inserted at index 3 (in this case between 6 and 8)

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 23 };
		int k = 56;
		int index = 3;

		for (int i = arr.length - 1; i > index; i--)
			arr[i] = arr[i-1];
		
		arr[index] = k;
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
