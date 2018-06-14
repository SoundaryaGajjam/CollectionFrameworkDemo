package com.scp.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class UseOfCursors {
	public static void main(String[] args) {
		/*HashSet<Integer> hset=new HashSet<>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(10);
		hset.add(20);
		hset.add(40);
		hset.add(50);
		System.out.println("Size of Integer : "+hset.size());
		System.out.println(hset);
		printCollection(hset);
		
		HashSet<String>hsetstr=new HashSet<>();
		hsetstr.add("Kiran");
		hsetstr.add("Sneha");
		hsetstr.add("Ashu");
		hsetstr.add("Anu");
		hsetstr.add("Kiran");
		hsetstr.add("Ashu");
		System.out.println("\nSize of String : "+hsetstr.size());
		System.out.println(hsetstr);
		printCollection(hsetstr);
		
		Laptop l1=new Laptop(101,"Dell");
		Laptop l2=new Laptop(120,"HP");
		Laptop l3=new Laptop(130,"MAC");
		Laptop l4=new Laptop(101,"Dell");
		HashSet<Laptop> hsetlappy=new HashSet<>();
		hsetlappy.add(l1);
		hsetlappy.add(l2);
		hsetlappy.add(l3);
		hsetlappy.add(l4);
		System.out.println("Numbers of laptops : "+hsetlappy.size());
		System.out.println(hsetlappy);
		printCollection(hsetlappy);
		*/
		
		
		
		
		HashMap<Laptop,String> hmap =new HashMap<>();
		Laptop l1=new Laptop(101,"Dell");
		Laptop l2=new Laptop(120,"HP");
		Laptop l3=new Laptop(130,"MAC");
		Laptop l4=new Laptop(150,"MAC Mini");
		Laptop l5=l3;
		
		hmap.put(l1,"X1");
		hmap.put(l2,"Y1");
		hmap.put(l3,"Z1");
		hmap.put(l4,"X1");
		//hmap.put(l5,"W1");
		
		System.out.println("Size of laptop : "+hmap.size());
		//System.out.println(hmap);
		
		//Vector<Object> vtr=new Vector<>(hset);
		System.out.println("******  Using normal for loop ******");
		for(int i=0;i<hmap.size();i++)
			//System.out.println(hmap(i));
			System.out.print("  " +hmap.get(i));
		
		//printCollectionMap(hmap);
		
		
		
	}

	private static void printCollectionMap(HashMap<Laptop, String> hmap) {
		
		System.out.println(":::::::Using KeySet ::::::::");
		Set<Laptop>setofKeys=hmap.keySet();
		Vector<Laptop>vtr=new Vector<>(setofKeys);
		Enumeration<Laptop>em=vtr.elements();
		while(em.hasMoreElements()){
			Laptop l1=em.nextElement();
			System.out.println("Keys : "+l1+" : Values :"+hmap.get(l1));
		}
		
		/*ListIterator<Laptop>itr=vtr.listIterator();
		while(itr.hasNext()){
			Laptop obj=itr.next();
			String val=hmap.get(obj);
			System.out.println("Key : "+obj+"  :Value : "+val);
			
		}*/
		/*Iterator<Laptop>itr=setofKeys.iterator();
		while(itr.hasNext()){
			Laptop obj=itr.next();
			String val=hmap.get(obj);
			System.out.println("Key : "+obj+"  :Value : "+val);
			
		}*/
		
		System.out.println("^^^^^^^^ USing Values ^^^^^^^^");
		Collection<String>listOfValue=hmap.values();
		List<String>list=new ArrayList<>(listOfValue);
		ListIterator<String>litr=list.listIterator();
		while(litr.hasNext())
			System.out.println("Values : "+litr.next());
			
		
		System.out.println("~~~~~~~~~ USing EntrySet ~~~~~~~~~");
		Set<Entry<Laptop,String>>entries=hmap.entrySet();
		Iterator<Entry<Laptop,String>>itr1=entries.iterator();
		while(itr1.hasNext()){
			Entry<Laptop,String>obj1=itr1.next();
			System.out.println(" Key : "+obj1.getKey()+" Value : "+obj1.getValue());
		
		}
		
		
	}

	/*private static void printCollection(HashSet hset) {

		Vector<Object> vtr=new Vector<>(hset);
		System.out.println("******  Using normal for loop ******");
		for(int i=0;i<vtr.size();i++)
			System.out.print("  " +vtr.get(i));
		
		System.out.println("\n######## Using for each loop #########");
		for (Object item : hset) 
			System.out.print("  "+item);
		
		System.out.println("\n$$$$$$ Using Iterator $$$$$$$$");
		Iterator<Object>itr =hset.iterator();
		while(itr.hasNext())
			System.out.print("  "+itr.next());
		
		
		System.out.println("\n%%%%%% Using List Iterator %%%%%%%");
		ListIterator<Object>litr=vtr.listIterator();
		while(litr.hasNext())
			System.out.print("  "+litr.next());
		
		System.out.println("\n::::::::Using Enumaration ::::::::");
		Enumeration<Object>opt=vtr.elements();
		while(opt.hasMoreElements())
			System.out.print("  "+opt.nextElement());
		
		System.out.println("1st way using lambda : ");
		hset.forEach(System.out::println);
		System.out.println("2nd way using lambda : ");
		hset.forEach(item ->System.out.print("  "+item));
		System.out.println("\n3rd way using lambda : ");
		hset.forEach(new Consumer<Object>() {
			@Override
			public void accept(Object t) {
				System.out.print("  "+t);
			}
		});
	}*/
}
class Laptop{
	private int id;
	private String name;
	public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nLaptop [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}