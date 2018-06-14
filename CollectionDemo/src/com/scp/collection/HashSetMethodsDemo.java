package com.scp.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class HashSetMethodsDemo {
	public static void main(String[] args) {
		
		//adding elements into hashset
		HashSet<String>hset=new HashSet<>();
		hset.add("black");
		hset.add("pink");
		hset.add("yellow");
		hset.add("white");
		hset.add("blue");
		
		//iterating
		Iterator<String>itr=hset.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Size of hashset : "+hset.size());
		System.out.println("Is hashset empty ? "+hset.isEmpty());
		//System.out.println(hset.removeAll(hset));
		//hset.clear();
		//System.out.println("After remove all elements  : "+hset.size());
		
		//to clone hashset into another hashset
		HashSet<String>hClone=(HashSet<String>) hset.clone();
		System.out.println("Afert cloning : ");
		System.out.println(hClone);
		
		//to convert hashset into array
		String []str=new String[hset.size()];
		hset.toArray(str);
		for (String item : str) 
			System.out.print("   "+item);
		
		//converting hashSet into treeSet
		TreeSet<String>tSet=new TreeSet<>(hset);
		System.out.println("\nTreeSet elements : ");
		for (String item : tSet) 
			System.out.print("  "+item);
		
		//converting hashset into ArrayList/List
		System.out.println("\nArraylist elements :");
		ArrayList<String>arrList=new ArrayList<>(hset);
		ListIterator<String>litr=arrList.listIterator();
		//arrList.add("Brown");//ConcurrentModificationException ----Fail fast
		while(litr.hasNext())
			System.out.print("   "+litr.next());
		
		//comparing 2 hashset
		
		for (String item : arrList) 
			System.out.println((hset.contains(item)? "yes":"no"));
			
		HashSet<String> hSet1=new HashSet<>();
		hSet1.add("Red");
		hSet1.add("orange");
		hSet1.add("black");
		hSet1.add("yellow");
		
		System.out.println(" to compare two sets and retain elements which are same on both sets : ");
		hset.retainAll(hSet1);
		System.out.println(hset);
		
		
			
		
		
		
		
	}
}
