package com.scp.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
	public static void main(String[] args) {
		
		//sortUsingComparable();
		sortUsingComparator();
		//sortUsingAnnonymousImpl();
		//sortUsingAnnoyButDomainCls();
		
		
		
	}

	private static void sortUsingAnnoyButDomainCls() {
		List<Mobis>listOfMobis=getMobisObject();
		System.out.println("No. of mobiles : "+listOfMobis.size());
		
		System.out.println("Sorting based on id : ");
		Collections.sort(listOfMobis, MobiUtil.idBased);
		System.out.println(listOfMobis);
		
		System.out.println("Sorting Based on id & name : ");
		Collections.sort(listOfMobis, MobiUtil.idNNameBased);
		System.out.println(listOfMobis);
	}

	private static void sortUsingAnnonymousImpl() {
		List<Mobis>listOfMobis=getMobisObject();
		System.out.println("No. of mobiles : "+listOfMobis.size());
		//System.out.println(listOfMobis);
		
		Comparator<Mobis> IdBasedSort = new Comparator<Mobis>() {

			@Override
			public int compare(Mobis o1, Mobis o2) {
				return o1.getMobId()-o2.getMobId();
			}
		};
		
		System.out.println("Sorting based on Id : ");
		Collections.sort(listOfMobis,IdBasedSort);
		System.out.println(listOfMobis);
		
		Comparator<Mobis>NameNIdBasedSort =new Comparator<Mobis>() {

			@Override
			public int compare(Mobis o1, Mobis o2) {
				int tmp=o1.getMobName().compareTo(o2.getMobName());
				if(tmp==0)
					tmp=o1.getMobId()-o2.getMobId();
				return tmp;
			}
		};
		
		System.out.println("Sorting based on Name & Id : ");
		Collections.sort(listOfMobis, NameNIdBasedSort);
		System.out.println(listOfMobis);
		
		Comparator<Mobis>priceBasedSort = new Comparator<Mobis>() {

			@Override
			public int compare(Mobis o1, Mobis o2) {
				return (int) (o1.getPrice()-o2.getPrice());
			}
		};
		System.out.println("Sorting Based on Price : ");
		Collections.sort(listOfMobis,priceBasedSort);
		System.out.println(listOfMobis);
		
		
	}

	private static void sortUsingComparator() {
		List<Mobis> listOfMobis=getMobisObject();
		System.out.println("No. of Mobiles : "+listOfMobis.size());
		//System.out.println(listOfMobis);
		
		/*System.out.println("Sorting Based on Id : ");
		Collections.sort(listOfMobis,new IdBasedSorting());
		System.out.println(listOfMobis);*/
		
		/*System.out.println("Sorting based on Name : ");
		Collections.sort(listOfMobis, new NameBasedSorting());
		System.out.println(listOfMobis);*/
		
		/*System.out.println("Sorting Based on Price : ");
		Collections.sort(listOfMobis,new PriceBasedSorting());
		System.out.println(listOfMobis);*/
		
		System.out.println("Sorting Based on Name & Price : ");
		Collections.sort(listOfMobis, new NameNPriceBasedSorting());
		System.out.println(listOfMobis);
		
	}

	private static List<Mobis> getMobisObject() {
		Mobis m1 = new Mobis(11,"Samsung",20000);
		Mobis m2 = new Mobis(122,"iPhone",80000);
		Mobis m3 = new Mobis(346,"Samsung",10000);
		Mobis m4 = new Mobis(354,"LG",12000);
		Mobis m5 = new Mobis(57,"Vivo",7000);
		Mobis m6 = new Mobis(64,"Nokia",25000);
		Mobis m7 = new Mobis(64,"Nokia",333333);
		Mobis m8 = new Mobis(64,"Nokia",25000);
		
		List<Mobis> listOfMobis = new ArrayList<Mobis>();
		listOfMobis.add(m1);
		listOfMobis.add(m2);
		listOfMobis.add(m3);
		listOfMobis.add(m4);
		listOfMobis.add(m5);
		listOfMobis.add(m6);
		listOfMobis.add(m7);
		listOfMobis.add(m8);
		return listOfMobis;
		
	}

	private static void sortUsingComparable() {
		Mobile m1 = new Mobile(1102,"LG",20000);
		Mobile m2 = new Mobile(122,"iPhone",80000);
		Mobile m3 = new Mobile(346,"MI",10000);
		Mobile m4 = new Mobile(354,"LG",12000);
		Mobile m5 = new Mobile(57,"Vivo",7000);
		Mobile m6 = new Mobile(64,"Nokia",25000);
		
		List<Mobile> listOfMobiles = new ArrayList<Mobile>();
		listOfMobiles.add(m1);
		listOfMobiles.add(m2);
		listOfMobiles.add(m3);
		listOfMobiles.add(m4);
		listOfMobiles.add(m5);
		listOfMobiles.add(m6);
		
		System.out.println("No. of Mobiles : "+listOfMobiles.size());
		/*System.out.println("!!!!!! Iterating Mobiles !!!!!!!!!!");
		for (Mobile item : listOfMobiles) 
			System.out.print(item);*/
			
		//System.out.println("Sorting basded on id : ");
		// System.out.println("Sorting basded on price : ");
		//System.out.println("Sorting Based on Name : ");
		
		System.out.println("Sorting Based on Name n Price : ");
		Collections.sort(listOfMobiles);
		System.out.println(listOfMobiles);
		
		
			
	}

}
