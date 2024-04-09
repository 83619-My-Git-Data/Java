package com.app.payroll;

import java.util.Scanner;

public class BaseplusComissionEmployee extends ComissionEmployee {

	double baseSalary;
	
	
	public void acceptData(Scanner sc)
	{
		super.acceptData(sc);
		System.out.println("Enter the base salary");
		baseSalary=sc.nextDouble();
	}
	
	
	@Override
	public double calculateSalary() {
		
		return super.calculateSalary()+baseSalary;
		
	}


	@Override
	public String toString() {
		return "BaseplusComissionEmployee [baseSalary=" + baseSalary + ", grossSales=" + grossSales + ", comissionRate="
				+ comissionRate + ", firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN
				+ ", toString()=" + super.toString() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getSSN()=" + getSSN() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
