//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.


package tester;

import java.util.Scanner;

public class DrivingCar {
	private double costCar;
	private double miles;
	private double costGasoline;
	private double mileGallon;
	private int parkingFees;
	private int tolls;
	DrivingCar()
	{
		
	}
	
	public void accept()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total miles = ");
		miles = sc.nextDouble();
		System.out.println("enter cost per gallan of gasoline = ");
		costGasoline = sc.nextDouble();
		System.out.println("enter mile per gallon = ");
		mileGallon = sc.nextDouble();
		System.out.println("enter parking fees = ");
		parkingFees = sc.nextInt();
		System.out.println("enter total tolls per day = ");
		tolls = sc.nextInt();
		
	}
	public void calculate_cost() {
		costCar = (miles* mileGallon*costGasoline)+parkingFees+tolls;   
		System.out.println("total cost of car oprating is = "+costCar);
	}
	public static void main(String [] args)
	{
		DrivingCar carCost = new DrivingCar();
		carCost.accept();
		carCost.calculate_cost();
		
	}
}
