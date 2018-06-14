package com.scp.collection;


import java.util.*;
import java.util.function.Consumer;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ListDemo {
	public static void printList(List<Integer> num){
	/*	System.out.println("using for loop : ");
	for(int i=0;i<num.size();i++){
		System.out.println(num.get(i));
	}
	
	System.out.println("using foreach loop : ");
	for(Integer itm:num)
		System.out.println(itm);
	
	System.out.println("using itreator : ");
	Iterator<Integer> itr=num.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());*/
	
	System.out.println("using ListIterator");
	ListIterator<Integer>litr=num.listIterator();
	//int count=0;
	while(litr.hasNext())
		{//count++;
		//System.out.println(
		System.out.println(litr.nextIndex());
	//System.out.println(count);
		litr.next();
		//count++;
		}
	}
		
	/*System.out.println("using consumer functional interface");
	num.forEach(new Consumer<Integer>() {
	@Override
		public void accept(Integer t) {
			System.out.println(t);
		}
	});
	
	System.out.println("using lamda expression");
	num.forEach(n -> System.out.println(n));
	
	System.out.println("using lambda expression ");
	num.forEach(System.out::print);
	}*/
	public static void main(String[] args) {
		
		
		
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(100);
		l1.add(88);
		l1.add(66);
		l1.add(100);
		//System.out.println(l1.indexOf(l1));
		
		printList(l1);
		
		/*System.out.println("before remove");
		
		l1.remove(new Integer(100));
		System.out.println("after remove");
		System.out.println(l1);
		//	l1.remove(2);
		System.out.println(l1);
		List<Integer> l2=new ArrayList<>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(100);
		l1.addAll(2, l2);
		System.out.println(l1);
		System.out.println(l1.indexOf(10));
		System.out.println(l1.lastIndexOf(10));
		System.out.println(l1.subList(1, 4));
		//l1.set(2, 5000);
*/		
		//System.out.println(l1.equals(l2));
		/*System.out.println(l1.retainAll(l2));
		System.out.println(l1);
		System.out.println(l1.containsAll(l2));*/
		
		/*Object [] ob=l1.toArray();
		//System.out.println(ob);
		for(Object o:ob)
			System.out.println(o);
		System.out.println(ob.length);*/
		/*System.out.println(l1.size());
		System.out.println("before remove");
		System.out.println(l1);
		l1.remove(new Integer(30));
		System.out.println("after remove");
		System.out.println(l1);
		//l1.clear();
		//removeAll(l);
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains(400));
		*/
		
		
		//System.out.println(l1);
		//System.out.println(l1.size());
		//System.out.println(l1.isEmpty());
		//System.out.println(l1.get(3));
		
		//l1.remove("50");
		
		//System.out.println(l1.remove("hi"));
		
		
		
		//l1.remove(null);
		//l1.removeAll(l1);
		//System.out.println(l1);
		
		/*List<Float> fl=new ArrayList<>();
		fl.add(52.3f);
		fl.add(98.66f);
		fl.add(44.5f);
		fl.add(45.22f);
		fl.add(1, 22.22f);
		System.out.println("Before remove");
		System.out.println(fl);
		fl.remove(98.66f);
		//fl.remove(1);   //index based
		System.out.println("after remove");
		System.out.println(fl);
		*/
		//List<String> l1=new ArrayList<>();
		/*List l2=new ArrayList<>();
		l2.add("abc");
		l2.add("xyz");
		l2.add("pqr");
		l2.add("lmn");
		l2.add("sss");
		
		System.out.println("list2"+l2);
		System.out.println("size of list2="+l2.size());
		
		//l1.addAll(l2);
		System.out.println("add all to list1"+l1);
		System.out.println("size of list1="+l1.size());
		
		l2.remove("lmn");
		System.out.println("list"+l2);
		//l2.remove("abc");
		//System.out.println(l2);
*/	}

}
