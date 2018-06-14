package com.scp.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class CollectionIterations {

	public static void main(String[] args) {
		HashMap<Student,String>noOfStud=getDummyData(10);
		System.out.println(noOfStud);
		
		String value="Person5";
		Student s1=retriveKeyBasedOnValue(noOfStud,value);
		System.out.println(s1);
		
		List list=new ArrayList<>(getDummyList(10));
		usingIterator(list);
		usingListIterator(list);
		
		Vector v=new Vector<>(list);
		
		usingIterator(v);
		usingListIterator(v);
		
		Set st=noOfStud.keySet();
		usingIterator(st);
		
		HashSet<Student> hset=new HashSet<>(getDummyData(5).keySet());
		usingIterator(hset);
		
		LinkedHashSet linkset=new LinkedHashSet<>(hset);
		usingIterator(linkset);
		
		usingEnumeration(v);
		//usingEnumeration(list);
		
		/*System.out.println("::::::::::::::::::::::::::");
		Hashtable ht=new Hashtable();
		for(int i=1;i<=5;i++)
			ht.put(i,"LLLLL");
		
		usingEnumeration(ht);
		
		System.out.println(ht);
		*/
		
		
	}

	private static void usingEnumeration(Object ob) {
		System.out.println("\n\n***** Using Enumeration : "+ob.getClass()+" ******\n");
		Enumeration em=null;
		if(ob instanceof Vector){
			Vector v=(Vector) ob;
			em=v.elements();
			while(em.hasMoreElements())
				System.out.println(em.nextElement());
			
		}
		else if(ob instanceof Hashtable){
			Hashtable ht=(Hashtable) ob;
			em=ht.elements();
			while(em.hasMoreElements())
				System.out.println(em.nextElement());
		}
		else
			System.out.println("Object can not be iterated using enumeration as not a legacy cls...");
		
		
	}

	private static void usingListIterator(List list) {
		System.out.println("\n\n***** Using Iterator : "+list.getClass()+" ******\n");
		ListIterator litr=list.listIterator();
		while(litr.hasNext())
			System.out.print("  "+litr.next());
		
	}

	private static void usingIterator(Collection list) {
		System.out.println("\n\n***** Using ListIterator : "+list.getClass()+" ******\n");
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.print("  "+itr.next());
		
	}

	private static List getDummyList(int noOfObj) {
		List list=new ArrayList<>();
		for(int i=1;i<=noOfObj;i++)
			list.add(i);
		return list;
		
	}

	private static Student retriveKeyBasedOnValue(HashMap<Student, String> noOfStud, String value) {

		Set<Entry<Student,String>>entries=noOfStud.entrySet();
		Iterator<Entry<Student,String>>itr=entries.iterator();
		while(itr.hasNext()){
			Entry<Student, String>obj=itr.next();
			if(obj.getValue().equals(value))
				return obj.getKey();
		}
		return null;
	}

	private static HashMap<Student,String> getDummyData(int noOfStud) {
		HashMap<Student, String>hmp=new HashMap<>();
		for(int i=1;i<=noOfStud;i++)
			hmp.put(new Student(i, "Radha"+i),"Person"+i);
		
		hmp.put(new Student(1,"Radha1"),"Person21");
		hmp.put(new Student(8,"Radha8"),"Person28");
		hmp.put(new Student(12,"Radha12"),"Person12");
		
		System.out.println(hmp.get(new Student(1,"Radha1")));
		//System.out.println(hmp);
		
		
		 
		 
		 System.out.println(hmp.get(new Student(8, "Radha8")));
		
		System.out.println("No. of Students (Hashmap size) : "+hmp.size());
		
		return hmp;
	}
}
