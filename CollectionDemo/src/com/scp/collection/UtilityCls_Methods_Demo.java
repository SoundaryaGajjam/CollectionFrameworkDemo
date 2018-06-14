package com.scp.collection;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class UtilityCls_Methods_Demo {
	public static void main(String[] args) {
		int []arr={10,20,30,40,50};
		arr=Arrays.copyOf(arr,arr.length+20);
		System.out.println(arr.length);
		
		List<Integer> list=new ArrayList<>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
		
		Collections.synchronizedList(list);	
		
		/*List<Integer> list1=new ArrayList<>();
	list1=Collections.unmodifiableList(list);
		list1.add(55);
		
		System.out.println(list1);
		System.out.println(list1.size());
		*/
		
	}

}
