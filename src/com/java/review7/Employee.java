package com.java.review7;

public class Employee {
	int empId;
	String empName;
	String department;

	public Employee(int empId, String empName, String department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public String toString() {
		return "EmpId: " + empId + " EmpName: " + empName + " Department: " + department;
	}
}