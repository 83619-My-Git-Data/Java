package com.app.payroll;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	
	double wage;
	int hrs;
	
	public void acceptData(Scanner sc)
	{
		super.acceptData(sc);
		System.out.println("Enter the wage ");
		wage= sc.nextDouble();
		System.out.println("Enter the hours ");
		hrs=sc.nextInt();
		
	}
	
	@Override
	public double calculateSalary() {
		
		if(hrs<=40)
		{
			return wage*hrs;
		}
		
			return 40*wage+(hrs-40)*wage*1.5;
		
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hrs=" + hrs + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", SSN=" + SSN + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSSN()=" + getSSN() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
