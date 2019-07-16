package com.java.review2_2;

public class RepairShop {

	public void testCalling() {
		System.out.println("Calling is working fine.");
	}

	public void testFacetime() {
		System.out.println("Facetime is working fine.");
	}

	public void repair(SmartPhone phone) {
		System.out.println("Repairing " + phone.getVersion());
		testCalling();

		if (phone instanceof iPhone) {
			iPhone i = (iPhone) phone;
			testFacetime();
		} else if (phone instanceof AndroidPhone) {
			AndroidPhone a = (AndroidPhone) phone;
		}
	}

//	public void repair(iPhone i) {
//		System.out.println("Repairing " + i.getVersion());
//	}
//
//	public void repair(AndroidPhone a) {
//		System.out.println("Repairing " + a.getVersion());
//	}

}
