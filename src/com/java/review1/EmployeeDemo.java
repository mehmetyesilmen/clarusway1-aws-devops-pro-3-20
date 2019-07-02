package com.java.review1;

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setFirstName("John");
		emp1.setSSN("111456789");

		String last = "Smith";

		if (last.length() >= 2) {
			emp1.setLastName(last);
		}
		System.out.println(emp1.getInfo());

		System.out.println(emp1.getFullName());

		System.out.println(emp1.getFirstName() + " " + emp1.getLastName());

	}
}
