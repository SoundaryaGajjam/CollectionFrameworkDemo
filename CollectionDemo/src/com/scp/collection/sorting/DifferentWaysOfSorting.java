package com.scp.collection.sorting;

import java.util.Comparator;

/*public class DifferentWaysOfSorting {

}*/


class IdBasedSorting implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		return o1.getMobId()-o2.getMobId();
	}
	
	
}

class NameBasedSorting implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		return o1.getMobName().compareTo(o2.getMobName());
	}
	
}
class PriceBasedSorting implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		return (int) (o1.getPrice()-o2.getPrice());
	}
	
}
class NameNPriceBasedSorting implements Comparator<Mobis>{

	@Override
	public int compare(Mobis o1, Mobis o2) {
		int tmp=o1.getMobName().compareTo(o2.getMobName());
		if(tmp==0)
			tmp=(int) (o1.getPrice()-o2.getPrice());
		return tmp;
	}
	
}
