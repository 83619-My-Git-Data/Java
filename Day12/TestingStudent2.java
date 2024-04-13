package Question2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.sunbeam.A2.Student;




public class TestingStudent2 {

	public static void main(String[] args) 
	{
		
Student s[]=new Student[5];
		
		s[0]= new Student(5,"Vita","Abhishek ",10);
		s[1]= new Student(1,"Kolhapur","Amit ",20);
		s[2]= new Student(2,"Kolhapur","Sanket ",15);
		s[3]= new Student(3,"Kadegaon","Avadhut ",25);
		s[4]= new Student(4,"Karad","JayKumar ",12);
		System.out.println("Before sorting ");
		for(Student elements:s)
		{
			System.out.println(elements);
		}
		System.out.println("------------------------------------------------------------------------");
		
		Arrays.sort(s);
		System.out.println("By defalut sorted array is ");
		for(Student elements:s)
		{
			System.out.println(elements);
		}
		System.out.println("---------------------------------------------------------------------------------");
		
		class sortOnCity implements Comparator<Student>
		{

			@Override
			public int compare(Student o1,Student o2) {
				int value =o1.city.compareTo(o2.city);
				return value;
			}
			
		}

		class sortOnname implements Comparator<Student>
		{

			@Override
			public int compare(Student o1,Student o2) {
				int value =o1.name.compareTo(o2.name);
				return value;
			}
			
		}
		
		class sortOnmarks implements Comparator<Student>
		{

			@Override
			public int compare(Student o1,Student o2) {
				int value =Double.compare(o2.marks, o1.marks);
				return value;
			}
			
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your choice ");
		System.out.println("Press 1 to sort based city in ascending order ");
		System.out.println("Press 2 to sort based marks in descending order ");
		System.out.println("Press 3 to sort based name in ascending order ");
		int choice=0;
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			
			Comparator<Student> sref=new sortOnCity();
			Arrays.sort(s, sref);
			for(Student elements:s)
			{
				System.out.println(elements);
			}
			
		}
		break;
		
		case 2:
		{
			Comparator<Student> sref=new sortOnmarks();
			Arrays.sort(s, sref);
			for(Student elements:s)
			{
				System.out.println(elements);
			}
			
		}
		break;
		
		case 3:
		{
			Comparator<Student> sref=new sortOnname();
			Arrays.sort(s, sref);
			for(Student elements:s)
			{
				System.out.println(elements);
			}
			
		}
		break;
		
		
		
		}
	}
}