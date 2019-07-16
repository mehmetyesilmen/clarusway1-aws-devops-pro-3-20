package com.java.review3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import com.java.review2_2.AndroidPhone;
import com.java.review2_2.SmartPhone;
import com.java.review2_2.iPhone;

public class CollectionDemo {
	public static void main(String[] args) {
		iPhone i5 = new iPhone("iPhone 5");
		iPhone i6 = new iPhone("iPhone 6");
		iPhone ix = new iPhone("iPhone X");

		AndroidPhone s8 = new AndroidPhone("Samsung S8");
		AndroidPhone s9 = new AndroidPhone("Samsung S9");
		AndroidPhone galaxy = new AndroidPhone("Samsung Galaxy");

//		SmartPhone[] list = new SmartPhone[10];
//
//		list[0] = i5;
//		list[1] = i6;
//		list[2] = s8;

//		List<iPhone> listPhones = new ArrayList<>();
//		Set<SmartPhone> listPhones = new HashSet<>();
		List<SmartPhone> listPhones = new LinkedList<>();

//		System.out.println(listPhones.size());

		listPhones.add(i5);
		listPhones.add(i5);
		listPhones.add(ix);

		listPhones.add(1, s8);
		listPhones.add(0, s9);
		listPhones.add(galaxy);

		System.out.println(listPhones.size());

		System.out.println();

		System.out.println("For loop");
		for (int i = 0; i < listPhones.size(); i++) {
			SmartPhone phone = listPhones.get(i);
			System.out.println(phone.getVersion());
		}
		System.out.println();

		System.out.println("Enhanced For loop");
		for (SmartPhone phone : listPhones) {
			System.out.println(phone.getVersion());
		}
		System.out.println();

		System.out.println("Iterator");
		Iterator<SmartPhone> it = listPhones.iterator();
		while (it.hasNext()) {
			SmartPhone phone = it.next();
			System.out.println(phone.getVersion());
		}

		List<Number> list = new ArrayList<>();
		list.add(new Integer(4));
		list.add(new Double(5.5));
//		list.add(new String("abc"));

	}
}
