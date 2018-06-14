package com.scp.collection.sorting;

import java.util.Comparator;

public  class MobiUtil {
	 
	static Comparator<Mobis> idBased=new Comparator<Mobis>() {

		@Override
		public int compare(Mobis o1, Mobis o2) {
			
			return o1.getMobId()-o2.getMobId();
		}
	};
	
	static Comparator<Mobis> idNNameBased=new Comparator<Mobis>() {

		@Override
		public int compare(Mobis o1, Mobis o2) {
			int tmp=o1.getMobId()-o2.getMobId();
			if(tmp==0)
				tmp=o1.getMobName().compareTo(o2.getMobName());
			return tmp;
		}
		
	};

}
