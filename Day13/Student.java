package com.sunbeam.collimp;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollno;
	String name;
	double perc;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, double perc) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.perc = perc;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", perc=" + perc + "]";
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}


}
