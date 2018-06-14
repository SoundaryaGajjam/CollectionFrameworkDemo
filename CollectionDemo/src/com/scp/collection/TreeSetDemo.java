package com.scp.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {
	public static void main(String[] args) {
		
		Student s1=new Student(10, "A");
		Student s2=new Student(10, "B");
		Student s3=new Student(20, "C");
		Student s4=new Student(30, "A");
		Student s5=new Student(40, "D");
		
		
		
		Comparator<Student> nameNid =new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				/*int tmp=o1.getStudName().compareTo(o2.getStudName());
				if(tmp==0)
					tmp=o1.getStudId()-o2.getStudId();
				return tmp;*/
				
				return ( (o1.getStudName().compareTo(o2.getStudName())==0) ? (o1.getStudId()-o2.getStudId()) : (o1.getStudName().compareTo(o2.getStudName())) );
				
			}
		};
		
		TreeSet<Student>t=new TreeSet<>(nameNid);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		System.out.println("No. of Students : "+t.size());
		//System.out.println(t);
		//System.out.println(t.ceiling(s2));
		
		Iterator<Student>itr=t.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//TreeSet<Integer> treeSet = new TreeSet<>();
		//treeSet.add(null);
		/*treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		
		treeSet.add(40);
		treeSet.add(40);*/
		//System.out.println("No. of int Value : "+treeSet.size());
	}

	

}

