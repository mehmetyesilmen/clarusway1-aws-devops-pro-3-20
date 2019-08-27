package com.java.review8;

import java.util.*;

public class AlbanianEnglishDictionary {
	public static void main(String[] args) {
		Map<String, String> englishAlbanian = new HashMap<String, String>();
		Map<String, String> albanianEnglish = new HashMap<String, String>();

		englishAlbanian.put("good", "mire");
		englishAlbanian.put("house", "shtepi");
		englishAlbanian.put("hi", "ckemi");
		englishAlbanian.put("language", "gjuhe");

		albanianEnglish.put("mire", "good");
		albanianEnglish.put("shtepi", "house");
		albanianEnglish.put("ckemi", "hi");
		albanianEnglish.put("gjuhe", "language");

		String search = "good";
		System.out.println(search + " = " + englishAlbanian.get(search));

		String kerko = "shtepi";
		System.out.println(kerko + " = " + albanianEnglish.get(kerko));

//		Set<String> keys = englishAlbanian.keySet();
//		System.out.println(keys);
//		for (String key : keys) {
//			System.out.println(key + " - " + englishAlbanian.get(key));
//		}
//		System.out.println();
//
//		Collection<String> values = englishAlbanian.values();
//		System.out.println(values);
//		for (String value : values) {
//			System.out.println(value);
//		}
//		System.out.println();
//
//		Set<Map.Entry<String, String>> entries = englishAlbanian.entrySet();
//		System.out.println(entries);

	}
}
