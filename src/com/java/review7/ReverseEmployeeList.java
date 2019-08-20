package com.java.review7;

import java.util.*;

public class ReverseEmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();

		Employee emp1 = new Employee(101, "Tim Tom", "IT");
		empList.add(emp1);
		empList.add(new Employee(102, "John Smith", "Marketing"));
		empList.add(new Employee(103, "Lebron James", "Sport"));
		
		printEmployees(empList);
		System.out.println();
		
		Collections.reverse(empList);
		System.out.println("Employee List in reverse order:");
		printEmployees(empList);

	}

	public static void printEmployees(List<Employee> list1) {
		for (Employee emp : list1) {
			System.out.println(emp);
		}
	}
}
