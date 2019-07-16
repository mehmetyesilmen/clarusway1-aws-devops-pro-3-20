package com.java.review2_2;

public class SmartphoneDemo {

	public static void main(String[] args) {
		iPhone i5 = new iPhone("iPhone 5");
		iPhone i6 = new iPhone("iPhone 6");
		iPhone ix = new iPhone("iPhone X");

		AndroidPhone s8 = new AndroidPhone("Samsung S8");
		AndroidPhone s9 = new AndroidPhone("Samsung S9");
		AndroidPhone galaxy = new AndroidPhone("Samsung Galaxy");

		RepairShop r = new RepairShop();
		
//		SmartPhone s = i6;
		
		r.repair(i6);
		System.out.println();
		r.repair(galaxy);
	}

}
