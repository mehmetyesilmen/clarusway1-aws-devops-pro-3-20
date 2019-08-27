package com.java.review8;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<String, String>();
//		Map<String, String> countries = new LinkedHashMap<String, String>();
//		Map<String, String> countries = new TreeMap<String, String>();
//		Map<String, String> countries = new Hashtable<String, String>();

//		countries.put("US", null);
		countries.put("Albania", "Tirana");
		countries.put("Kenya", "Nairobi");
		countries.put("France", "Paris");
		countries.put("Somalia", "Mogadishu");
		countries.put("England", "London");
		countries.put("Japan", "Tokyo");
		countries.put("Italy", "Rome");
//		countries.put("Italy", "Venice");

		System.out.println(countries);
		System.out.println();

		System.out.println("Printing keys:");
		Set<String> keys = countries.keySet();
		for (String key : keys) {
			System.out.println("key: " + key + " -> value: " + countries.get(key));
		}
		System.out.println();

		System.out.println("Printing values:");
		Collection<String> values = countries.values();
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println();

		System.out.println("Printing entries:");
		Set<Map.Entry<String, String>> entries = countries.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
}