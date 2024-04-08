package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	
	 String color;
	 double weight;
	 String name;
	 boolean isFresh= true ;
    public FruitBasket() {
		
	}
	
	public FruitBasket(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color ");
		color=sc.next();
		System.out.println("Enter the weight ");
		weight=sc.nextDouble();
		System.out.println("Enter the name ");
		name=sc.next();
//		System.out.println("The fruit is ");
//		isFresh=sc.nextBoolean();
	}
	
	public void display() {
		System.out.println("The color is " + color);
		
		System.out.println("The weight is " + weight);
		
		System.out.println("The name is " + name);
		
		System.out.println("The fruit is  " + isFresh);
	
	}

	public String toString() {
		return "FruitBasket [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}
	
	public String Taste() {
		return "No specific Taste";
	}
	
	
}
