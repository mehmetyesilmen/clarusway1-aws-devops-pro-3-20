package com.java.review6;

import java.util.Arrays;

public class PairSum {
	// Write a program to find all pairs of elements in an array whose sum is equal
	// to a specified number
	// We want two numbers in the array whose sum is equal to 17

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 5, 6, 8, 12, 9, 14, 83, 0, 23 };
		int k = 17;

//		//1st way. It is slow
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] + arr[j] == k) {
//					System.out.println(arr[i] + " " + arr[j]);
//				}
//			}
//		}

		// 2nd way. It is fast
		Arrays.sort(arr);
		System.out.println("Sorted array " + Arrays.toString(arr));

		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == k) {
				System.out.printf("(%d, %d) %n", arr[left], arr[right]);
				left++;
				right--;
			} else if (sum < k) {
				left++;
			} else {
				right--;
			}
		}

	}

}
