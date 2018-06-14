package com.scp.collection;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Student s1=new Student(10, "A");
		Student s2=new Student(10, "B");
		Student s3=new Student(20, "C");
		Student s4=new Student(30, "A");
		Student s5=new Student(40, "D");
		Student s6=s2;
		
		
		StudentValue v1=new StudentValue(80.52,'A');
		StudentValue v2=new StudentValue(55.52,'C');
		StudentValue v3=new StudentValue(65.52,'B');
		StudentValue v4=new StudentValue(35.88,'C');
		StudentValue v5=new StudentValue(99.2,'A');
		
		HashMap<Student, StudentValue>hmap=new HashMap<>();
		System.out.println(hmap.put(s1, v1));
		System.out.println(hmap.put(s2, v2));
		System.out.println(hmap.put(s3, v3));
		System.out.println(hmap.put(s4, v4));
		System.out.println(hmap.put(s5, v5));
		System.out.println(hmap.put(s6, v4));
		
		System.out.println("No. of Student : "+hmap.size());
		System.out.println(hmap);
		
	}

}

class StudentValue{
	private double percentage;
	private char grade;
	public StudentValue(double percentage, char grade) {
		super();
		this.percentage = percentage;
		this.grade = grade;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return " :  StudentValue [percentage=" + percentage + ", grade=" + grade + "]";
	}
	
	
}
