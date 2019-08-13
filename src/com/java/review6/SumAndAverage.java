package com.java.review6;

public class SumAndAverage {

	public static void main(String[] args) {
		// the sum and average of integers in an array

//		int arr[] = new int[] { 3, 5, 6, 8, 12, 5, 9 };
		int arr[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 11 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		double ave = (double) sum / arr.length;

		System.out.println("sum is " + sum);
		System.out.println("average is " + ave);

	}

}
