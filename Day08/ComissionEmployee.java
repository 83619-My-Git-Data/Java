package com.app.payroll;

import java.util.Scanner;

public class ComissionEmployee extends Employee {
	
	int grossSales;
	double comissionRate;
	
	

	public void acceptData(Scanner sc)
	{
		super.acceptData(sc);
		System.out.println("Enter the gross sales");
		grossSales=sc.nextInt();
		System.out.println("Enter the comission rate");
		comissionRate=sc.nextDouble();
		
	}
	
	
	
	@Override
	public double calculateSalary() {
		
		return comissionRate*grossSales;
		
	}



	@Override
	public String toString() {
		return "ComissionEmployee [grossSales=" + grossSales + ", comissionRate=" + comissionRate + ", firstName="
				+ firstName + ", lastName=" + lastName + ", SSN=" + SSN + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getSSN()=" + getSSN() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
