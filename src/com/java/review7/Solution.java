package com.java.review7;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int d = scan.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < d; j++) {
				list.add(scan.nextInt());
			}
			listOfLists.add(list);
		}

		System.out.println(listOfLists);

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			List<Integer> list = listOfLists.get(x - 1);
			if (y > list.size()) {
				System.out.println("ERROR!");
			} else {
				Integer number = list.get(y - 1);
				System.out.println(number);
			}
		}
		scan.close();
	}
}
