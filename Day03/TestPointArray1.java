package Tester;

import com.app.geometry.*;
import java.util.Scanner;

public class TestPointArray1 {
		public static void main(String[] args) {
			
			int size, choice=0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Number of Point you have to entered - ");
			Point2D[] points=new Point2D[sc.nextInt()];
			
			for(int i=0; i<points.length; i++)
			{
				points[i] = new Point2D(); 
				points[i].accept();
			}
			
					System.out.println("1. Display Specific point");
					System.out.println("2. Display x, y co-ordinates of all point");
					System.out.println("3. Distance between two  points");
					System.out.println("4. Exit");
					choice = sc.nextInt();
					
					switch(choice)
					{
						
					case 1 : 
						int index;
						Point2D sp = new Point2D();
						System.out.println("Enter index to print x & y co-ordinate - ");
						index = sc.nextInt();
						
							if(index < points.length)
							{
								points[index].displayPoint();
							}
							else 
							{
								System.out.println("Error");
							}
					
						break;
					
					case 2 :
						for(int i=0; i<points.length; i++)
						{
							points[i].displayPoint();
						}
						
					case 3 : 
						int i,j;
						System.out.println("Enter index of start and end point - ");
						i = sc.nextInt();
						j = sc.nextInt();
						if(i<points.length  && j<points.length)
						{
							points[i].distance(points[j]);
						}
						break;
						
					case 4 : 
						System.out.println("Thank you for using");
					}
		}
			
	}


