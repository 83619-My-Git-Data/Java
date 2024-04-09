package com.app.payroll;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	
	double weeklySalary;
	
	
	public void acceptData(Scanner sc)
	{	
		super.acceptData(sc);
		System.out.println("Enter the Weekly Salary ");
		weeklySalary=sc.nextDouble();
	}
	
	@Override
	public double calculateSalary() {
		 
		return weeklySalary;
	
	}


	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", SSN=" + SSN + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSSN()=" + getSSN() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	}


