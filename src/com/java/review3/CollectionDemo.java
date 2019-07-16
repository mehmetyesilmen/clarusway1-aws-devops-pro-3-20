package com.java.review3;

import java.util.List;
import java.util.ArrayList;

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
		List<SmartPhone> listPhones = new ArrayList<>();

//		System.out.println(listPhones.size());

		listPhones.add(i5);
		listPhones.add(i6);
		listPhones.add(ix);

		listPhones.add(s8);
		listPhones.add(s9);
		listPhones.add(galaxy);

		System.out.println(listPhones.size());

	}
}
