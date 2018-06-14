package com.scp.collection;

import java.util.*;

public class Collection_Sort  {
	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		nums.add(55);
		nums.add(55555);
		nums.add(40);
		nums.add(4520);
		nums.add(5);
		nums.add(66);
		
		
		System.out.println("Unsorted List : "+nums);
		Collections.sort(nums);
		System.out.println("Sorted List : "+nums);
		
		Student s1=new Student(151, "Z");
		Student s2=new Student(55, "Z");
		Student s3=new Student(40, "V");
		Student s4=new Student(11, "S");
		Student s5=new Student(1, "A");
		
		List<Student>list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println("Unsorted : "+list);
		Collections.sort(list,new CompareById());
		System.out.println("Sorted : "+list);
		
		
		
		
		
	}
	
}
class CompareById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//return o1.getStudId()-o2.getStudId();
		return o1.getStudName().compareTo(o2.getStudName());
	}
	
}