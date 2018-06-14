package com.scp.collection;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		ArrayList<String>list1=new ArrayList<>();
		
		
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		
		System.out.println("\nTo clone an arraylist to another arraylist : ");
		ArrayList<String>arr=(ArrayList<String>) list1.clone();
		System.out.println(arr);
		
		System.out.println("\nComapre to list (Both list r equal) : ");
		System.out.println(list1.containsAll(arr));
		
		
		list.add("Red");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		list.add("Green");
		list.add("Yellow");
		list.add("Blue");
		
		System.out.println("List of Colours : \n"+list);
		System.out.println("\nPrint the list using iterator : ");
		printList(list);
		System.out.println("\nInsrting at 1st position : ");
		list.add(0, "Orange");
		printList(list);
		System.out.println("\nRetrive the element at specified index : \n"+list.get(2));
		System.out.println("\nUpdate the specific element : ");
		list.set(1, "Voilet");
		printList(list);
		System.out.println("\nRemove the elemente from specified location : ");
		list.remove(3);
		printList(list);
		System.out.println("\nSearch an element in list :");
		System.out.println(list.contains("Red"));
		System.out.println("\nSorting list : ");
		Collections.sort(list);
		printList(list);
		
		
		System.out.println("\nCopy the list into another list : ");
		Collections.copy(list, list1);
		printList(list);
		
		System.out.println("\nshuffle elements in array list : ");
		Collections.shuffle(list);
		printList(list);
		
		System.out.println("\nReverse element in the list : ");
		Collections.reverse(list1);
		printList(list1);
		
		System.out.println("\nSwapping 1st element with 4th element : ");
		Collections.swap(list1, 1, 4);
		printList(list1);
		
		System.out.println("\nExtract the portion of list : ");
		List l1=new ArrayList<>();
		l1=list1.subList(1, 4);
		printList(l1);
		
		
		
		System.out.println("\nArray list size : "+list1.size());
		list1.trimToSize();
		printList(list1);
		System.out.println("\nArray list size : "+list1.size());
		
		
		System.out.println("\nJoin 2 list : ");
		list1.addAll(list);
		printList(list1);
		System.out.println("\nIncrease the size of ArrayList : ");
		ArrayList<Integer>al=new ArrayList<>(3);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(60);//internally uses Arrays.copyOf()
		System.out.println("  "+al.size());
		al.ensureCapacity(5);
		al.add(40);
		al.add(50);
		System.out.println("\nEnsure Capacity : "+al);
		
		
		System.out.println();
		System.out.println("\nPrint the list using position(index) of element : ");
		for (int i=1;i<list1.size();i++)
			System.out.print("   "+list1.get(i));
		
		
		System.out.println("\nRemove all elements from list : ");
		//list1.removeAll(list1);
		list1.clear();
		printList(list1);
		System.out.println("\nCheck list is empty or not : ");
		System.out.print(list1.isEmpty());
		
		
		
		
		
		
	}

	private static void printList(List<String> list) {
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
			System.out.print("  "+itr.next());
		
	}

}
