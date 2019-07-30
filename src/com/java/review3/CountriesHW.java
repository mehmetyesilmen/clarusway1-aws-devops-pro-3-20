package com.java.review3;

import java.util.*;

public class CountriesHW {
	public static void main(String[] args) {
		Map<String, String> europe = new HashMap<>();
		europe.put("Albania", "Tirana");
		europe.put("England", "London");
		europe.put("France", "Paris");

		Map<String, String> asia = new HashMap<>();
		asia.put("China", "Bejing");
		asia.put("Japan", "Tokyo");
		asia.put("Turkey", "Ankara");

		Map<String, String> africa = new HashMap<>();
		africa.put("Kenya", "Nairobi");
		africa.put("South Africa", "Capetown");
		africa.put("Egypt", "Cairo");
		africa.put("Somalia", "Mogadishu");

		Map<String, Map<String, String>> worldMap = new HashMap<>();
		worldMap.put("Asia", asia);
		worldMap.put("Africa", africa);
		worldMap.put("Europe", europe);

		Set<String> keys = worldMap.keySet();
		for (String key : keys) {
			System.out.println(key);
			// Code goes here
			Map<String, String> continent = worldMap.get(key);
			System.out.println(continent);
			
//			Set<Map.Entry<String, String>> countries = continent.entrySet();
//			for(Map.Entry<String, String> country : countries) {
//				System.out.println(country.getKey() + "->" + country.getValue());
//			}
			
//			Set<String> countrySet = continent.keySet();
//			for(String countryName : countrySet) {
//				System.out.println(countryName + "->" + continent.get(countryName));
//			}
			
			Collection<String> capitalCityCollection = continent.values();
			for (String capitalCity : capitalCityCollection) {
				System.out.println(capitalCity);
			}
			
			System.out.println();
		}

	}
}
