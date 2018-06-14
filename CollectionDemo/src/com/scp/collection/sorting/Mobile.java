package com.scp.collection.sorting;



public class Mobile implements Comparable<Mobile>{
	
	private int mobId;
	private String mobName;
	private long price;
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Mobile(int mobId, String mobName, long price) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nMobile [mobId=" + mobId + ", mobName=" + mobName + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Mobile o) {
		//return this.mobId-o.mobId;  //ascending order
		//return -(this.mobId-o.mobId);  //decending order
		//return (int) (this.price-o.price);
		
		//return this.mobName.compareTo(o.mobName);
		
		
		//Name n Price based sorting
		int tmp=this.mobName.compareTo(o.mobName);
		if(tmp==0)
			tmp=(int) (this.price-o.price);
		return tmp;
	}
	
	

}
