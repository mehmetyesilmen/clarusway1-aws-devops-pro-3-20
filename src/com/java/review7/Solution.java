package com.java.review7;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int d = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 1; j <= d; j++) {
				list.add(in.nextInt());
			}
			lists.add(list);
		}

	}
}
