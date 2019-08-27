package com.java.review8;

import java.util.*;

public class AlbumMap {
	public static void main(String[] args) {
		HashMap<String, String> album1 = new HashMap<String, String>();
		album1.put("Album", "Revolver");
		album1.put("Artist", "The Beatles");
		album1.put("Year", "1966");
		album1.put("Genre", "Rock");
		album1.put("Points", "2050");

		HashMap<String, String> album2 = new HashMap<String, String>();
		album2.put("Album", "Nevermind");
		album2.put("Artist", "Nirvana");
		album2.put("Year", "1991");
		album2.put("Genre", "Alternative");
		album2.put("Points", "1890");

		HashMap<String, String> album3 = new HashMap<String, String>();
		album3.put("Album", "Thriller");
		album3.put("Artist", "Michael Jackson");
		album3.put("Year", "1982");
		album3.put("Genre", "Pop");
		album3.put("Points", "1835");

		ArrayList<HashMap<String, String>> albumList = new ArrayList<HashMap<String, String>>();
		albumList.add(album1);
		albumList.add(album2);
		albumList.add(album3);

//		System.out.println(albumList);

		Set<String> keys = albumList.get(0).keySet();
		int i = 1;
		for (HashMap<String, String> album : albumList) {
//			System.out.println(album);
			System.out.println("Album " + i);
			for (String key : keys) {
				System.out.println(key + " -> " + album.get(key));
			}
			System.out.println();
			i++;
		}
	}
}
