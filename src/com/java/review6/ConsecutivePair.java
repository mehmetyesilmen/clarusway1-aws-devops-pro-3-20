package com.java.review6;

import java.util.Arrays;

public class ConsecutivePair {

	public static void main(String[] args) {
//		int[] arr = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4, 5, 6, 7 };
		int[] arr = { 1, 2, 3, 4, 5, 8, 10, 2, 4, 5, 6, 7, 8, 9, 10, 3, 9, 10, 11, 12 };
		int longestIndex = 0;
		int longestLength = 1;
		int currentIndex = 0;
		int currentLength = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] == 1) {
				currentLength++;
				if (currentLength > longestLength) {
					longestLength = currentLength;
					longestIndex = currentIndex;
				}
			} else {
				currentLength = 1;
				currentIndex = i;
			}
		}

		for (int i = longestIndex; i < longestIndex + longestLength; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
