package com.java.review8;

import java.util.*;

import com.java.review7.Employee;

public class EmployeeMap {
	public static void main(String[] args) {
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

		Employee emp1 = new Employee(101, "Tim Cook", "IT");
		Employee emp2 = new Employee(102, "John Smith", "Marketing");
		Employee emp3 = new Employee(103, "Lebron James", "Sports");

		empMap.put(emp1.getEmpId(), emp1);
		empMap.put(emp2.getEmpId(), emp2);
		empMap.put(emp3.getEmpId(), emp3);

//		System.out.println(empMap);
		Employee employee = empMap.get(102);
		System.out.println("Map employee: " + employee);
		
//		System.out.println("Looping through the employees in the map");
//		Collection<Employee> employees= empMap.values();
//		for (Employee emp:employees) {
//			System.out.println(emp);
//		}
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
//		System.out.println(empList);
		for (Employee emp : empList) {
			if (emp.getEmpId() == 102) {
				System.out.println("List employee: " + emp);
				break;
			}
		}

	}
}
