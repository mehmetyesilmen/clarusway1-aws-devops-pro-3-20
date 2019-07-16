package com.java.review3;

import java.util.*;

public class CountriesDemo {
	public static void main(String[] args) {
		Map<String, String> europe = new HashMap();
		europe.put("Albania", "Tirana");
		europe.put("England", "London");
		europe.put("France", "Paris");

		Map<String, String> asia = new HashMap();
		asia.put("China", "Bejing");
		asia.put("Japan", "Tokyo");
		asia.put("Turkey", "Ankara");

		Map<String, String> africa = new HashMap();
		africa.put("Kenya", "Nairobi");
		africa.put("South Africa", "Capetown");
		africa.put("Egypt", "Cairo");
		africa.put("Somalia", "Mogadishu");

//		Set<Map<String, String>> world = new HashSet<>();
//		world.add(asia);
//		world.add(africa);
//		world.add(europe);
//		
//		
//		Iterator<Map<String, String>> it = world.iterator();
//		while(it.hasNext()) {
//			Map<String, String> continent = it.next();
//			System.out.println(continent);
//		}

		Map<String, Map<String, String>> worldMap = new HashMap();
		worldMap.put("Asia", asia);
		worldMap.put("Europe", europe);
		worldMap.put("Africa", africa);

		Collection<Map<String, String>> continents = worldMap.values();
		Iterator<Map<String, String>> it = continents.iterator();
		while (it.hasNext()) {
			Map<String, String> continent = it.next();
			System.out.println(continent);
		}
		
		System.out.println("---keys---");
		Set<String> keys = worldMap.keySet();
		for(String key:keys) {
			System.out.println(key + " -> " + worldMap.get(key));
		}

	}
}
