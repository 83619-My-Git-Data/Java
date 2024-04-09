package com.app.payroll;

import java.util.Scanner;

public abstract class Employee {

	String firstName;
	String lastName;
	
	int SSN;
	
	public abstract double calculateSalary();
	
	public Employee()
	{
			
	}
	
	public void acceptData(Scanner sc)
	{
		System.out.println("Enter First Name -");
		firstName=sc.next();
		System.out.println("Enter Last Name -");
		lastName=sc.next();
		System.out.println("Enter SSN -");
		SSN=sc.nextInt();
	}

	
	public Employee(String firstName, String lastName, int sSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	
	
}
