package com.scp.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class WeakNIdentityHashMapDemo {
	public static void main(String[] args) {
		
		Integer i=15;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		
		Student s1=new Student(10, "A");
		Student s2=new Student(20, "B");
		Student s3=s1;
		Student s4=new Student(20, "B");
		Student s5=null;
		//Student s6=null;
		
		/*HashMap<Student, String>hmap=new HashMap<>();
		System.out.println(hmap.put(s1, "Stud1"));
		System.out.println(hmap.put(s2, "Stud2"));
		System.out.println(hmap.put(s3, "Stud3"));
		System.out.println(hmap.put(s4, "Stud4"));
		System.out.println(hmap.put(s5, "Stud5"));
		System.out.println(hmap.put(s6, "Stud6"));
		System.out.println("Hmap size : "+hmap.size());
		System.out.println(hmap)*/;
		
		//WeakHashMap<Student, String> whmap=new WeakHashMap<>();
		
		IdentityHashMap<Student, String> whmap=new IdentityHashMap<>();
		System.out.println(whmap.put(s1, "Stud1"));
		System.out.println(whmap.put(s2, "Stud2"));
		System.out.println(whmap.put(s3, "Stud3"));
		System.out.println(whmap.put(s4, "Stud4"));
		System.out.println(whmap.put(s5, "Stud5"));
		//s5=null;
		
		
		
		//System.gc();
		
		System.out.println("Weak hashmap size : "+whmap.size());
		System.out.println(whmap);
	}
}
