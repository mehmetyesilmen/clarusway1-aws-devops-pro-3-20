package com.java.review7;

import java.util.*;

public class ListOfList {
	public static void main(String[] args) {
		// Create three lists of integers
		// Add all these list into another list of lists
		// Then iterate and try to print all the lists
		// using nested loops

		List<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(49);
		l1.add(27);
		l1.add(4);
		l1.add(33);

		List<Integer> l2 = new ArrayList<>();
		l2.add(57);
		l2.add(4);
		l2.add(2);
		l2.add(66);
		l2.add(317);

		List<Integer> l3 = new ArrayList<>();
		l3.add(15);
		l3.add(497);
		l3.add(227);
		l3.add(67);
		l3.add(79);

		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		lists.add(l1);
		lists.add(l2);
		lists.add(l3);

//		System.out.println(lists);

//		Iterator<List<Integer>> it =  lists.iterator();
//		while(it.hasNext()) {
//			List<Integer> list = it.next();
//			System.out.println(list);
//		}

		for (List<Integer> list : lists) {
//			System.out.println(list);
			Iterator<Integer> it = list.iterator();
			while (it.hasNext()) {
				Integer i = it.next();
				System.out.print(i + ", ");
			}
			System.out.println();
		}
	}
}
