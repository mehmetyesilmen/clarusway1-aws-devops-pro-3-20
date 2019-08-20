package com.java.review7;

import java.util.*;

public class CountriesDemo {
	public static void main(String[] args) {
		List<String> europe = new ArrayList<String>();
		europe.add("France");
		europe.add("England");
		europe.add("Albania");

		List<String> asia = new ArrayList<String>();
		asia.add("China");
		asia.add("Pakistan");
		asia.add("India");

		List<String> africa = new ArrayList<String>();
		africa.add("Kenya");
		africa.add("South Africa");
		africa.add("Egypt");
		africa.add("Somalia");

		List<String> northAmerica = new ArrayList<String>();
		northAmerica.add("US");
		northAmerica.add("Canada");
		northAmerica.add("Mexico");

		Set<List<String>> world = new HashSet<List<String>>();
		world.add(europe);
		world.add(asia);
		world.add(africa);
		world.add(northAmerica);

		for (List<String> continent : world) {
			for (String country : continent) {
				System.out.print(country + " ");
			}
			System.out.println();
		}

//		Iterator<List<String>> it = world.iterator();
//		while (it.hasNext()) {
//			List<String> continent = it.next();
//			Iterator<String> innerIterator = continent.iterator();
//			while (innerIterator.hasNext()) {
//				String country = innerIterator.next();
//				System.out.print(country + " ");
//			}
//			System.out.println();
//		}
	}
}
