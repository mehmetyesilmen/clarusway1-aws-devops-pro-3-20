package com.java.review3;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		map.put(3, "three");
		map.put(5, "five");
		map.put(1, "one");

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + " -> " + map.get(key));
		}

		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}

		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println("key is :" + entry.getKey());
			System.out.println("value is :" + entry.getValue());
			System.out.println();
		}

	}
}
