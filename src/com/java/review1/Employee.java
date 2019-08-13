package com.java.review1;

public class Employee {
	private String _SSN;
	private String firstName;
	private String lastName;
	private int empAge;

	public Employee() {
	}

	public String getSSN() {
		return this._SSN;
	}

	public void setSSN(String SSN) {
		if (SSN.length() != 9)
			return;
		_SSN = SSN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.length() < 2)
			return;
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getFullName() {
//		return firstName + " " + lastName;
		return lastName + ", " + firstName;
	}

	public String getInfo() {
		return "FirstName = " + firstName + " LastName = " + this.lastName + " Age = " + empAge + " SSN = " + _SSN;
	}

}
