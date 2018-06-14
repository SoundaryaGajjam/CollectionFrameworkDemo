package com.scp.collection;

import java.util.*;

import sun.awt.image.ImageWatched.Link;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String>list1=new LinkedList<>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		list1.add("Orange");
		list1.add(2, "Watermalen");//inserting element at specified location
		
		list1.addFirst("Custeredapple");//inserting at 1st position
		list1.addLast("Strawbwery");//inserting at last position
		
		list1.offerFirst("Green");//insert the specified element at the front of a linked list 
		list1.offerLast("Black");//insert the specified element at the end of a linked list
		
		System.out.println("\nElements in the list : "+list1);
		System.out.println("\nIterate the list frm specified location : ");
		print(list1);
		System.out.println("\nElements in reverse order : ");
		Iterator<String>itr=list1.descendingIterator();
		while(itr.hasNext())
			System.out.print("   "+itr.next());
		
		String str;
		str=list1.getFirst();
		System.out.println("\nget the 1st occurance of specified element : "+str);
		str=list1.getLast();
		System.out.println("\nget the last occurance of specified element : "+str);
		
		System.out.println("\nDisplay the elements & index : ");
		for(int i=0;i<list1.size();i++)
			System.out.println("Elements at index "+i+" is : "+list1.get(i));
		
		list1.remove(2);
		System.out.println("\nRemove element at specified index : "+list1);
		list1.removeFirst();
		System.out.println("\nRemove element at 1st index : "+list1);
		list1.removeLast();
		System.out.println("\nRemove element at last index : "+list1);
		
		//list1.removeAll(list1);
		//System.out.println("\nAfter removing all elements : "+list1);
		
		System.out.println("\nSwapping 1st element with 4th element : ");
		Collections.swap(list1, 1, 4);
		System.out.print("  "+list1);
		
		System.out.println("\nSorting the elemnts : ");
		Collections.sort(list1);
		System.out.print("  "+list1);
		
		System.out.println("\nAfter shuffle : ");
		Collections.shuffle(list1);
		System.out.println(" "+list1);
		
		System.out.println("\nCterate clone of the list : ");
		LinkedList<String>li=new LinkedList<>();
			li=	(LinkedList<String>) list1.clone();
			System.out.println("  "+li);
		
		/*System.out.println("\nJoin 2 list : ");
		list1.addAll(li);
		System.out.println("  "+list1);*/
		
		System.out.println("\nRemove & return the 1st element frm list : ");
		System.out.println("  "+list1.removeFirst());
		
		System.out.println("\nRetive but does not remove 1st element  frm list : ");
		System.out.println("  "+list1.peekFirst());
		
		
		System.out.println("\nRetrive & but does not remove last element frm list : ");
		System.out.println("  "+list1.peekLast());
		
		System.out.println("\nCheck paricular element exist in list : ");
		System.out.println(list1.contains("Apple"));
		
		
		System.out.println("\nConvert linked list into ArrayList : ");
		List<String> al=new ArrayList<>(list1);
		System.out.println("  "+al);
		
		System.out.println("\nCompare teo list : ");
		LinkedList<String>li1=new LinkedList<>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		li1.add("Pink");
		li1.add("White");
		
		LinkedList<String>obj=new LinkedList<>();
		//System.out.println(li);
		for (String item : li) 
			obj.add(list1.contains(item) ? "yes" : "No");
		System.out.print("  "+obj);	
		
		System.out.println("\nCheck list is empty or not : "+list1.isEmpty());
		
		System.out.println("\nReplace an element into list : ");
		list1.set(2,"Yellowwww");
		System.out.print("  "+list1);
		
		
		
	}

	
	private static void print(List list1) {
		ListIterator litr=list1.listIterator();
		//Iterator<String>litr=((LinkedList<String>) list1).descendingIterator();
		
		//ListIterator litr=list1.listIterator(2); 	//Iterate the list frm specified location
		while(litr.hasNext())
			System.out.print("   "+litr.next());
		
	}
	
	

}
