package com.app.fruits;

import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int size;
		System.out.println("Enter the size of basket ");
		size=sc.nextInt();
		FruitBasket []basket = new FruitBasket[size];
		int index = 0;
		int choice;
		do {
		
		System.out.println("Enter your choice ");
		System.out.println("0. Exit ");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket");
		System.out.println("5. Display name color taste and weight of all fresh fruit");
		System.out.println("6. Display tastes of all stale fruits in basket");
		System.out.println("7. Mark a fruit as stale" );
		System.out.println("8. Mark all sour fruits stale ");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 0:
			break;
		case 1:
			basket[index]= new Mango();
			basket[index].accept();
			index++;
			break;
		case 2:
			basket[index]=new Orange();
			basket[index].accept();
			index++;
			break;
		case 3:
			basket[index]=new Apple();
			basket[index].accept();
			index++;
			break;
		case 4:
			for (FruitBasket fruitBasket : basket) {
				if(fruitBasket != null)
				{
					System.out.println(fruitBasket.getName());
				}
			}
				break;
		 case 5:
			 for (FruitBasket fruitBasket : basket) {
				 
				 if(fruitBasket != null)
					{
						System.out.println(fruitBasket.toString());
						System.out.println(fruitBasket.Taste());
						System.out.println(fruitBasket.isFresh());
					}
				 
				
			}
			 break;
		 case 6:
			 for (FruitBasket fruitBasket : basket) {
				
				 if(fruitBasket.isFresh() == false)
				 {
					 System.out.println(fruitBasket.Taste());
				 }
				 
				 
			}
			 break;
		 case 7:
			 
			 System.out.println("Enter the index u want not fresh ");
			 int i;
			 i=sc.nextInt();
			 if(i<index && i>=0)
			 {
			    basket[i].setFresh(false);
			 }
			 else
			 System.out.println("Invalid index");
			 break;
			 
		 case 8:
			 for (FruitBasket fruitBasket : basket) {
				if(fruitBasket.Taste()== "Sour" )
				{
					fruitBasket.setFresh(false);	
				}
			}	
			break;
		
	}
		}while(choice!=0);
}
}