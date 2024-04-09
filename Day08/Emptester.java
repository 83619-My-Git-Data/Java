package com.app.payroll;

import java.util.Scanner;

public class Emptester {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		Employee e1 = new SalariedEmployee();
		Employee e2 = new HourlyEmployee();
		Employee e3 = new ComissionEmployee();
		Employee e4 = new BaseplusComissionEmployee();
		
		e1.acceptData(sc);
		System.out.println(e1.toString());
		e2.acceptData(sc);
		System.out.println(e2.toString());
		e3.acceptData(sc);
		System.out.println(e3.toString());
		e4.acceptData(sc);
		System.out.println(e4.toString());
		
		
	}

}
