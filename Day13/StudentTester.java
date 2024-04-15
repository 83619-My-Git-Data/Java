package com.sunbeam.collimp;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class StudentTester {
	public static void main(String[] args) {

		// List<Employee> empList = new ArrayList<>();
		// List<Employee> empList = new Vector<>();
		List<Student> studList = new LinkedList<>();
		studList.add(new Student(5, "abc", 80));
		studList.add(new Student(3, "pqr", 60));
		studList.add(new Student(2, "uvw", 50));
		studList.add(new Student(4, "lmn", 70));
		studList.add(new Student(1, "xyz", 78));

		System.out.println("Before Sort - ");
		for (Student student : studList)
			System.out.println(student);

		System.out.println("After Natural Ordering --> ");
		Collections.sort(studList);
		for (Student student : studList)
			System.out.println(student);

		System.out.println("Sorting on stud name -->");

		class StudNameComparator implements Comparator<Student> {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		}

		Comparator<Student> StudNameComparator = new StudNameComparator();
		Collections.sort(studList, StudNameComparator);

		for (Student student : studList)
			System.out.println(student);

		Student stud = new Student();
		stud.setRollno(3);
		
		if (studList.contains(stud))
			System.out.println("Student exists");
		else
			System.out.println("Student not found");

	
	
	
}
}
